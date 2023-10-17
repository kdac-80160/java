package com.sunbeam;

public class ExceptionLineTooLong extends RuntimeException {
private int error;
private String message;
public ExceptionLineTooLong(int error, String message) {
	this.error = error;
	this.message = message;
}
@Override
public String toString() {
	return "ExceptionLineTooLong [error=" + error + ", message=" + message + "]";
}



}
