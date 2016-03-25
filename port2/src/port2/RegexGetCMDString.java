package port2;

import java.util.ArrayList;
import java.util.Iterator;

public class RegexGetCMDString <T> {

	public static void main(String[] args) {
		ArrayList<String> arr = new GetCMDString().Get_CMDString();
		ArrayList<Mode> mode = new ArrayList<Mode>();
		System.out.println(arr.size());
	//	Iterator<Mode> mt = mode.iterator();
		Iterator<String> it = arr.iterator();
		Mode m =new Mode();
		boolean b = false;
		String regex1 = ".+CO[NM]{1}[1-9]{0,2}.{0,}";
		String temp = "";
		int number = 0;
		ArrayList<String> arr3 =new ArrayList<String>();
		while(it.hasNext()){
			temp = it.next();
			if(temp.matches(regex1)){
	//			System.out.println(temp);
				if(number==0) {
					b=true;
					arr3.add(temp);
				}else {
					System.out.println(arr3.toString());
					m = Data.getData(arr3.get(0),arr3.get(2));
					mode.add(m);
					arr3 = new ArrayList<String>();
					arr3.add(temp);
				}
			} else {
				if (!((number==0)||(number ==arr.size()-2))){	
					arr3.add(temp);
				}
				else if(number ==arr.size()-2){
					System.out.println(arr3.toString());
					m = Data.getData(arr3.get(0),arr3.get(2));
					mode.add(m);
				}
			}
			if(b){number++;}
		}
		for(int i = 0;i<mode.size();i++){
			Mode md = mode.get(i);
			System.out.println(md.getPort()+"  "+md.getLineNumber());
		}	
//		while(mt.hasNext()){
//			Mode md =mt.next();
//			//System.out.println(md.getPort()+"  "+md.getLineNumber());
//		}
//		System.out.println(b);
	}
}
