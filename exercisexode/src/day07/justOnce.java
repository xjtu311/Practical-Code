package day07;

public class justOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sabcfbaccde";
		System.out.println(once(str));

	}
	
	
	static char once(String str){
		if(str == "")
			throw new RuntimeException("null string");
		else{
			if(str.length() ==1)
				return str.toCharArray()[0];
			else{
				char temp = 0 ;
				int j = 0;
				for(int i = 0; i<str.length();i++){
					temp = str.charAt(i);
					j = i+1;
					while(j<str.length()){
						if(str.charAt(j) == temp){
							temp =0;
							j =0;
							break;
						}

						else
							j++;
					}
					if(j==str.length())
						return temp;
				}
			}
			throw new RuntimeException("no char!");
		}
		
	}

}
