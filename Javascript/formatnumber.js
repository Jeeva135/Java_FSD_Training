function converttocurrency(n){
     result=[];
     n=n.toString();
     n=n.split('.');
     while(n[0].length !=0){
        result.unshift(n[0].slice(-3));
        n[0]=n[0].slice(0,-3);
     }
     return '$'+result.join(',')+'.'+n[1];
}
console.log(converttocurrency(10000.873));