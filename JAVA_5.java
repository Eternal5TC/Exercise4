
class Math{
    static int add( int a, int b){
        return a+b;
    }
    static int subtract(int a, int b){
        return a-b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static int divide(int a, int b){
        return a/b;
    }
    static int min(int a, int b){
        if ( a<b ){
            return a;
        }
        return b;
    }
    static int max(int a, int b){
        if ( a<b ){
            return b;
        }
        return a;
    }
}

public class JAVA_5 {
    public static void main(String[] args) {
        System.out.println("add: " +Math.add(10, 20));
        System.out.println("subtract: "+Math.subtract(10, 20));
        System.out.println("Multiply: "+Math.multiply(10, 20));
        System.out.println("divide: "+Math.divide(10, 20));
        System.out.println("Min: "+Math.min(10, 20));
        System.out.println("Max: "+Math.max(10, 20));

    }
}
