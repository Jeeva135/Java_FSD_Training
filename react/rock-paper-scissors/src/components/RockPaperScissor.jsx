import React from "react";
import './RockPaperScissor.css'

const RockPaperScissor = () => {

    const [userScore,setUserScore] = React.useState(0)
    const [computerScore,setComputerScore]=React.useState(0)
    const [NoResult,setNoResult] = React.useState(0)
    const [message,setMessage] = React.useState('Lets play Rock Paper Scissors')
    const [messageStyle,setMessageStyle] = React.useState({color:'#f1fff1'})

    function computerChoice(){
        const options=['R','P','S']
        const choice=Math.floor(Math.random()*3)
        console.log(choice)
        return options[choice]
    }

    function play(userChoice){
        const machineChoice=computerChoice()
        const result=userChoice+machineChoice
        console.log(result)
        switch(result){
            case 'RS':
            case 'PR':
            case 'SP':
                setUserScore(userScore+1)
                setMessage("User Won")
                setMessageStyle({color:'lightgreen'})
                break;
            case 'SR':
            case 'RP':
            case 'PS':
                setComputerScore(computerScore+1)
                setMessage("Computer Won")
                setMessageStyle({color:'red'})
                break;
            default:
                setNoResult(NoResult+1)
                setMessage("Draw")
                setMessageStyle({color:'orange'})
                break;
        }
    }

    return(
        <div className="container">
            <div className="heading">
                <h1>Rock Paper Scissor</h1>
            </div>
            <div className="images">
                <button onClick={()=>play('R')}><img src="\src\assets\icon-rock.svg"></img></button>
                <button onClick={()=>play('P')}><img src="src\assets\icon-paper.svg"></img></button>
                <button onClick={()=>play('S')}><img src="src\assets\icon-scissors.svg"></img></button>
            </div>
            <div className="points">
                <div className="user">
                    <h3>User</h3>
                    <h2>{userScore}</h2>
                </div>
                <div className="draw">
                    <h3>Draw</h3>
                    <h2>{NoResult}</h2>
                </div>
                <div className="computer">
                    <h3>Computer</h3>
                    <h2>{computerScore}</h2>
                </div>
            </div>
            <div className="result" style={messageStyle}>
                <h3>{message}</h3>
            </div>
        </div>
    )
}

export default RockPaperScissor