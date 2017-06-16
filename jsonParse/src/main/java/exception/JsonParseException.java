package exception;


import java.io.IOException;

/**
 * Created by dezhonger on 2017/6/16.
 */
public class JsonParseException extends IOException {
    public JsonParseException(String msg) {
        super(msg);
    }
}
