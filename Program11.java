import java.util.*;
public class Program11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(n+" x "+i+" = "+n*i);
            i++;
        }
        sc.close();
    }
}
