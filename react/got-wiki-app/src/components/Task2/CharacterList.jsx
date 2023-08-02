import React from 'react'
import axios from 'axios'
import { useEffect } from 'react'
import './CharacterList.css'

const CharacterList = () => {
  const[info,setInfo]=React.useState(null)

  useEffect(()=>{
    axios.get('https://thronesapi.com/api/v2/Characters').then((response)=>{
      console.log(response.data)
      setInfo(response.data)
    }).catch(err=>console.error(err))
  },[])

  return (
    info &&
    <div className="container card">
        <h3>Character List</h3>
        <div className="container card shadow">
          <div className="row border-bottom">
            <div className="col-3">
              <div className="text-muted fs-6">Id</div>
            </div>
            <div className="col-3">
              <div className="text-muted fs-6">Name</div>
            </div>
            <div className="col-6">
              <div className="text-muted fs-6">Name</div>
            </div>
          </div>
          {info.map((elements)=>
            <div className="row border-bottom p-2 element-list">
              <div className="col-4">{elements.id}</div>
              <div className="col-4">{elements.fullName}</div>
              <div className="col-4"><img className='img-fluid' style={{maxWidth:'50px'}} src={elements.imageUrl} alt="" /></div>
            </div>
          )}
        </div>
    </div>
  )
}

export default CharacterList