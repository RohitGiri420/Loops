import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        for(int i = 1;i<=10;i++){
            System.out.printf("%d X %d = %d \n" , num,i,num*i);
        }
    }
    
}
