import java.util.*;
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int c = 1;
        while(c!=n+1){
            System.out.print(c+" ");
            c++;
        }
        sc.close();
    }  
}
