public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        int []a ={2,2,5,11,23};
        beanA(a);
     }
     static int beanA(int[] a) {
        int check = 0;
        for(int i=0; i<a.length; i++){
        for(int j=0; j<a.length; j++)
        {
            if(a[i]==a[j]*2|| a[i]==(a[j]*2)+1 || a[i]==a[j]/2){
                 check = 1;
            }
        }
        System.out.println(check);
        return check;
        }
        System.out.println(0);
        return 0;
    }
}