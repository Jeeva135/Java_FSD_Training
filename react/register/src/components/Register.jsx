import axios from "axios";
import React from "react";
import RegisterForm from "./RegisterForm";
import Notification from "./Notification";

const Register = () =>{

    const[formData,setFormData]=React.useState({
        'name':'',
        'email':'',
        'password':'',
        'checked':false
    })

    const [userState,setUserState]=React.useState(false)
  
    const submitted=(event)=>{
        //console.log(formData);
        event.target.disabled=true
        const payload={
             'name' : formData.name,
             "email" : formData.email,
             "password" : formData.password
        }

        axios.post('http://localhost:3000/user',payload)
    .then(response=>{
        console.log(response.status)
        if (response.status === 201){
            setUserState(true)
        }
    })
    .catch(err=>{
        setUserState(false)
        console.error(err)
        }
    )
    }

    const saveData=(event)=>{
        const {id,type,checked,value}=event.target
        setFormData(prevData=>{
            return{
              ...prevData,
              [id]:type ==='checkbox'?checked:value
        }}
        )
    }

    return(
        <div className="d-flex justify-content-center align-items-center">
            {!userState?
            <RegisterForm
            save={saveData}
            submit={submitted}
            data={formData} />:
            <Notification
            status={userState}/>} 
        </div>
    )
}
export default Register