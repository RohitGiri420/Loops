import java.util.Scanner;
public class evenOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenSum =0;
        int OddSum =0;
        int choice=1;

        do{
            System.out.print("enter a number : ");
            int num=scanner.nextInt();

            if(num%2==0){
                evenSum += num;
            }else{
                OddSum += num;
            }

            System.out.println("enter 1 is you want to continue / entter 0 is you want to exit ");
            choice = scanner.nextInt();
        }while(choice==1);

        System.out.println("Sum of even number is "+evenSum);
        System.out.println("sum of odd number is "+OddSum);

    }
    
}
