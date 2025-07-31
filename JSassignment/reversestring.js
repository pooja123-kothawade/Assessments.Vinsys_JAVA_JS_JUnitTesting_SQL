let input = "Welcome to this Javascript";
let reversed = input
  .split(" ")
  .map(word => word.split("").reverse().join(""))
  .join(" ");

console.log(reversed); 
