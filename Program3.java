import java.util.*;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int m = i,r,s=0;
            while(m!=0){
                r = m%10;
                s+=r*r*r;
                m/=10;
            }
            System.out.print(s==i?s+"\n":"");
        }
        sc.close();
    }
}
