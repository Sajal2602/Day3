import java.util.*;
class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.print("Enter the number : ");
        int a = sc.nextInt();
        for(int i = 2; i < a; i++)
            c += a%i==0?1:0;
        System.out.println((c==0)?"YES":"NO");
        sc.close();
    }
}