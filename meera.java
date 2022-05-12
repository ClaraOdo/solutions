public class HelloWorld{

     public static void main(String []args){
        //System.out.println("Hello World");
        int []a ={1,1,0,8,0,9,9,1};
        isMeera(a);
     }
     static int isMeera(int[] a) {
        int isMeeraArray = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1 || a[i] == 9) {
                if (a[i] == 1) {
                    for (int j = i; j < a.length; j++) {
                        if (a[j] == 9) {
                            isMeeraArray = 1;
                             System.out.println(1);
                            return isMeeraArray;
                        }
                    }
                    isMeeraArray = 0;
                     System.out.println(1);
                    return isMeeraArray;
                }
                if (a[i] == 9) {
                    for (int j = i; j < a.length; j++) {
                        if (a[j] == 1) {
                            isMeeraArray = 1;
                            System.out.println(1);
                            return isMeeraArray;
                        }
                    }
                    isMeeraArray = 0;
                    System.out.println(0);
                    return isMeeraArray;
                }
            }
        }
        System.out.println(1);
        return isMeeraArray;
    }
}