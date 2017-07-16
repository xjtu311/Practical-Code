package test;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Vector;

import com.sun.management.OperatingSystemMXBean;


public class test{
	public static void main(String[] args) throws ReflectiveOperationException, SecurityException, InterruptedException {
		
		/* 操作系统的名称    */
		 String osName = System.getProperty("os.name");  
		 System.out.println(osName);
		 
		 
		 /* 操作系统的架构   */
		 String osArch = System.getProperty("os.arch");
		 System.out.println(osArch);
		 /* 操作系统的版本   */
		 String  osVersion = System.getProperty("os.version");
		 System.out.println( osVersion);
		 
		 /* 物理内存计算 */
	     OperatingSystemMXBean osmxb = (OperatingSystemMXBean) ManagementFactory  
	                .getOperatingSystemMXBean(); 
	     /*总的物理内存 */  
	     long totalMemorySize = osmxb.getTotalPhysicalMemorySize() ;  
	     //* 剩余的物理内存  */
	     long freePhysicalMemorySize = osmxb.getFreePhysicalMemorySize() ; 
	     
	     /* 系统特性 */
		 Properties props = System.getProperties();
		 /* Java的运行环境版本 */
		 String javaVersion = props.getProperty("java.version");
		 /* Java运行时环境规范版本 */
		 String javaVersionSpecification = props.getProperty("java.specification.version");

	     
		 
		 Runtime run = Runtime.getRuntime();
		 /* JVM总的内存 */
		 double totalMemery = run.totalMemory();
		 /*JVM 剩余内存 */
		 double freeMemory = run.freeMemory();
		 /*JVM 处理器的个数*/
		 int availableProcessors = run.availableProcessors();
		 
		 /*  C盘的使用情况  */
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
	         
	         
	       	        	   
	     /* 获得当前加载的类 ，非jdk*/   	      

	    Field f=ClassLoader.class.getDeclaredField("classes");
	    f.setAccessible(true);
	    Vector classes=(Vector)f.get(ClassLoader.getSystemClassLoader());
	    System.out.println("加载类有： "+classes);
	      
	       
        /* 获得PID */
        String name = ManagementFactory.getRuntimeMXBean().getName();          
        String pid = name.split("@")[0];    
        System.out.println("Pid is:" + pid);
	        	    
		 
	    System.out.println("总物理内存"+(double)totalMemorySize/1024 +"kb");
	    System.out.println("剩余物理内存"+(double)freePhysicalMemorySize/1024/1024/1024 +"Gb");
		 
		System.out.println("JVM可以使用的总内存:"+ run.totalMemory()/1024/1024 +" Mb");
		System.out.println("JVM可以使用的剩余内存:"+ run.freeMemory()/1024/1024+" Mb");
		System.out.println("JVM可以使用的处理器个数:"+ run.availableProcessors());
		 
		 

		System.out.println("Java的运行环境版本："+ props.getProperty("java.version"));
		System.out.println("Java运行时环境规范版本："+ props.getProperty("java.specification.version"));

	  
	    System.out.println("总空间大小 : " + totalSpace / 1024 / 1024 / 1024 + "G");  
	    System.out.println("剩余空间大小 : " + freeSpace / 1024 / 1024 / 1024 + "G");  
	    System.out.println("已用空间大小 : " + usedSpace / 1024 / 1024 / 1024 + "G");  
		
	        
	    Thread.sleep(10000);
	        
	}
	
  
		   
		
	
	
}