
import java.util.Arrays;

public class ArrAdd {
    public static void main(String[]args){
        int a[]={10,20,30,40};
        int b[]={40,30,20,50};
        int c[]=new int[a.length];
        for(int i=0;i<b.length;i++){
                c[i]=a[i]+b[i];
        }
        System.out.print(Arrays.toString(c));
    }
}

// op:
// [50, 50, 50, 90]
