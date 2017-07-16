package test;
public class DependencyClass{
	
	
	
	public static void main(String[] args) {
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		ClassLoader loaderp = classloader.getParent();
		ClassLoader loaderpp = loaderp.getParent();
		System.out.println(classloader);
		System.out.println(loaderp);
		System.out.println(loaderpp);
		
	}
	
	
	
	
	
	
	
}