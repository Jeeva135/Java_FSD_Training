const shuffleNames=(name)=>{
    let fields=name.split(" ");
    return fields.reverse().join(", ");
}

console.log(shuffleNames('Donald Trump')) // 'Trump, Donald'
