import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] a = {1,2,3,4};
        inertia(a);
     }
     
     static int inertia(int[] a){
         int k=0;
          int m=0;
         int[] evenArray = new int[a.length];
          int[] oddArray = new int[a.length];
         
         for(int i=0;i<a.length;i++){
             if(a[i]%2==0){
             evenArray[k] = a[i];
                 k++;
             }
             else {
             oddArray[m] = a[i];
                 m++;
             }
         }
          System.out.println("even"+Arrays.toString(evenArray));
          System.out.println("odd"+Arrays.toString(oddArray));
         int[] ans=new int[k];
         for(int i=0;i<ans.length;i++){
             ans[i]=evenArray[i];
             }
         int[] ansOdd=new int[m];
             for(int j=0;j<ansOdd.length;j++){
             ansOdd[j]=oddArray[j];
             }
             System.out.println(Arrays.toString(ans));
             System.out.println(Arrays.toString(ansOdd));
             return 1;
         
     }
}