package day09;

import static java.lang.Math.*;

public class difiniteIntergration{
	// 0~1����n�ȷ�     
	private static int n = 100000;      
	// ��㶨�������e��x�η�, ȡ��x��0~1�Ķ�����;     
	public static double f(double x) {      
		double f;     
		f = 4 / (1+Math.pow(x,2.0));;      
		return f;     
		}      
	
	// ���η��󶨻���     
	/**       
	 * * x0: ��������, xn: ��������      */      
	public static double getDefiniteIntegralByTrapezium(double x0, double xn) {      
		double h = abs(xn - x0) / n;      
		double sum = 0;       
		for (double xi = 0; xi <= xn; xi = xi + h) {      
			sum += (f(xi) + f(xi + h)) * h / 2;      
			}       return sum;     }     
	/**       
	 * * x0: ��������, xn: ��������      
	 * */      
	
	
	// ���η��󶨻���, �ұ߽�      
	public static double getDefiniteIntegralByRectangle1(double x0, double xn) {
		//h: ����      
		double h = abs(xn - x0) / n;      
		double sum = 0;       
		for (double xi = 0; xi <= xn; xi = xi + h) {      
			sum += f(xi + h) * h;      
			}       
		return sum;    
		}       
	
	// ���η��󶨻���, ��߽�      
	public static double getDefiniteIntegralByRectangle2(double x0, double xn) {      
		double h = abs(xn - x0) / n;     
		double sum = 0;         
		for (double xi = 0; xi <= xn; xi = xi + h) { 

			
			sum  +=  f(xi)  *  h;            
			}  
		          return  sum;          
		}  
		         
	/**
	 *  ���Զ�����           
	 * 
	 */  
		        
		public  static  void  main(String[]  args)  {  
		          System.out.println(getDefiniteIntegralByTrapezium(0,  1));           
		          System.out.println(getDefiniteIntegralByRectangle1(0,  1));            
		          System.out.println(getDefiniteIntegralByRectangle2(0,  1));         
		       }      
		  
		  
		 
	}


