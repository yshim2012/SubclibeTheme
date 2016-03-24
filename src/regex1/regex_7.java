package regex1;

public class regex_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "我我我还想想回去了了啊啊啊啊";
		String regex = "(.)\\1+";
		str = str.replaceAll(regex, "$1");
		System.out.println(str);
	}
}
