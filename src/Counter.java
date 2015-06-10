
import static java.lang.System.in;
import java.util.Scanner;

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
class Counter {
    
    private int number;
    private int total;
    private int count;
    boolean False;
    
    public Counter (){ 
    }
    
    public Counter(int n){
        total = n;
    }
    
    public void increase (){
        number++;
        total=total+number;
        count=count+number;
    }
    
    public void setCounter(int n){
        setFirst(n);
    }
    
    public void decrease(){
        if(total<0){
            System.out.println("counter cannot be negative number");
        }
        else{
            number--;
            total=total+number;
            count=count+number;
        }
    }
    
    public String getTotal(int total){
        return Integer.toString(total);
    }

    private void setFirst(int n) {
        total=n;
    }
 
    public boolean test(int count){
        if(count!=0){
            return False;
        }
        else{
            return true;
        }
    }
}
