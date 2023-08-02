var str1='Hello World';
var str2='Hello';


const isSubString=(str1,str2)=>{
    return str1.toUpperCase().includes(str2.toUpperCase());
}

console.log(isSubString(str1,str2));