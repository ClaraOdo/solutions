public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int[] a={2,1,1};
        madhav(a);
     }
     static int madhav(int[] a) {
        int ans = 1;
        int len = 0;

        if (a.length < 3) return 0;

        for (int i = 1; i <= a.length; i++) {
            if (a.length == i*(i+1)/2) {
                len = 1;
            }
        }
        if (len == 0) return 0;

        int startIndex = 1;
        int round = 1;
        int endIndex = startIndex + round;
        int firstValue = a[0];

        while (ans == 1 && endIndex <= a.length) {
            int sum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                sum += a[i];
            }
            if (firstValue != sum)
                ans = 0;

            round++;
            startIndex = endIndex + 1;
            endIndex = startIndex + round;
        }
        return ans;
}
}