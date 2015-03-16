package wsServiceFibonacci;

import javax.jws.WebService;
@WebService 
public class Output { 
    private static final String SALUTATION = "Hello";
    public String getGreeting(String name) { 
        return SALUTATION + " " + name; 
    } 
    
    public String calculateFibonacci( int num ) {

        if (num <= 0) return "bad Input";
        if (num == 1) return Integer.toString(0);
        if (num == 2) return  Integer.toString(0) + " " +  Integer.toString(1) ;
        
        StringBuilder sb = new StringBuilder();
         sb.append(0);sb.append(" ");sb.append(0);
        
        int previous1 = 1, previous2 = 0, fib = 0;


        for (int i=3; i <= num; i++) {
        // the fib is the answer of the previous two answers
        	    sb.append(" ");
                fib = previous1 + previous2;
                sb.append(fib);
                // reset the previous values
                previous2 = previous1;

                previous1 = fib;

        }

        return sb.toString();
   }
    
}