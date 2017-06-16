import model.LatestNews;
import parser.Parser;
import util.HttpUtil;

/**
 * Created by dezhonger on 2017/6/16.
 */
public class SimpleJSONTest {
    public static final String urlString = "http://news-at.zhihu.com/api/4/news/latest";
    public static void main(String[] args) throws Exception {
        String jsonString = new String(HttpUtil.get(urlString));
        LatestNews latest = Parser.fromJson(jsonString, LatestNews.class);
       
//        long endTime = System.currentTimeMillis();
//        double time = (double) (endTime - startTime) / 1000.0;
//        System.out.println("took " + time + "seconds.");
//
//        System.out.println(latest.getDate());
//        for (int i = 0; i < latest.getTop_stories().size(); i++) {
//            System.out.println(latest.getTop_stories().get(i));
//        }
//        for (int i = 0; i < latest.getStories().size(); i++) {
//            System.out.println(latest.getStories().get(i));
//        }
    }
}
