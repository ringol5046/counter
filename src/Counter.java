
import static java.lang.System.in;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
