package test;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Vector;

import com.sun.management.OperatingSystemMXBean;


public class test{
	public static void main(String[] args) throws ReflectiveOperationException, SecurityException, InterruptedException {
		
		/* ����ϵͳ������    */
		 String osName = System.getProperty("os.name");  
		 System.out.println(osName);
		 
		 
		 /* ����ϵͳ�ļܹ�   */
		 String osArch = System.getProperty("os.arch");
		 System.out.println(osArch);
		 /* ����ϵͳ�İ汾   */
		 String  osVersion = System.getProperty("os.version");
		 System.out.println( osVersion);
		 
		 /* �����ڴ���� */
	     OperatingSystemMXBean osmxb = (OperatingSystemMXBean) ManagementFactory  
	                .getOperatingSystemMXBean(); 
	     /*�ܵ������ڴ� */  
	     long totalMemorySize = osmxb.getTotalPhysicalMemorySize() ;  
	     //* ʣ��������ڴ�  */
	     long freePhysicalMemorySize = osmxb.getFreePhysicalMemorySize() ; 
	     
	     /* ϵͳ���� */
		 Properties props = System.getProperties();
		 /* Java�����л����汾 */
		 String javaVersion = props.getProperty("java.version");
		 /* Java����ʱ�����淶�汾 */
		 String javaVersionSpecification = props.getProperty("java.specification.version");

	     
		 
		 Runtime run = Runtime.getRuntime();
		 /* JVM�ܵ��ڴ� */
		 double totalMemery = run.totalMemory();
		 /*JVM ʣ���ڴ� */
		 double freeMemory = run.freeMemory();
		 /*JVM �������ĸ���*/
		 int availableProcessors = run.availableProcessors();
		 
		 /*  C�̵�ʹ�����  */
		 File file = new File("c:");  
	        long totalSpace = file.getTotalSpace();  
	        long freeSpace = file.getFreeSpace();  
	        long usedSpace = totalSpace - freeSpace;
	        
	     File[] roots = File.listRoots();  
	     for (File _file : roots) {  
	          System.out.println(_file.getPath());  
	          //System.out.println(_file.getName());  
	          System.out.println("Free space = " + _file.getFreeSpace());  
	          System.out.println("Usable space = " + _file.getUsableSpace());  
	          System.out.println("Total space = " + _file.getTotalSpace());  
	          System.out.println("used space  = " + (_file.getTotalSpace()-_file.getFreeSpace()));  
	          System.out.println();  
	      } 
	         
	         
	       	        	   
	     /* ��õ�ǰ���ص��� ����jdk*/   	      

	    Field f=ClassLoader.class.getDeclaredField("classes");
	    f.setAccessible(true);
	    Vector classes=(Vector)f.get(ClassLoader.getSystemClassLoader());
	    System.out.println("�������У� "+classes);
	      
	       
        /* ���PID */
        String name = ManagementFactory.getRuntimeMXBean().getName();          
        String pid = name.split("@")[0];    
        System.out.println("Pid is:" + pid);
	        	    
		 
	    System.out.println("�������ڴ�"+(double)totalMemorySize/1024 +"kb");
	    System.out.println("ʣ�������ڴ�"+(double)freePhysicalMemorySize/1024/1024/1024 +"Gb");
		 
		System.out.println("JVM����ʹ�õ����ڴ�:"+ run.totalMemory()/1024/1024 +" Mb");
		System.out.println("JVM����ʹ�õ�ʣ���ڴ�:"+ run.freeMemory()/1024/1024+" Mb");
		System.out.println("JVM����ʹ�õĴ���������:"+ run.availableProcessors());
		 
		 

		System.out.println("Java�����л����汾��"+ props.getProperty("java.version"));
		System.out.println("Java����ʱ�����淶�汾��"+ props.getProperty("java.specification.version"));

	  
	    System.out.println("�ܿռ��С : " + totalSpace / 1024 / 1024 / 1024 + "G");  
	    System.out.println("ʣ��ռ��С : " + freeSpace / 1024 / 1024 / 1024 + "G");  
	    System.out.println("���ÿռ��С : " + usedSpace / 1024 / 1024 / 1024 + "G");  
		
	        
	    Thread.sleep(10000);
	        
	}
	
  
		   
		
	
	
}