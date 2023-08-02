const oddoreven=function(x){
if (x%2==0){
    return "Even";
}else{
    return "Odd";
}
}
//console.log(oddoreven(10));


const oddorevenarray=function (arr){
    const res=[];
    for (const i of arr){
        res.push(oddoreven(i));
    }
    return res;
}
console.log(oddorevenarray([1,2,3,4]));

