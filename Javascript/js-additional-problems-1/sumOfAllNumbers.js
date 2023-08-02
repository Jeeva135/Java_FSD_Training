const sumOfAllNumbers=(array)=>{
    let sum=0
    array.forEach(element => {
        sum+=element
    });
    return sum;
}
console.log(sumOfAllNumbers([1, 2, 3, 4, 5]));