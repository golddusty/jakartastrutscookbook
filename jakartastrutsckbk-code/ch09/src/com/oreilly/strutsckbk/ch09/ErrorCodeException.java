package com.oreilly.strutsckbk.ch09;

public class ErrorCodeException extends Exception {
    
    public ErrorCodeException(int code) {
        this.code = code;
    }
    public ErrorCodeException(int code, Object[] args) {
        this.code = code;
        this.args = args;
    }
    public ErrorCodeException(int code, Object[] args, String msg) {
        super(msg);
        this.code = code;
        this.args = args;
    }
    public ErrorCodeException(int code, Object[] args, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
        this.args = args;
    }

    public int getCode() {
        return code;
    }

    public Object[] getArgs() {
        return args;
    }
    private Object[] args;
    private int code;
}
