import React from "react";
import './HappyCrew.css'

const HappyCrew = () =>{

    const [formData,setFormData] = React.useState({
        'name':'',
        'email':'',
        'cargo':false,
        'commuter':false,
        'touring':false
    })
    const submit = () =>{
        console.log(formData)
    }

    const saveData = (event) =>{
        const{type,id,checked,value} = event.target
        setFormData(
            prevData =>{
                return{
                    ...prevData,
                    [id]:type==='checkbox'?Namechecked:value
                }
            }
        )
    }

    return(
        <div className="container">
        <div className="form">
            <h1>Join the Happy Crew</h1>
            <h2>Get weekly ebike tips, news and discounts!</h2>
            <div className="form-group">
            <label htmlFor="name">First Name<span className="red">*</span></label><br/>
                <input type="text"
                    required
                    className="form-input"
                    name="name"
                    id="name"
                    autoComplete="off"
                    placeholder=""
                    value={formData.name}
                    onChange={saveData} />
            </div><br></br>
            <div className="form-group">
                <label htmlFor="email">Email<span className="red">*</span></label><br/>
                <input type="email"
                       required
                       className="form-input"
                       name="email"
                       id="email"
                       placeholder=""
                       value={formData.email}
                       onChange={saveData} />
            </div>
            <div className="form-group-radio">
                <label htmlFor="technologies"><b>What are you interested in?</b></label><br/>
                 <input type="checkbox"
                       className="form-input-radio"
                       name="technologies"
                       id="cargo"
                       checked={formData.cargo} 
                       onChange={saveData} />Cargo<br></br>

                <input type="checkbox"
                       className="form-input-radio"
                       name="technologies"
                       id="commuter"
                       checked={formData.commuter}
                       onChange={saveData} />Commuter<br></br>

                <input type="checkbox"
                       className="form-input-radio"
                       name="technologies"
                       id="touring"
                       checked={formData.touring}
                       onChange={saveData} />Touring

            </div>
            <button type="button" onClick={submit}>Subscribe</button><br></br>
            <hr></hr>

        </div>
    </div>
    )
}
export default HappyCrew