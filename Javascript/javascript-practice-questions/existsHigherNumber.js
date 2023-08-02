const existsHigherNumber=(array,n)=>{
    for (let i=0;i<array.length;i++){
        if (array[i]>=n)
            return true;
    }
    return false;
}
console.log(existsHigherNumber([1, 2, 3, 4, 5], 3));


