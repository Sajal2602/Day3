import java.util.*;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int l = a>b?a:b;
        while(true){
            if(l%a==0 && l%b==0)
                break;
            l++;
        }       
        System.out.println("LCM = "+l);
        sc.close();
    }
}
