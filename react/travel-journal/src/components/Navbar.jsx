import React from 'react';
import './Style.css';
import InnerContent from './InnerContent'
function Navbar(){
    return(
        <> 
    <nav>
        <img src='src\assets\white-globe-png.png' id='icon'></img>
        <p id='nav-head'>my travel journal</p>
    </nav>
    <InnerContent />
   </>
    )
}
export default Navbar