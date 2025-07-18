
import java.util.*;

public class Perfect {
    
    public static void perfect(int a){
        int sum=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sum = sum+i;
            }
        }
        if(a==sum){
            System.out.println("PerfectNo.");
        }else{
            System.out.println("Not Perfect.");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        perfect(a);
    }
}

op:
6
PerfectNo.

    6 → Divisors: 1, 2, 3 → 1 + 2 + 3 = 6 → Perfect number
