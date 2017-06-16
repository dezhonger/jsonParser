package parser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dezhonger on 2017/6/16..
 */
public class JArray implements Json, Value {

    public static void main(String[] args) {
        List<Json> list1 = new ArrayList<>();
        list1.add(new Primary("1"));
        list1.add(new Primary("2"));
        JArray j1 = new JArray(list1);
        List<Json> list2 = new ArrayList<>();
        list2.add(new Primary("3"));
        list2.add(new Primary("4"));
        JArray j2 = new JArray(list2);
        List<Json> result = new ArrayList<>();
        result.add(j1);
        result.add(j2);
        JArray jArray = new JArray(result);
        System.out.println(jArray);
    }

    private List<Json> list = new ArrayList<>();

    public JArray(List<Json> list) {
        this.list = list;
    }

    public int length() {
        return list.size();
    }

    public void add(Json element) {
        list.add(element);
    }

    public Json get(int i) {
        return list.get(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i =0; i < list.size(); i++) {
            sb.append(list.get(i).toString());
            if (i != list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }

    @Override
    public Object value() {
        return this;
    }
}
