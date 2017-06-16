package tokenizer;

/**
 * Created by dezhonger on 2017/6/16.
 */
public enum TokenType {
    START_OBJ, END_OBJ, START_ARRAY, END_ARRAY, NULL, NUMBER, STRING, BOOLEAN, COLON, COMMA, END_DOC
//    STRING（字符串字面量）
//    NUMBER（数字字面量）
//    NULL（null）
//    START_ARRAY（[）
//    END_ARRAY（]）
//    START_OBJ（{）
//        END_OBJ（}）
//    COMMA（,）
//    COLON（:）
//    BOOLEAN（true或者false）
//    END_DOC（表示JSON数据的结束）
}
