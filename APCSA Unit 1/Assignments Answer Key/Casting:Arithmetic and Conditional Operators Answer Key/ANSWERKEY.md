#  Answer and Explanation: Casting, Conditional and Arithmetic Operators Quiz

## Table of Contents
- [Question 1](#question-2)
- [Question 2](#question-2)
- [Question 3](#question-3)
- [Question 4](#question-4)
- [Question 5](#question-5)
- [Question 6](#question-6)
- [Question 7](#question-7)
- [Question 8](#question-8)
- [Question 9](#question-9)
- [Question 10](#question-10)
- [Question 11](#question-11)
- [Question 12](#question-12)


## Question 1

### What is the output when executing the following program below?

- `int equation = 24 * 2 + 9 + 8/3 + (15 *4/2);`
- `System.out.println(equation);`

**Correct Answer**: 
- A) 89

**Explanation**:

Let's evaluate the expression step-by-step:

```
int equation = 24 * 2 + 9 + 8/3 + (15 * 4/2);
```

- First, multiplication and division are performed from left to right:
```
24 * 2 = 48
8 / 3 = 2 (Note that this is integer division, which discards the remainder)
15 * 4 / 2 = 30 (Again, integer division)
```

- Next, addition is performed from left to right:
```
48 + 9 = 57
57 + 2 = 59
59 + 30 = 89
```

- So, the value of the variable `equation` is `89`.

- Now, let's analyze each multiple-choice option and explain why they are correct or incorrect:

- A) 89: This is the correct answer, as we've just determined that the value of `equation` is `89`.

- B) 88: This is incorrect, as the correct value is `89`, not `88`.

- C) 90: This is incorrect. The value of `equation` is `89`, not `90`.

- D) 89.2: This is incorrect. The expression involves only integer operations, so the result will also be an integer. The correct value is `89`, not `89.2`.

- E) This will result in an error. Nothing would be printed out: This is incorrect. The expression is valid and will be evaluated without any errors. The result of `89` will be printed out.

## Question 2

### Consider the following snippet of code below: Which of the following statements will compile successfully in Java with the given code above?

```
double testScore = 88.92;
int numStudents = 50;

Statement 1: numStudents = 60.5;
Statement 2: testScore = numStudents / 2
Statement 3: testScore = ((int) testScore) + 20;
Statement 4: numStudents = (int) testScore / 3

A) Statement 2 and Statement 4
B) Statement 2
C) Statement 3 and Statement 4
D) Statement 2 and Statement 3  and Statement 4
E) All of the above
```

**Correct Answer**: D) Statement 2 and Statement 3  and Statement 4

**Explanation**:
Let's analyze each statement one by one and determine if they will compile successfully based on the given code:

```
double testScore = 88.92;
int numStudents = 50;
```

- `Statement 1: numStudents = 60.5;`
- This statement attempts to assign a `double` value (`60.5`) to an `int` variable (`numStudents`). This will not compile successfully as it involves data loss since you are trying to store a floating-point value into an integer variable.

- `Statement 2: testScore = numStudents / 2;`
- Here, we are performing an integer division (`numStudents / 2`) and then attempting to store the result in a `double` variable (`testScore`). This will compile successfully because Java allows automatic type promotion from `int` to `double`.

- `Statement 3: testScore = ((int) testScore) + 20;`
- In this statement, we are casting `testScore` to an `int` using `(int)` and then adding `20`. The result will be an `int`, and it will be automatically promoted to a `double` before being stored back in the `testScore` variable. This will compile successfully.

- `Statement 4: numStudents = (int) testScore / 3;`
- Here, we are casting `testScore` (which is a `double`) to an `int` and then performing integer division by `3`. The result will be an `int`, and it will be stored in the `int` variable `numStudents`. This will compile successfully.

Now, let's determine why the other answer choices are incorrect

```
A) Statement 2 and Statement 4: Both statements 2 and 4 will compile successfully. 
Statement 2 involves automatic type promotion during assignment, and Statement 4 involves casting 
and then integer division. However, this answer is missing Statement 3 so this is not correct.

B) Statement 2: This statement will compile successfully because it involves automatic type promotion. 
However, this answer is missing Statement 3 and Statement 4 so this is not correct.

C) Statement 3 and Statement 4: Both statements 3 and 4 will compile successfully. 
Statement 3 involves casting to an `int`, and Statement 4 involves casting and then integer division. 
However, this answer is missing Statement 2 so this is not correct.

D) Statement 2 and Statement 3 and Statement 4: All three statements will compile successfully. 
This is the correct answer

E) All of the above: This option cannot be correct because option D is incorrect. 
Statement 1 will not compile successfully due to data loss when assigning a `double` to an `int`.
```

## Question 3

### What is the value of the variable when printed out?

```
int mysteryNumber = 21/3%8*30/2+18-5%2;
System.out.println(mysteryNumber);

A) 121
B) 120
C) 124
D) 123
E) 122

```
**Correct Answer**: E) 122

**Explanation**:

To determine the value of the variable `mysteryNumber`, let's evaluate the expression step-by-step:

```java
int mysteryNumber = 21/3%8*30/2+18-5%2;
```

```
1. 21 / 3: This is an integer division, and the result is 7.

2. 7 % 8: This is the remainder when 7 is divided by 8, which is 7.

3. 7 * 30: This is a multiplication, and the result is 210.

4. 210 / 2: This is an integer division, and the result is 105.

5. 105 + 18: This is an addition, and the result is 123.

6. 123 - 5 % 2: Here, we have 5 % 2, which is the remainder when 5 is divided by 2, 
and that's 1. So the expression becomes 123 - 1, and the result is 122.
```

- Now, let's print the value of `mysteryNumber`:

```
System.out.println(mysteryNumber);
```
- The output will be: 122


## Question 4

### Which of the following code segments would NOT cause a compile time error?

```
A) String name = 5;
B) double temperature == 75.2
C) char @MysteryCharacter = 'd';
D) int total = ((int) 55.3) + 30;
E) String fullName = "Lebron James " + "the " + 4th
```

**Correct Answer**: D) `int total = ((int) 55.3) + 30;`

**Explanation with example answer**:

Let's analyze each code segment and determine if it would cause a compile-time error:

```
A) String name = 5;
   This line would cause a compile-time error. It tries to assign an integer (5) 
   to a String variable (name) without any conversion. To fix this, 
   you can use a string literal (String name = "5";)

B) double temperature == 75.2;
   This line would cause a compile-time error. It mistakenly uses == (equality operator) instead 
   of = (assignment operator) to assign the value 75.2 to the variable temperature. 
   The correct syntax should be `double temperature = 75.2;

C) char @MysteryCharacter = 'd';
   This line would cause a compile-time error.
   Variable names in Java cannot start with special characters like @. 
   They must start with a letter, underscore, or dollar sign. To fix this, 
   you should use a valid variable name, like `char mysteryCharacter = 'd';`

D) int total = ((int) 55.3) + 30;
   This line would not cause a compile-time error. 
   It correctly casts the double value 55.3 to an int, resulting in 55, 
   and then adds 30 to it. The final result is 85, 
   and it can be stored in the int variable total

E) String fullName = "Lebron James " + "the " + 4th;
   This line would cause a compile-time error. 
   The last part of the string concatenation, 4th, is not a valid string or variable name. 
   To fix this, you should either use a string literal like "4th" or 
   a valid variable name if you intended to concatenate a variable value
```

## Question 5

### What will be the output of the following Java code?

```
int x = 15;
int y = 7;
boolean a = x >= 10 && y < 5;
boolean b = x % 2 == 1 || y % 2 == 0;
boolean c = !(x < 20) && !(y > 10);
boolean d = a || b && c;

System.out.println("Result: " + d);
```
```
A) Result: true
B) Result: false
C) Compilation Error. The code will not even run
D) It depends on the values of x and y for the value of Result
E) Result: meow

```

**Correct Answer**: B) Result: false

**Explanation**:

Let's evaluate the expression step-by-step:

```
1. boolean a = x >= 10 && y < 5;
   x >= 10 is true (15 >= 10). y < 5 is false (7 < 5). 
   The && operator requires both conditions to be true for the result to be true. 
   Since one of them is false, a will be false.

2. boolean b = x % 2 == 1 || y % 2 == 0;
   x % 2 == 1 is true (15 % 2 == 1 is equivalent to 1 == 1). 
   y % 2 == 0 is false (7 % 2 == 0 is equivalent to 1 == 0). 
   The || operator requires at least one condition to be true for the result to be true. 
   Since one of them is true, b will be true.

3. boolean c = !(x < 20) && !(y > 10);
   !(x < 20) is false (!(15 < 20) is equivalent to !true, which is false). 
   !(y > 10) is true (!(7 > 10) is equivalent to !false, which is true). 
   The && operator requires both conditions to be true for the result to be true. 
   Since one of them is false, c will be false.

4. boolean d = a || b && c;
   a is false, b is true, and c is false. 
   Now, we need to evaluate b && c first due to operator precedence (&& is evaluated before ||).
   b && c is true && false, which results in false. Now, we have a || false, which is false.
```

- Finally, we print the value of `d`, which is `false`.

- Explanation for the incorrect choices:

```
A) Result: true: This is incorrect. The output is false, not true.
C) Compilation Error. The code will not even run: This is incorrect. 
The code is valid and will run without any errors.
D) It depends on the values of x and y for the value of Result: This is incorrect. 
The result will always be false, regardless of the values of x and y, 
as the expressions and logic are fixed.
E) Result: meow: This is incorrect. The output is `false`, not "meow".
```

## Question 6

### What will be the output of the following Java code?

```
int x = 25;
int y = 12;
boolean a = x <= 20 || y > 15 && x % 2 == 1;
boolean b = !(x > 30) && (y % 3 == 0 || x < 15);
boolean c = (x % 5 == 0 && y % 4 != 0) || !(y >= 10);
boolean d = a && (b || c);

System.out.println("Result: " + d);
```

**Answer Choices**

```
A) Result: false
B) Compilation Error. The code will not even run
C) Result: true
D) Result: True
E) It depends on the values of x and y for the value of Result
```

**Correct Answer:** A) Result: false

**Explanation:**

Let's evaluate the expression step-by-step:

```
1. boolean a = x <= 20 || y > 15 && x % 2 == 1;
   x <= 20 is false (25 <= 20). y > 15 is false (12 > 15). 
   x % 2 == 1 is false (25 % 2 == 1 is equivalent to 1 == 1). 
   The && operator has higher precedence than ||, so y > 15 && x % 2 == 1 is evaluated first. 
   Since one of the conditions is false, y > 15 && x % 2 == 1 will be false. 
   Now, we have x <= 20 || false, which is false.

2. boolean b = !(x > 30) && (y % 3 == 0 || x < 15);
   !(x > 30) is true (!(25 > 30) is equivalent to !false, which is true). 
   y % 3 == 0 is true (12 % 3 == 0 is equivalent to 0 == 0). 
   x < 15 is false (25 < 15). The || operator requires at least one condition to be true 
   for the result to be true. Since one of them is true, 
   y % 3 == 0 || x < 15 will be true. Now, we have true && true, which is true.

3. boolean c = (x % 5 == 0 && y % 4 != 0) || !(y >= 10);
   x % 5 == 0 is false (25 % 5 == 0 is equivalent to 0 == 0). 
   y % 4 != 0 is true (12 % 4 != 0 is equivalent to 0 != 0). 
   The && operator requires both conditions to be true for the result to be true. 
   Since one of them is false, (x % 5 == 0 && y % 4 != 0) will be false. 
   Now, we have false || true, which is true.

4. boolean d = a && (b || c);
   a is false, b is true, and c is true. 
   Now, we need to evaluate (b || c) first 
   due to operator precedence (|| is evaluated before &&).
   (b || c) is true || true, which results in true. 
   Now, we have false && true, which is false.
```

- Finally, we print the value of `d`, which is `false`.

The correct answer is: A) Result: false

## Question 7:

**What will be the output of the following Java code?**

```
int x = 12;
int y = 5;
int z = 3;

int result = (x + y) * z % y / 2 + x++;

System.out.println("Result: " + result);
```

**Answer Choices**

```
A) Result: 20
B) Result: 15
C) Result: 14
D) Result: 12
E) Result: 21
```

**Correct Answer:** D) Result: 12

**Explanation:**

```
1. (x + y): The value of x + y is 12 + 5, which is 17

2. (x + y) * z: The value of (x + y) * z is 17 * 3, which is 51

3. (x + y) * z % y: The value of (x + y) * z % y is 51 % 5, which is 1

4. (x + y) * z % y / 2: The value of (x + y) * z % y / 2 is 1 / 2, 
which is 0. Note that since both operands of the division are integers, 
the result will also be an integer

5. x++: The value of x++ is 12. The post-increment operator ++ increases the value of x by 1, 
but the updated value is not used in this expression

6. result = (x + y) * z % y / 2 + x++;
   result = 0 + 12, which is 12. Note that the increment operation (x++) 
   occurred earlier but didn't affect this expression's result
```
- Finally, we print the value of `result`, which is `12`


## Question 8:

**What will be the output of the following Java code?**

```
 int a = 10;
 int b = 3;
 int c = 5;
 int result;

 result = a++ * (b - c) / (c % b + 1);
 System.out.println("Result: " + result);
```
**Answer Choices**
```
A) Result: 15
B) Result: 10
C) Result: -6
D) Result: 5
E) Result: 2
```

**Correct Answer:** C) Result: -6

**Explanation:**

Let's evaluate the expression step-by-step:

```
 int a = 10;
 int b = 3;
 int c = 5;
```

```
1. result = a++ * (b - c) / (c % b + 1);
Here, a++ is the post-increment operator. The value of a++ is 10 because it uses the 
current value of a, but then increments a to 11.
a++ just updates the value of `a` from 10 to 11 but
the expression uses the previous value of 10 to evaluate the expression
2. 3 - 5: This is -2 
updated expression: 10 * -2 / (c % b + 1)
3. 5 % 3: This is 2.
updated expression: 10 * -2 / (2 + 1)
4. (2 + 1): This is 2 + 1, which is 3.
updated expression: 10 * -2 / 3
5. 10 * (-2): This is -20.
6. -20 / 3: Since both operands are integers, 
this is an integer division. -20 / 3 results in -6.
```

- Finally, we print the value of `result`, which is `-6`.

## Question 9:

**What would the following print statement output? If this is a compile error from Java, please just enter Compile Error**

```
System.out.print((int) (16/5) * (int) 13.57 / 4 + (int) 11 /4 + 50 * (14.563244f * 2));
```
**Correct Answer:** 1467.3243 or 1467.3244

**Explanation:**

Let's break down the expression step-by-step:

```
1. (int) (16/5): This is integer division, and the result is 3 (as 16/5 is 3.2, 
but the (int) casting truncates the decimal part).
2. (int) 13.57: This is type-casting to an integer, 
so the decimal part is truncated,and the result is 13.
3. (int) 11: This is already an integer, so it remains as 11.
4. 14.563244f * 2: This is a floating-point multiplication, and the result is 29.126488f.
5. Now, let's put everything together:
   - 3 * 13: This is 39.
   - 39 / 4: This is 9.
   - 11 / 4: This is 2.
   - 50 * 29.126488f: This is 1456.3244f.
```
Finally, we add up all the components:
```
Result: 9 + 2 + 1456.3244f
```
The output will be:
```
Result: 1467.3244
```
- So, the correct answer is: Result: 1467.3244

## Question 10:

**What would the following print statement output? If this is a compile error from Java, please just enter "Compile Error"**

```
int x = 5;
int y = 10;
boolean isEven = (x % 2 == 0);
boolean isOdd = (y % 2 == 1);
System.out.println(isEven && (isOdd || false));
```

**Correct Answer:** false

**Correct Answer Explanation:**

Let's evaluate the expression step-by-step:

```java
int x = 5;
int y = 10;
boolean isEven = (x % 2 == 0);
boolean isOdd = (y % 2 == 1);
System.out.println(isEven && (isOdd || false));
```
```
1. x % 2 == 0: The value of x % 2 is 1 (5 % 2), 
and the expression x % 2 == 0 evaluates to false.

2. y % 2 == 1: The value of y % 2 is 0 (10 % 2),
and the expression y % 2 == 1 evaluates to false.

3. (isOdd || false): Since isOdd is false, 
the expression isOdd || false evaluates to false.

4. isEven && (isOdd || false): Here, isEven is false, 
and (isOdd || false) is also false. The && operator requires both conditions to be true 
for the result to be true. Since one of them is false, isEven && (isOdd || false) will be false.
```

- Finally, we print the value of the `isEven && (isOdd || false)` expression, which is `false`.

## Question 11:

**Given the following variables below, what would be the output of the variable x and y. Please also describe what the code is doing in terms of the variables?**

```
int x = 5;
int y = 20;
int temp = x;
x = y;
y = temp;
System.out.println("x = " + x);
System.out.println("y = " + y);
```
**Correct Answer:** 

```
x = 20
y = 5
```

**Correct Answer Explanation:**

Let's break down the code step-by-step to understand what it does and the resulting values of the variables `x` and `y`.

```java
int x = 5;
int y = 20;
int temp = x;
x = y;
y = temp;
System.out.println("x = " + x);
System.out.println("y = " + y);
```

```
1. int x = 5; Here, we initialize the variable x with the value 5.
2. int y = 20; Here, we initialize the variable y with the value 20.
3. int temp = x; We create a temporary variable temp 
and store the value of x in it. At this point, temp is 5.
4. x = y; We update the value of x to be the same as y. So now, x becomes 20.
5. y = temp; We update the value of y to be the same 
as the initial value of x (stored in temp). So now, y becomes 5.
```

Finally, we print the values of `x` and `y`:

```
x = 20
y = 5
```

- After executing the code, the variable `x` becomes `20`, and the variable `y` becomes `5`. The code essentially swaps the values of `x` and `y`, using a temporary variable (`temp`) to hold one of the values temporarily during the swap process.


## Question 12:

**Write a Java program that defines two integers variables and performs the following operations on them:**

```
1. Calculate and print the sum of the two numbers by storing the sum 
in a new variable and printing that new variable.
2. Calculate and display the product of the two numbers by storing the product 
in a new variable and printing that new variable.
3. Calculate and display the result of dividing the larger number by the smaller number
by storing the result in a new variable and printing the new variable.
```
**Correct Answer:** Please refer to example below

**Answer Example:**

```
int num1 = 10;
int num2 = 20;
int sum = num1 + num2;
System.out.println("this is the sum: " + sum);

int num3 = 30;
int num4 = 5;
int product = num3 *  num4;
System.out.println("this is the product: " + product);

int num4 = 100;
int num5 = 2;
int div = num4 / num5;
System.out.println("this is the result: " + div);

```