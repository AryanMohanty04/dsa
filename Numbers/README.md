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
