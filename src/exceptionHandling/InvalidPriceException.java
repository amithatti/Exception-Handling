package exceptionHandling;

public class InvalidPriceException extends Exception {
	String msg;
	public InvalidPriceException(String msg) {
		super();
		this.msg = msg;
	}
	public String msg() {
		return msg;
	}
}
