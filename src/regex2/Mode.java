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
		return " 串口号是："+this.getPort() + " 对应的端口号："+this.getLineNumber();
	}
	
}
