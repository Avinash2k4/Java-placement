import java.util.*;
public class Magic {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean foundpair=false;
        for(int i=0;i<n;i++){
            if(arr[i]>=k){
                System.out.print("No valid pair");
                break;
            }
            else{
                for(int j=i+1;j<n;j++){
                sum=arr[i]+arr[j];
                if(sum<k){
                    if(foundpair){
                    System.out.print(",");
                    }
                    System.out.print("("+i+","+j+")");
                    foundpair=true;
                        }
                    }
                }
            }
        }
    }


