/*
 * 
 Define a class called Counter. An object of this class is used to count thing,
 so it records a count that is a nonnegative whole number. include method to set
 the counter to a given integer, to increase the count by 1, and to decrease the
 count by 1. be sure that no method allows the value of the counter to become
 negative. also include a method that returns the current count value as an integer
 a method toString that return the current count value as string suitable for display
 on the screen, and a method that tests whether the current count value is zero.
 write a program to test your class definition.
 */

/**
 *
 * @author xiyangli
 */
public class app {

    
    public static void main(String[] args) {
        int n = Integer.parseInt(args [0]);
        Counter counter = new Counter(n);
    }
    
}
