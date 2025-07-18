import java.util.*;
public class Spy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0,product=1;
        while(a>0){
            int digit=a%10;
            sum=sum+digit;
            product=product*digit;
            a/=10;
        }
        if(sum==product){
            System.out.println("Spy number");
        }
        else
        System.out.println("Not Spy number");
    }
}
op:
1124
Spy number

Digits: 1, 1, 2, 4
Sum = 1 + 1 + 2 + 4 = 8
Product = 1 × 1 × 2 × 4 = 8
✅ So, 1124 is a Spy Number
