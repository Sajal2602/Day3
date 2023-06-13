import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(b!=0){
            int t = b;
            b = a%b;
            a = t;
        }
        System.out.println("HCF : "+a );
        sc.close();
    }
}
