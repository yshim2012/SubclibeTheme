package regex1;

public class regex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "asgx";
		String str2= "@";
		boolean b = str1.matches(".");//. 	任何字符（与行结束符可能匹配也可能不匹配） 
		boolean c = str2.matches(".");
		boolean d = str2.matches("\\d");
		System.out.println(b+"  "+ c+"  "+ d);
		System.out.println(str2);
/*		\d 	数字：[0-9] 
				\D 	非数字： [^0-9] 
				\s 	空白字符：[ \t\n\x0B\f\r] 
				\S 	非空白字符：[^\s] 
				\w 	单词字符：[a-zA-Z_0-9] 
				\W 	非单词字符：[^\w]
*/
		str2 = "5";
		System.out.println(str2.matches("\\d"));
		str1 = "siahigao";
		System.out.println(str1.matches(".{4,10}[A-Z"));
		System.out.println( "".matches("a+") );
		System.out.println( "aaaaa".matches("a{5}") );
		System.out.println( "aaaaaaaaa".matches("a{5,8}") );
		System.out.println( "aaa".matches("a{5,}") );
		System.out.println( "aaaaab".matches("a{5,}") );

	/*	X?	X，一次或一次也没有		X*	X，零次或多次
		X+	X，一次或多次			X{n}	X，恰好n次
		X{n,}	X，至少n次			X{n,m}	X，至少n次，但是不超过m次*/
	}
}
