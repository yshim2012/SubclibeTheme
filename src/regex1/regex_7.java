package regex1;

public class regex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "�����һ������ȥ���˰�������";
		String regex = "(.)\\1+";
		str = str.replaceAll(regex, "$1");
		System.out.println(str);
	}
}
