import java.util.*;
public class Pripalin {
    public  void palin(int a){
        int num=a+1;
        while(true){    
            if(isprime(num)){
                int rev=0;int og=num;
                while(num>0){
                int digit=num%10;
                rev=rev*10+digit;
                num/=10;
                }
                if(og==rev){
                    System.out.println(rev);
                    break;
                }
            }
            num++;
        }
    }

    public static boolean isprime(int a){
        if(a<2)return false;
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        Pripalin p=new Pripalin();
        p.palin(b);
        sc.close();
    }
}

// output:
// 1.
// i/p->130
// o/p->131

// 2.
// i/p->99
// o/p->101