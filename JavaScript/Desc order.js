const n=prompt("Enter no.of elements in an array: ");
const a=[];
for (var i=0;i<n;i++){
    a[i]=prompt("Enter element "+(i+1)+":")
}
a.sort();
a.reverse();
console.log(a);