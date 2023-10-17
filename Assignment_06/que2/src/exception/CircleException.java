package exception;

public class CircleException extends RuntimeException {
private double fieldvalue;
private String fieldname;

public CircleException() {
	
}

public CircleException(double field, String message) {
	this.fieldvalue = field;
	this.fieldname = message;
}

@Override
public String toString() {
	return "CircleException [fieldvalue=" + fieldvalue + ", fieldname=" + fieldname + "]";
}

}
