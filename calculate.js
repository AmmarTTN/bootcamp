function prompt1() {
  var amt = parseFloat(prompt("Enter Amount"));
  var rate = parseFloat(prompt("Enter rate"));
  var year = parseFloat(prompt("Enter number of year"));
  calsi(amt, rate, year);
}
function calsi(amt, rate, year) {
  document.querySelector("#amt").innerHTML = "Amount" + amt;
  document.querySelector("#rate").innerHTML = "rate" + rate;
  document.querySelector("#year").innerHTML = "year" + year;
  var SI = (amt * rate * year) / 100;
  var si = document.querySelector("#si");
  si.innerHTML = "simple interest" + SI;
}
function prompt2() {
  var str = prompt("enter a string");
  checkpalindrome(str);
}
function checkpalindrome(str) {
  lstr = str.toLowerCase();
  splitArray = lstr.split("");
  reverseArray = splitArray.reverse();
  reverseStr = reverseArray.join("");
  var palindrome = document.querySelector("#palindrome");
  if (lstr === reverseStr) {
    palindrome.innerHTML = str + " is a palindrome";
  } else {
    palindrome.innerHTML = str + " is not a palindrome";
  }
}
function prompt3() {
  var radius = parseFloat(prompt("enter radius of circle in cm"));
  Area(radius);
}
function Area(radius) {
  var area = 3.14 * radius * radius;
  document.querySelector("#area").innerHTML = "Area of circle " + area;
}
function q4() {
  var person1 = {
    name: "ammar",
    age: 22,
    competency: "AMC"
  };
  console.log("person1(original object)", person1);
  var person2 = JSON.parse(JSON.stringify(person1));
  console.log("person2(copied object)", person2);
  document.querySelector("#obj").innerHTML = " please check console";
}
