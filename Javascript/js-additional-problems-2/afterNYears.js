const afterNYears=(array,n)=>{
        for (let i=0;i<array.length;i++){
            array[i].age+=n;
        } 
        return array;
}

console.log(afterNYears([
    {
        name:"Joel",
        age:32
    },
    {
        name:"Fred",
        age:44
    }
],2));


// afterNYears({
//     "Joel" : 32,
//     "Fred" : 44,
//     "Reginald" : 65,
//     "Susan" : 33,
//     "Julian" : 13
//     }, 1);
