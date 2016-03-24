package regex1;

public class regex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub                                                           
		String str = "aa.bb.cc";                                
		str = "-1     99    4    23";                           
		String[] arr = str.split(" +");                         
		for(String s : arr)                                     
		{                                                       
			System.out.println(s);                              
		}                                                       
	}
}
