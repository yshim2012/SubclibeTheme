package regex1;

public class regex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "asgx";
		String str2= "@";
		boolean b = str1.matches(".");//. 	�κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 
		boolean c = str2.matches(".");
		boolean d = str2.matches("\\d");
		System.out.println(b+"  "+ c+"  "+ d);
		System.out.println(str2);
/*		\d 	���֣�[0-9] 
				\D 	�����֣� [^0-9] 
				\s 	�հ��ַ���[ \t\n\x0B\f\r] 
				\S 	�ǿհ��ַ���[^\s] 
				\w 	�����ַ���[a-zA-Z_0-9] 
				\W 	�ǵ����ַ���[^\w]
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

	/*	X?	X��һ�λ�һ��Ҳû��		X*	X����λ���
		X+	X��һ�λ���			X{n}	X��ǡ��n��
		X{n,}	X������n��			X{n,m}	X������n�Σ����ǲ�����m��*/
	}
}
