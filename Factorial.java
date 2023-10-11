import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int Factorial = 0;
        
        for(int i =1 ; i<=num;i++){
            Factorial+=i;
        }
        System.out.println(Factorial);
        
    }
}
