public class MathDemo {

    // When we define methods as static, then we can call the methods without need to create an object, therefore it helps memory management.

    public static int min(int a, int b){
        if (a>b) return b;
        else return a;
    }

    public static int max(int a, int b){
        if (a>b) return a;
        else return b;
    }

    public static int sum(int[] args){
        int l = args.length;
        int sum = 0;
        for (int i = 0; i<l; i++){
            sum += args[i];
        }
        return sum;
    }

    public static float mean(int[] args){
        int l = args.length;
        int sum = 0;
        for (int i = 0; i<l; i++){
            sum += args[i];
        }
        return (float) sum/l;
    }

    public static int factorial(int n){
        if (n<=1) return 1;
        return n*factorial(n-1);
    }
}
