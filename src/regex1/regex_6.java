package regex1;

public class regex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "18520929620";
		String reg= "1[34578]\\d{9}";
		str =str.replaceAll(reg,"******");
		System.out.println(str);

	}
}
