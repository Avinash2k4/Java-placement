public class Primel {
    public static boolean isprime(int n){
        if(n<2)return false;

        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[]args){
        int limit=50;
        System.out.println("The prime number up to "+limit);
        for(int i=1;i<=50;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
