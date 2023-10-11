import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            
            System.out.print("enter your number : ");
            int num = scanner.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println(num);
        }
    }
    
}
