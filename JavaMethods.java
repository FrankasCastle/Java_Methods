public class JavaMethods {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

/*Java Methods
A method is a block of code that runs only when is called.
Methods can receive parameters and are used to perform specific actions.
They help reuse code by defining it once using it multiple times.
Methods are also called functions. */

    public static void main (String[] args){
        myMethod();
        myMethod();
        myMethod();
    }

}