for (let i = 1; i <= 100; i++) {
  if (i % 3 === 0 && i % 5 === 0) {
    console.log("CodeAcademy");
  } else if (i % 3 === 0) {
    console.log("Code");
  } else if (i % 5 === 0) {
    console.log("Academy");
  } else {
    console.log(i);
  }
}
