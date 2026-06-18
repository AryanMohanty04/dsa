# Numbers
----------
### Question 1: numbers_001
__Count Numbers__: count the number of digit a number has.<br>
input: 456 <br>
output: 3

- iterate over every single digit in a number
- use division to get the last (divide by 10 to get the quotient)
- use quotient as the number (number = number/10)
```java
  public static int countNumbers(int number){
        number = Math.abs(number);
        if(number == 0){
            return 1;
        }
        int count = 0;
        while(number > 0){
            number = number/10;
            count++;
        }
        return count;
    }
```
---
### Question 2: Palindrome Number (numbers_002)
Given an integer x, return true if x is a palindrome, and false otherwise.

Input: x = 121

Output: true

Explanation: 121 reads as 121 from left to right and from right to left.

- store the original number in a variable (so the modification done with the number wont get reflected while comparing)
- reversed number -> rev_number*10 + (x%10);

```java
  public static boolean palindrome(int number){
        number = Math.abs(number);
        int originalNumber = number;
        int reversedNumber = 0;

        while(number > 0){
            reversedNumber = reversedNumber*10 + (number%10);
            number = number/10;
        }
        return reversedNumber == originalNumber;
    }
```
