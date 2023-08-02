const sumOfAllEvenNumbers=(array)=>{
    let sum=0;
    array.forEach(element => {
        if (element%2===0)
           sum+=element
    });
    return sum;
}

console.log(sumOfAllEvenNumbers([1, 2, 3, 4, 5])) // 6
sumOfAllEvenNumbers([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
