function peopleBudget(arr){
    let result=0;
    for(let i=0; i<arr.length;i++){
      result=result+arr[i].budget;
    }
    return result;
  }
  console.log(peopleBudget([
   { name: "John", age: 21, budget: 23000 },
  { name: "Steve", age: 32, budget: 40000 },
  { name: "Martin", age: 16, budget: 2700 }
  ]))