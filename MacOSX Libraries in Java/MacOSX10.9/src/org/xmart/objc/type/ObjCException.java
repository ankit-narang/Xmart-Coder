package org.xmart.objc.type;

@SuppressWarnings("serial")
public class ObjCException extends RuntimeException {

    public ObjCException(String message) {
        super(message);
    }

    public ObjCException() {
        super();
    }

    public ObjCException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjCException(Throwable cause) {
        super(cause);
    }

}
