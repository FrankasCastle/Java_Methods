public class MethodParameters {

    /* Parameters and Arguments
    Parameters allow passing information to methods.
    They act as variables inside the method and are defined
    inside the parameters after the method name.
    Multiple parameters can be added, separated by commas. */

    static void myMethod (String fname) {
        System.out.println(fname + "Sena");
    }

    /* Multiple Parameters
    We can have as many parameters as we like. */

    static void myMethod2 (String fname, int age){
        System.out.println(fname + " is " + age);
    }

    /* A Method with if...else
    It is common to use if...else statements inside methods.
    Example:  */

    static void checkAge (int age){

        if (age < 10) {
            System.out.println("Access denied - You are not old enough!");
        }

        else {
            System.out.println("Access granted - You are old enough!");
        }
    }


    public static void main(String[] args){
        
        myMethod("Mariana ");
        myMethod("Lucas ");
        myMethod("Sabrina ");
        myMethod("Daniel ");
        myMethod2("Mariana", 27);
        myMethod2("Lucas", 27);
        checkAge(20);
    }
}