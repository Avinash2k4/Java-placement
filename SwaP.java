import java.util.*;
public class SwaP {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int og=n;
        int digit=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            digit++;
        }
        if(digit==1){
            System.out.println("Swapped number:"+og);
            return;
        }
        int lastdigit=n%10;
        int mul=1;
        for(int i=1;i<digit;i++){
            mul=mul*10;
        }
        int firstdigit=n/mul;
        n=n%mul;
        n=n/10;
        int result=lastdigit*mul+n*10+firstdigit;
        System.out.println("Swapped number:"+result);
    }
}

op1:
1345
Swapped number:5341
op2:
2
Swapped number:2
