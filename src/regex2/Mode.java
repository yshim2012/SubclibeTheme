package regex2;

public class Mode {
	String port ;
	String lineNumber ;
	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String toString(){
		return " ���ں��ǣ�"+this.getPort() + " ��Ӧ�Ķ˿ںţ�"+this.getLineNumber();
	}
	
}
