const s=prompt();
var a=s.split(" ");
var b="";
for (var i=0;i<a.length;i++){
    var c=a[i].split("").reverse().join("");
    b=b+" "+c;
}
console.log(b);
