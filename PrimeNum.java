import java.util.*;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a Number : ");
        int num = scanner.nextInt();
        boolean isPrime=true;

        if(num==2){
            System.out.print("2 is a prime number");
        }

        else{
            for(int i = 2;i<=Math.sqrt(num);i++){

                if(num%i==0){
                    isPrime = false;
                   
                }
            }

            if(isPrime){
                 System.out.println(num+" is Prime");
            }
            else{
                 System.out.println(num+" is not prime");
            }
            
        }
    }
}
