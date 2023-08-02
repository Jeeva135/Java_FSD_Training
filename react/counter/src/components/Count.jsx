import React from 'react'
import './Count.css'

function Count() {

    const[counter,setCounter] = React.useState(0)
    
    function increment(){
        setCounter(counter+1)
    }
    function decrement(){
        setCounter(counter-1)
    }
    return(
        <div className='container'>
            <div className='heading'>
                <h1>Counter</h1>
            </div>
            <div className='buttons'>
                <button className='lft-button' onClick={decrement}>-</button>
                <h3 className='count'>{counter}</h3>
                <button className='rt-button' onClick={increment}>+</button>
            </div>
        </div>
    )
}

export default Count