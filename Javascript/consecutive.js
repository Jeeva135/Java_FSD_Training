const readInput=()=>{
    const string=prompt("Enter input");
    
      
    inputValidator(string); 
    //checkForConsecutive(array);
}

const inputValidator=(string)=>{
   return (checkForConsecutive(string)==true?console.log("Given numbers are Consecutive"):console.log("Given numbers are not Consecutive"))
   //checkForConsecutive(array);
}

const checkForConsecutive=(string)=>{
    array=string.split('');
    array.sort();
    for (let j=0;j<array.length;j++){
        if (array[j]-array[j+1]!==1){
            return false;
        }
    }
    return true;
}

const outputPrinter=(array)=>{
    array.forEach((element)=>console.log(element));
}

readInput();