import React from 'react'

const RegisterForm = ({save,submit,data}) => {

  
  
  return (
    <div className="container card m-5">
        <h1 className="text-center">Registration Form</h1>
        <div className="container mb-3">
            <div className="row mb-3">
                <div className="col-12">
                    <label htmlFor="name" className="form-label">Name</label>
                    <input type="text" className="form-control" value={data.name} onChange={save} id="name"/>
                </div>
            </div>
            <div className="row mb-3">
                <div className="col-12">
                    <label htmlFor="email" className="form-labe ">Email</label>
                    <input type="text" className="form-control" value={data.email} onChange={save} id="email"/>
                </div>
            </div>
            <div className="row mb-3">
                <div className="col-12">
                    <label htmlFor="password" className="form-label">Password</label>
                    <input type="password" className="form-control" value={data.password} onChange={save} id="password"/>
                </div>
            </div>
            <div className="row mb-3">
                <div className="col-12">
                    <div className="form-check">
                        <input className="form-check-input" type="checkbox" checked={data.checked} onChange={save} id="checked"/>
                        <label className="form-check-label" htmlFor="flexCheckDefault">I agree to the terms and conditions</label>
                    </div>
                </div>
            </div>
            {data.checked &&  
            <div className="row mb-3">
                <div className="col-12">
                    <button type="button" className="btn btn-primary" onClick={submit}>Submit</button>
                </div>
            </div>}
        </div>
    </div>
    
  )
}


export default RegisterForm