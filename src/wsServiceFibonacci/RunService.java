package wsServiceFibonacci;
import javax.xml.ws.Endpoint;

public class RunService { 
    /** 
     *@paramargs 
     */ 
    public static void main(String[] args) { 
        System.out.println("Web Service started."); 
        Endpoint.publish("http://localhost:9090/wsServiceFibonacci" , 
                new Output()); 
    } 
}