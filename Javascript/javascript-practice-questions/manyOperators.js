const manyOperators=(firstnum,secondnum)=>{
    let result=0;
    result=((firstnum*secondnum)/firstnum)-secondnum;
    return result;
}

console.log(manyOperators(5, 10)); // 5
console.log(manyOperators(10, 5)); // 0
