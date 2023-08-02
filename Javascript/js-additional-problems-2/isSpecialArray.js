const isSpecialArray=(array)=>{
    for (let i=0;i<array.length;i++){
        if (i%2==0 && array[i]%2!=0 || i%2!=0 && array[i]%2==0)
            return false;
    }
    return true;
}

console.log(isSpecialArray([2, 7, 4, 9, 6, 1, 6, 3]));
console.log(isSpecialArray([2, 7, 9, 1, 6, 1, 6, 3]));
console.log(isSpecialArray([2, 7, 8, 8, 6, 1, 6, 3]));