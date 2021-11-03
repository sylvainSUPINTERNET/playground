/**
First Factorial
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it. For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 and 18 and the input will always be an integer.
Examples
Input: 4
Output: 24
Input: 8
Output: 40320
**/


let arr = [];
const reducer = (accumulator, currentValue) => accumulator * currentValue;


function FirstFactorial(num) { 
	if ( num >= 1 ) {
		arr = [...arr, num];
		num -= 1;
		return FirstFactorial(num)
	} else {
		let r = arr.reduce(reducer);
		return r
	}
}

console.log(FirstFactorial(4)) // 24

