import java.util.*;
public class Password {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String name="Avinash";
        String email="avinash@gmail.com";
        int Phonenumber=128937753;
        int password=3107;
        int count=3;
        while(count!=0){
            int pass=sc.nextInt();
            if(pass==password){
                System.out.println(name);
                System.out.println(email);
                System.out.println(Phonenumber);
                break;
            }
            else{
                count--;
                if(count!=0)
                System.out.print("You have balance "+count+" chance!");
                else
                System.out.print("You already done enough chance.Come again later");
            }
        }
    }
}

op1:
3107
Avinash
avinash@gmail.com
128937753

op2:
344
You have balance 2 chance! 
434
You have balance 1 chance!
244
You already done enough chance.Come again later
