import java.util.*;
public class Diagonal2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int len=s.length();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(j==i || j==len-1-i){
                System.out.print(s.charAt(i)+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

op:
ZOHO
Z   O 
 O H
 O H
Z   O

op:
avinash
a      h 
 v    s
  i  a
   n
  i  a
 v    s
a      h
