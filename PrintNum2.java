import java.util.Scanner;

class PrintNum2{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int i=1;

        System.out.print("enter the value of N number : ");
        int n = Sc.nextInt();

        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}