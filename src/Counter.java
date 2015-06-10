
import static java.lang.System.in;
import java.util.Scanner;

/*
 *
 Define a class called Counter:
 An object of this class is used to count thing, it records a count that is a nonnegative whole number.
 For the counter class, you need to have:
 
 -a method to set the counter to a given integer
 -a method to increase the count by 1
 -a method to decrease the count by 1.
 -a method that returns the current count value as an integer
 -a method toString that return the current count value as string suitable for display on the screen
 -a method that tests whether the current count value is zero.
 
 be sure that no method allows the value of the counter to become negative.
 
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
        setTotal(n);
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
    
    public String getCount(){
        return Integer.toString(count);
    }
    
    private void setTotal(int n) {
        total=n;
    }
    
    public boolean test(int count){
        if(count!=0){
            return false;
        }
        else{
            return true;
        }
    }
}
