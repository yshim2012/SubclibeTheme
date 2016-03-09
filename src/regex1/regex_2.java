package regex1;

public class regex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//需求：校验QQ号，要求：必须是5~15位数字，0不能开头。没有正则表达式之前
		String qq = "1546465g45";
		System.out.println(checkQQNumber1(qq)+"   "+checkQQNumber2(qq));
		
	}
	public static boolean checkQQNumber1 (String QQNumber){
		char[] qn = QQNumber.toCharArray();
		if(qn.length<5 && qn.length>15){
			return false;
		} else{
			if(qn[0]=='0'){
				return false;
			} else{
				try{
					long a = Long.parseLong(QQNumber);	
					return true;
				}
				catch (Exception e){	
					return false;
				}
			}
		}
	}
	public static boolean checkQQNumber2(String QQNumber){
		return QQNumber.matches("[1-9]\\d{4,14}");
	}
}
