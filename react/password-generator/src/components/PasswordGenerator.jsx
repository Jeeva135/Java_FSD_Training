import React from "react";
import './PasswordGenerator.css'

const PasswordGenerator=()=>{

    const lengthArray=[6,7,8];
    const length=Math.floor(Math.random()*3);
    const upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const lowerCase="abcdefghijklmnopqrstuvwxyz";
    const specialCharacters="!@#$%^&*()_+=-,.?/";
    const numbers="1234567890";
    const args=[upperCase,lowerCase,specialCharacters,numbers];

    const [password,setPassword] = React.useState(0);

    const getRandomChar=(argument)=>{
        return argument[Math.floor(Math.random()*argument.length)];
    }

    const generatePassword = () =>{
        let pass='';
        pass=pass+getRandomChar(upperCase[Math.floor(Math.random()*args.length)]);
        pass=pass+getRandomChar(lowerCase[Math.floor(Math.random()*args.length)]);
        pass=pass+getRandomChar(specialCharacters[Math.floor(Math.random()*args.length)]);
        pass=pass+getRandomChar(numbers[Math.floor(Math.random()*args.length)]);
        for (let i=0;i<lengthArray[length]-4;i++){
            pass=pass+getRandomChar(args[Math.floor(Math.random()*args.length)]);
        }
        setPassword(pass);
        
    }

    return (
        <div className="container">
            <h1>Password Generator</h1>
            <button onClick={generatePassword}>Generate</button>
            <p>{password}</p>
        </div>
    )

}
export default PasswordGenerator