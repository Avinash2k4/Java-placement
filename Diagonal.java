public class Diagonal {
    public static void Diagonal(char[] input){ 

        int len=input.length;

         for(int i=0;i<len;i++){
            for(int j=0;j<i;j++)
                System.out.print(" ");
            System.out.println(input[i]);
         }

         for(int i=len-2;i>=0;i--){
            for(int j=0;j<i;j++)
                System.out.print(" ");
            System.out.println(input[i]);
         }
    }
    public static void main(String[] args) {
        char[] word={'Z','O','H','O'};
        Diagonal(word);
    }
}
