import java.util.Scanner;

class umOfNNaturalNum{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int i = 1;
        int sum = 0;

        System.out.print("Enter the value of N number : ");
        int n = Sc.nextInt();
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum of N natual number is : "+sum);
    }
}
