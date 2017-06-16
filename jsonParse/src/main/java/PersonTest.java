import model.Person;
import parser.Parser;

/**
 * Created by dezhonger on 2017/6/16.
 */
public class PersonTest {
    public static void main(String[] args) throws Exception {
        String json = "{\"name\" : \"dezhonger\", \"age\": 12, \"friends\": [\"fri1\", \"fri2\", \"fri3\", \"fri4\"]}";
        Person person = Parser.fromJson(json, Person.class);
        System.out.println(person);
        System.out.println(person.getFriends().size());
    }
}
