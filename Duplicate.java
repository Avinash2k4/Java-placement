import java.util.*;

public class Duplicate {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int count=0;
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]!=temp && arr[i]==arr[j]){ //this check the temp value if the j value repeated it simply fails move to the next .
                    count++;
                    temp=arr[j];                    //This line store the first arr[j] value.
                }
            }
        }
        
        
        System.out.println(count);
    }
}


// op:
// 5
// 1 2 1 3 1
// op:
// 5
// 1 1 2 2 4