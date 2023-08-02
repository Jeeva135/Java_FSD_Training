import React from "react";
import {ThemeProvider} from './ThemeProvider'

function Theme(){

    const {bgColor,textColor} = React.useContext(ThemeProvider);

    // const changeTheme=()=>{
    //     if(textColor==='dark'){
    //         setBgColor('dark')
    //         setTextColor('light')
    //     }
    //     else{
    //         setBgColor('light')
    //         setTextColor('dark')
    //     }
    // } 
    
    return(
        <div className="container">
            <div className="row">
                <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                    <button class="btn btn-primary me-md-2" type="button" onClick={()=>
                    {
                        if(textColor==='dark'){
                            setBgColor('dark')
                            setTextColor('light')
                        }
                        else{
                            setBgColor('light')
                            setTextColor('dark')
                        }
                    }
                    }  value={'Change'}>Change theme
                    </button>
                </div>
            </div>
            <h1 className={`text-${textColor}`}>Theme</h1>
            <p className={`text-${textColor}`}>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Odit, beatae. Esse modi ad similique eaque, deleniti itaque? Accusamus ullam, modi nesciunt repudiandae minus exercitationem ex earum incidunt veritatis hic similique?</p>
        </div>
    )
}
export default Theme