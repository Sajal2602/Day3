import java.util.*;
public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("Enter the power : ");
        int p = sc.nextInt();
        int s = 1;
        while(p!=0){
            s*=n;
            p--;
        }
        System.out.println("Power : "+s);
        sc.close();
    }
}
