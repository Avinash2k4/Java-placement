import java.util.*;
public class Awp {

    public static int add(int a,int b){
        while(b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int a=s.nextInt();
        System.out.print("Enter the 2nd number:");
        int b=s.nextInt();
        Awp ap=new Awp();
        int result=ap.add(a,b);
        System.out.println("The total:"+result);

    }
}

op:
Enter the 1st number:4
Enter the 2nd number:4
The total:8
