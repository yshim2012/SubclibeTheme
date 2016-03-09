package regex1;

public class regex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sddqqqqfgkkkhjppppkl";
		String[] arr = str.split("(.)\\1+");
		for(String s : arr)                
		{                                  
		System.out.println(s);         
		}  

	}
}
