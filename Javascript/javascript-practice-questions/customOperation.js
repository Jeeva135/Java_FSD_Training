const customOperation=(num1,num2,operator)=>{
    switch(operator){
        case '+':
            return num1+num2;
        case '-':
            return num1-num2;
        case '*':
            return num1*num2;
        case '/':
            return num1/num2;
        case '%':
            return num1%num2;
        default:
            console.log("Invalid");
            break;
    }
}

console.log(customOperation(5, 10, '+')); // 15
console.log(customOperation(10, 5, '-')) // 5
console.log(customOperation(5, 10, '*')) // 50
console.log(customOperation(10, 5, '/')) // 2
console.log(customOperation(10, 5, '%')) // 0
