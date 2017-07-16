package day09;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntegrationTest { //test case.  
   
	//result  0.99
/*    public static void main(String[] args) {  
        Integration integration = new Integration();  
        double result = integration.stdGaussValue(4.42);  
          
        System.out.println(result);  
    } */ 
      
	
	//0.6517
 /*   public static void main(String[] args) {  
        Integration integration = new Integration();  
        double upper = 1.0;  
        double lower = 0.0;  
        int n = 50;  
        double realUpper = 0.39;  
          
        double result =   
                integration.simpsonRule(upper, lower, n, new Function() {  
                    @Override  
                    public double fun(double x) {  
                        if(x==0) {  
                            return 0;  
                        }  
                        double t =  realUpper-(1-x)/x;  
                        return Math.pow(Math.E, -0.5*t*t) / (x*x);            
                    }  
                });  
        result /= Math.pow(2*Math.PI, 0.5);  
          
        result = new BigDecimal(result).  
                        setScale(4, RoundingMode.HALF_UP).doubleValue();          
        System.out.println(result);  
    }  */
      
	
	
	//0.3413450158884702
	
    public static void main(String[] args) {  
        Integration integration = new Integration();  
        double upper = 1.0;  
        double lower = 0.0;  
        int n = 40;  
          
        double result =   
                integration.simpsonRule(upper, lower, n, new Function() {  
                    @Override  
                    public double fun(double x) {  
                        return Math.pow(Math.E, -x*x/2);              
                    }  
                });  
        result /= Math.pow(2*Math.PI, 0.5);  
        System.out.println(result);  
          
        BigDecimal decimal = new BigDecimal(result).setScale(4, RoundingMode.HALF_UP);  
         result = Double.valueOf(decimal.toString());  
        System.out.println(result);  
    }  
     
	
	//3.1415926139392147
/*    public static void main(String[] args) {  
        Integration integration = new Integration();  
        double upper = 1.0;  
        double lower = 0;  
        int n = 40;  
          
        double result =   
                integration.simpsonRule(upper, lower, n, new Function() {  
                    @Override  
                    public double fun(double x) {  
                        return 4 / (1+Math.pow(x,2.0));           
                    }  
                });  
        System.out.println(result);  
    } */ 
}  