package port2;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Data <T>{
	public static String getModePort(String str){
		String regex1 = "CO[NM]{0,1}[0-9]{0,2}";
		ArrayList<String> arr = new ArrayList<String>();
		arr = myMatcher(arr,str,regex1);
		System.out.println(arr.get(0));
		return arr.get(0);
	}
	public static String getBaudRate(String str){
		String regex2 = "[0-9]{3,5}";
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1 = myMatcher(arr1,str,regex2);
		System.out.println(arr1.get(0));
		return arr1.get(0);
	}
	public static Mode getData(String port,String baudRate){
		Mode m =new Mode();
		m.setPort(getModePort(port));
		m.setLineNumber(getBaudRate(baudRate));
		
		return m ;
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