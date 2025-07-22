import java.util.*;
public class Grocery {

    public static int isRandom(int a, int t){
        if(a>100 || a<999){
            int dis=(t*20)/100;
            return dis;
        }
        else if(a>999 || a<9999){
            int dis=(t*30)/100;
            return dis;
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int con=1;
        int total=0;
        
        while(con==1){
        System.out.print("1.Tomato \n2.Potato \n3.Onion \n4.Carrot");
        System.out.println("\nChoose product:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("The price of Tomato is 1kg = Rs.30");
                System.out.print("Enter the Kg:");
                int Tkg=sc.nextInt();
                int a=Tkg*30;
                total+=a;
                System.out.println("The total amount is "+a);
                break;

            case 2:
                System.out.println("The price of Potato is 1kg = Rs.20");
                System.out.print("Enter the Kg:");
                int Pkg=sc.nextInt();
                int b=Pkg*20;
                total+=b;
                System.out.println("The total amount is "+b);
                break;

            case 3:
                System.out.println("The price of Onion is 1kg = Rs.40");
                System.out.print("Enter the Kg:");
                int Okg=sc.nextInt();
                int c=Okg*40;
                total+=c;
                System.out.println("The total amount is "+c);
                break;

            case 4:
                System.out.println("The price of Carrot is 1kg = Rs.50");
                System.out.print("Enter the Kg:");
                int Ckg=sc.nextInt();
                int d=Ckg*50;
                total+=d;
                System.out.println("The total amount is "+d);
                break;

            default:
                con++;
            }
        }
        int t=total;
        System.out.println("The final total amount is "+total);
        int ran=r.nextInt(100,9999);
        int discount=isRandom(ran,t);
        System.out.println("The coupon is "+ran);
        System.out.println("The balance amount you need to pay: "+(total-discount));
        int pay=sc.nextInt();
        if(pay==(total-discount))
        System.out.println("Thank you for shopping!");
        else
        System.out.println("Sorry come agin later!");
    }
}
