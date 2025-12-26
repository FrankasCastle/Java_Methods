public class MethodParametersValues{

    /* Returining Values
    Methods with 'void' do not return a value.
    To return a value, use a data type (such as int or char)
    instead of void, use the 'return' keyword inside the method.
    Example */

    static int myMethod(int x){
        return 5 + x;
    }

    // We can also use a sum of a method's two parameters.

    static int myMethod2(int x, int y){
        return x + y;
    }

    /* We can also store the result in a variable, which is better,
    because it is easier to read and maintain. */

    static int myMethod3(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        System.out.println(myMethod(3));
        System.out.println(myMethod2(5, 3));
        int z = myMethod3(5, 3);
        System.out.println(z);
    }
}