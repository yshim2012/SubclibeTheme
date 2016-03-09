package regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*获取需要使用到正则的两个对象：使用的是用正则对象Pattern 和匹配器Matcher。
用法：
	范例：
	 Pattern p = Pattern.compile("a*b");
	 Matcher m = p.matcher("aaaaab");
	 boolean b = m.matches();
*/
public class regex_8 {
	public static void main(String[] args){
		String str = "ahaihv ajufb aksh as ashauh ssja shuab sfs";
		String regex = "\\b[a-z]{4}\\b";
		Pattern p =Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while(m.find()){
			//System.out.println(m.start()+"...."+m.end());
			System.out.println(m.group());
		}
	}
}
