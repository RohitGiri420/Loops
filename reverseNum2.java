public class reverseNum2 {
    public static void main(String[] args) {
        int n = 123456;
        int RV = 0;

        while(n>0){
            int last = n%10;
             RV = (RV * 10)+last;
            n/=10;
        }
        System.out.println(RV);
    }
}
