import React from "react";
import './SimpleForm.css';

const SimpleForm = () =>{

    const[formData,setFormData]=React.useState({
        'fname':'',
        'lname':'',
        'uname':'',
        'city':'',
        'state':'choose',
        'zip':''
    })

    const submit=()=>{
        console.log(formData)
        alert(`
        First name:${formData.fname}
        Last name:${formData.lname}
        User name:${formData.uname}
        City:${formData.city}
        State:${formData.state}
        Zip:${formData.zip}
        `)
    }

    const saveData=(event)=>{
        const{value,id}=event.target
            setFormData(prevData=>{
                return{
                    ...prevData,
                    [id]:value
            }
        })
        
    }
    return(
        <div className="container card p-5">
            <div className="row">
                <div className="col-4">
                    <div class="mb-3">
                        <label htmlFor="fname" className="form-label">First name</label>
                        <input type="text" class="form-control" id="fname" onChange={saveData} value={formData.fname}/>
                    </div>
                </div>
                <div className="col-4">
                    <div class="mb-3">
                        <label htmlFor="lname" className="form-label">Last name</label>
                        <input type="text" class="form-control" id="lname" onChange={saveData} value={formData.lname}/>
                    </div>
                </div>
                <div className="col-4">
                    <div className="mb-3">
                        <label htmlFor="uname" className="form-label">Username</label>
                        <div className="input-group">                            
                            <span className="input-group-text" id="basic-addon1">@</span>
                            <input type="text" id="uname" className="form-control" aria-label="Username" aria-describedby="basic-addon1" onChange={saveData} value={formData.uname}></input>                        
                        </div>
                    </div>
                        
                </div>
            </div>
            <div className="row">
                <div className="col-6">
                    <div class="mb-3">
                        <label htmlFor="city" className="form-label">City</label>
                        <input type="text" class="form-control" id="city" onChange={saveData} value={formData.city}/>
                    </div>
                </div>
                <div className="col-3">
                    <div className="mb-3">
                    <label htmlFor="state" className="form-label">State</label>
                        <select class="form-select" id="state" aria-label="Default select example" onChange={saveData} value={formData.state}>
                            <option selected value="choose">Choose</option>
                            <option value="Kerala">Kerala</option>
                            <option value="Tamil nadu">Tamil Nadu</option>
                            <option value="Karnataka">Karnataka</option>
                        </select>
                    </div>
                </div>
                <div className="col-3">
                <div class="mb-3">
                        <label htmlFor="zip" className="form-label">Zip</label>
                        <input type="text" class="form-control" id="zip" onChange={saveData} value={formData.zip}/>
                    </div>
                </div>
            </div>
            <div className="row">
                <div className="col-3">
                    <button type="button" className="btn btn-primary" onClick={submit}>Submit form</button>
                </div>
            </div>
            
        </div>

    )
}
export default SimpleForm