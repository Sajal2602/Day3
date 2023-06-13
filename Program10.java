import java.util.*;
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int s = 0;
        while(n!=0){
            s+=n;
            n--;
        }
        System.out.println("Sum : "+s);
        sc.close();
    }
}
