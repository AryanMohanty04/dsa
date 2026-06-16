//Count Numbers
package Numbers;

public class numbers_001 {
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
    public static void main(String[] args) {
        System.out.println(countNumbers(100));
    }
}
