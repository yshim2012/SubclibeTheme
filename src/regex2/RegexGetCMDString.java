package regex2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGetCMDString <T> {

	public static void main(String[] args) {
		ArrayList<String> arr = new GetCMDString().Get_CMDString();
		ArrayList<String> port = new ArrayList<String>();
		ArrayList<String> portNumber = new ArrayList<String>();
		ArrayList<Mode> mode = new ArrayList<Mode>();
		String str = arr.toString();
		System.out.println(str);
		str = "[, 设备状态 CON:, ---------,     行:　       300,     列:　　     80,     键盘速度:   31,"
		+ "     键盘延迟:　 1,     代码页:     936, [, 设备状态 CON2:, ---------,     "
				+ "行:　       356,     列:　　     80,     键盘速度:   31,     键盘延迟:　 1,     代码页:     936, ]";
		String regex1 = "con{0,1}[1-9]{0,1}|CON{0,1}[1-9]{0,1}";
		arr.clear();
		arr = myMatcher(arr,str,regex1);
		str = str.replaceAll("\\s+|\u3000", "");
		String regex2 = "行:[0-9]{3}";
		port = myMatcher(port,str,regex2);
		for(int i = 0;i<port.size();i++){
			String regex3 = "行:[0-9]{3}";
		    portNumber = myMatcher(portNumber,port.get(i),regex3);
		}
		if (arr.size()==portNumber.size()){
			for(int i = 0;i<portNumber.size();i++){
				Mode m =new Mode();
				m.setPort(arr.get(i).toString());
				m.setLineNumber(portNumber.get(i).toString());;
				mode.add(m);
			}
			System.out.println(mode.toString());
		} else {
			System.out.println("程序出错！！");
		}	
	}

	@SuppressWarnings("unchecked")
	public static <T> ArrayList<T> myMatcher(ArrayList<T> t,String str,String regex){
		Pattern p1 =Pattern.compile(regex);
		Matcher m1 = p1.matcher(str);
		while(m1.find()){
			//System.out.println(m.start()+"...."+m.end());    
			t.add((T) m1.group());
		}
		return t;
	}
}
