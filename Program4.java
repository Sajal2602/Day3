import java.util.*;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int m = n,r,s=0;
        while(m!=0){
            r = m%10;
            s=s*10+r;
            m = m/10;
        }
        System.out.println(n==s?"Yes":"No");
        sc.close();
    }
}
