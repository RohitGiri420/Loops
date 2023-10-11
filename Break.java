import java.util.Scanner;
public class Break {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num;
        
    for(int i=0;true;i++){

        System.out.print("enter your number : ");
        num=scanner.nextInt();

        if(num%10==0){
            break;
        }

        System.out.println(num);
    }

    System.out.println("loop is breaked");
    }
    
}
