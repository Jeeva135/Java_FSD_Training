import React from "react";
import { useEffect } from "react";
import './Characters.css'
import axios from "axios";

const Characters =()=>{
    const[characterInfo,setCharacterInfo]=React.useState(null)

    useEffect(()=>{
        axios.get('https://thronesapi.com/api/v2/Characters/0')
        .then((response)=>{
            console.log(response.data)
            setCharacterInfo(prevData=>response.data)
        }).catch((error)=>
            console.error(error)
        )
    },[])

    return(
        characterInfo&&
        <div className="container card shadow-lg">
            <div className="row">
                <div className="col-4">
                    <div className="image">
                    <img src={characterInfo.imageUrl} class="img-fluid" alt="#"/>
                    </div>
                </div>
                <div className="col-4">
                    <div className="row">
                        <div className="ps-4 pt-2"><h3>{characterInfo.fullName}</h3></div>
                    </div>
                    <div className="row mt-4">
                        <button type="button" className="btn btn-primary">Next Character</button>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Characters