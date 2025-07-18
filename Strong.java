import java.util.*;
public class Strong {

    public static int fact(int a) {
        int fact=1;
        for(int i=2;i<=a;i++){
            fact=fact*i;
        }
        return fact; 
    }
    public static void isStrong (int num){
        int og=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+fact(digit);
            num=num/10;
        }
        if(og==sum){
            System.out.println("Strong number");
        }else{
            System.out.println("Not Strong number");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isStrong(num);
    }
}

op:
145
Strong number
    
1!+4!+5!=1+24+120=145
