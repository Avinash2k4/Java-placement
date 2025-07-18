import java.util.*;
public class Npalin {
    public static Boolean ispalindrome(int num){
        int og=num;int rev=0;
        while(num>0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        return og==rev;
    }
    public static int getNextpalin(int num){
        num++;
        while(!ispalindrome(num)){
            num++;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int Result=getNextpalin(num);
        System.out.println("Next palindrome:"+Result);
    }
}

op:
Enter the number:
130
Next palindrome:131

op:
Enter the number:
30
Next palindrome:33
