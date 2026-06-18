package Numbers;

public class numbers_004 {
    public static int trailingZeroes(int n){
        int fact = 1;
        int res = 0;
        for(int i=2;i<=n;i++){
            fact = fact*i;
        }
        while(fact%10 == 0){
           res++;
           fact = fact/10;
        }
        return res;
    }

    public static int trailingZeroes_Efficient(int n){
        int count = 0;
        while(n>0){
            n = n/5;
            count += n;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Basic Approach to the Problem:-> "+trailingZeroes(5));
        System.out.println("Effective way to handle values larger than 13:-> " +trailingZeroes_Efficient(25));
    }
}
