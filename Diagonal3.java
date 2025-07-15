//1.type

public class Diagonal3 {
    public static void main(String[] args) {
        int num=5;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//output:
// 1
// 12
// 123
// 1234
// 12345

//2.type

// public class Diagonal3 {
//     public static void main(String[] args) {
//         int num=5;
//         for(int i=1;i<=num;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//output:
//
// 1
// 12
// 123
// 1234


// 3.type

// public class Diagonal3 {
//     public static void main(String[] args) {
//         int num=5;
//         for(int i=1;i<=num;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// output:
// *
// **
// &&&
// ****
// *****

//4.type

// public class Diagonal3 {
//     public static void main(String[] args) {
//         int num=5;
//         for(int i=1;i<=num;i++){
//             for(int j=1;j<=i;j++){
//                 if(i==3){
//                     System.out.print("&");
//                 }else
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
// output:
// *
// **
// &&&
// ****
// *****