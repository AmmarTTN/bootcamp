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
var employees = [
  {
    name: "ammar",
    age: 22,
    salary: 2000,
    dob: "24/05/1997"
  },
  {
    name: "anuj",
    age: 23,
    salary: 10000,
    dob: "08/10/1996"
  },
  {
    name: "ayush",
    age: 22,
    salary: 900,
    dob: "24/1/1998"
  },
  {
    name: "abdullah",
    age: 23,
    salary: 2000,
    dob: "01/02/1997"
  }
];
function view() {
  document.querySelector("#employees").innerHTML = "please check console";
  console.log(JSON.stringify(employees));
}
function checksalary() {
  var result = document.querySelector("#salary");
  var data = [];
  data = employees.filter(function(item) {
    return item.salary > 5000;
  });
  for (var i = 0; i < data.length; i++) {
    if (result.innerHTML == "") result.innerHTML = data[i].name;
    else result.innerHTML = result.innerHTML + "," + data[i].name;
  }
}
function group() {
  result = employees.reduce(function(r, a) {
    r[a.age] = r[a.age] || [];
    r[a.age].push(a);
    return r;
  }, Object.create(null));
  console.log("employees group by age:", result);
  document.querySelector("#age").innerHTML = "please check console";
}
function fetch() {
  var data = [];
  data = employees.filter(function(item) {
    return item.salary < 1000 && item.age > 20;
  });
  data.forEach(function(item) {
    item.salary = item.salary + item.salary * 5;
  });
  console.log("employees updated salary:", data);
  document.querySelector("#fetch").innerHTML = "please check the console";
}
