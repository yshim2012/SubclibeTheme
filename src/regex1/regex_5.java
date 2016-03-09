package regex1;

public class regex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eMail_1 = "qahai@skah.hsi";
		String eMail_2 = "qahai@skah.com.cn.com";
		System.out.println(checkEmail(eMail_1)+"  "+checkEmail(eMail_2));
	}
	public static boolean checkEmail(String eMail){
		return eMail.matches("[a-zA-Z1-9][a-zA-Z0-9]{4,10}@[a-z0-9]{1,6}(\\.[a-z0-9]{2,5}){1,2}");
	}

}
