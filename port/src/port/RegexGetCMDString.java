package port;

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
		String regex1 = "CO[NM]{0,1}[1-9]{0,2}";
		arr.clear();
		arr = myMatcher(arr,str,regex1);
	//	System.out.println(arr.size());
		str = str.replaceAll("\\s+|\u3000", "");
		String regex2 = "行:[0-9]{3,5}|波特率:[0-9]{3,5}";
		port = myMatcher(port,str,regex2);
	//	System.out.println(port.toString());
	//	System.out.println(port.size());
		for(int i = 0;i<port.size();i++){
			String regex3 = "[0-9]{3,5}";
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
