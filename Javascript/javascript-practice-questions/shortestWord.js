const shortestWord=(array)=>{
    let shortest=array[0];
    array.forEach(element => {
        if (element.length<=shortest.length){
            shortest=element
        }
    });
    return shortest;
}

console.log(shortestWord(['hello', 'world', 'this', 'is', 'a', 'test'])); // 'a'
console.log(shortestWord(['hello', 'world', 'this', 'is' , 'test', 'of', 'the', 'shortest', 'word'])) // 'of'
