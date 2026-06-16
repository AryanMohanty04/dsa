package Numbers;

public class numbers_002 {
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
    public static void main(String[] args) {
        System.out.println(palindrome(-121));
    }
}
