const sumOfAllNumbersInString=(string)=>{
    let sum=0;
    let regex=/[0-9]/g;
    let matches=string.match(regex);
    if (!matches)
        return 0;
    matches.forEach(element => sum+=Number(element));
    return sum;
}

console.log(sumOfAllNumbersInString('hello world')) // 0
console.log(sumOfAllNumbersInString('hello 1 world 2')) // 3
console.log(sumOfAllNumbersInString('1hello 1 world 2')) // 4
