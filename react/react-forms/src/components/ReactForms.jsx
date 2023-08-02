import React from "react";

const ReactForms = () =>{
    //const [userName,setUserName] =React.useState("")
    //const [password,setPassword] =React.useState("")

    const [formData,setFormData] = React.useState({
        'username':'',
        'password':'',
        'edition':2,
        'robot':false
    })

    function valueChange(event){
        // if (event.target.id==='username'){
        //     setUserName(event.target.value);
        // }
        // else if (event.target.id==='password'){
        //     setPassword(event.target.value)
        // }


        // setFormData(
        //     function (prevFormData){
        //         return{
        //             ...prevFormData,
        //             [event.target.id]:event.target.value
        //         }
                
        //     }
        // )


        const {id,value,type,checked}=event.target
        setFormData(
            function(prevFormData){
                return{
                    ...prevFormData,
                    [id]: type==='checkbox' ? checked :value
                }
            }
        )


    }

    const login=()=>{
        console.log(formData);
    }

    return(
        <form>
            <div className="mb-3">
                <label htmlFor="username" className="form-label">Username</label>
                <input type="text" className="form-control" id='username' value={formData.username} onChange={valueChange}></input>
            </div>
            <div className="mb-3">
                <label htmlFor="password" className="form-label">Password</label>
                <input type="password" className="form-control" id='password' value={formData.password} onChange={valueChange}></input>
            </div>

            <select className="form-select" aria-label="Default select example" id="edition" onChange={valueChange} value={formData.edition}>
                <option selected>Edition</option >
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option>
            </select>

            <div className="form-check">
                <input className="form-check-input" type="checkbox" id="robot"
                checked={formData.robot} onChange={valueChange}/>
                <label className="form-check-label" htmlFor="robot">
                    I am not a Robot
                </label>
            </div>
            {
                formData.robot&&
             <button type="button" className="btn btn-primary" onClick={login}>Login</button>
            }
            
        </form>
    )
}
export default ReactForms