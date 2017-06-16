import parser.JArray;
import parser.JObject;
import util.HttpUtil;

import static parser.Parser.parseJSONObject;

/**
 * Created by dezhonger on 2017/6/16.
 */
public class JParsingTest {
    public static final String urlString = "http://news-at.zhihu.com/api/4/news/latest";

    public static void main(String[] args) throws Exception {
        long startTime = 0;
        String jsonString = new String(HttpUtil.get(urlString));
        startTime = System.currentTimeMillis();
//        System.out.println("jsonString = " + jsonString);
        jsonString = "[\n" +
                "    {\n" +
                "      \"images\": [\n" +
                "        \"https:\\/\\/pic1.zhimg.com\\/v2-4fcf88e99daf9d2111acf01ee55a0b98.jpg\"\n" +
                "      ],\n" +
                "      \"type\": 0,\n" +
                "      \"id\": 9476391,\n" +
                "      \"ga_prefix\": \"061510\",\n" +
                "      \"title\": \"我好冷，快拿张「锡箔纸」把我裹起来\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"title\": \"穿过我的胸的你的脸：40 年前，《异形》让影院炸开了锅\",\n" +
                "      \"ga_prefix\": \"061509\",\n" +
                "      \"images\": [\n" +
                "        \"https:\\/\\/pic2.zhimg.com\\/v2-9028ab0c3de09c8c7a2a2554c5392995.jpg\"\n" +
                "      ],\n" +
                "      \"multipic\": true,\n" +
                "      \"type\": 0,\n" +
                "      \"id\": 9476137\n" +
                "    },\n" +
                "    {\n" +
                "      \"images\": [\n" +
                "        \"https:\\/\\/pic2.zhimg.com\\/v2-200329925f1f1b89a79390647d0f9b61.jpg\"\n" +
                "      ],\n" +
                "      \"type\": 0,\n" +
                "      \"id\": 9473696,\n" +
                "      \"ga_prefix\": \"061508\",\n" +
                "      \"title\": \"公司不发电脑改发 iPad，行政你在逗我吗？\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"images\": [\n" +
                "        \"https:\\/\\/pic3.zhimg.com\\/v2-a04f09ade36ea16f4002e96a4e75f0fe.jpg\"\n" +
                "      ],\n" +
                "      \"type\": 0,\n" +
                "      \"id\": 9476254,\n" +
                "      \"ga_prefix\": \"061507\",\n" +
                "      \"title\": \"暴露年龄，你居然把上网叫「冲浪」?\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"images\": [\n" +
                "        \"https:\\/\\/pic1.zhimg.com\\/v2-928f539542572d79e338c820edf11c6c.jpg\"\n" +
                "      ],\n" +
                "      \"type\": 0,\n" +
                "      \"id\": 9476322,\n" +
                "      \"ga_prefix\": \"061507\",\n" +
                "      \"title\": \"防火防盗防熊孩子，摆手办也不是一件容易事\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"images\": [\n" +
                "        \"https:\\/\\/pic1.zhimg.com\\/v2-ea4a6122d57bfd2937a49d13c97d4368.jpg\"\n" +
                "      ],\n" +
                "      \"type\": 0,\n" +
                "      \"id\": 9476431,\n" +
                "      \"ga_prefix\": \"061507\",\n" +
                "      \"title\": \"刑拘 12 天还要被罚款，擅自开了下飞机滑梯，有必要判这么重吗？\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"images\": [\n" +
                "        \"https:\\/\\/pic4.zhimg.com\\/v2-5c09c2adcd0d471ee3f41ae84d82bccf.jpg\"\n" +
                "      ],\n" +
                "      \"type\": 0,\n" +
                "      \"id\": 9474542,\n" +
                "      \"ga_prefix\": \"061506\",\n" +
                "      \"title\": \"瞎扯 · 如何正确地吐槽\"\n" +
                "    }\n" +
                "  ]";


        jsonString = "{\"date\" : [ [ 1, 2 ], [ 3, 4 ] ]}";
        JObject js2 = parseJSONObject(jsonString);
        System.out.println(js2);
        JArray ja = js2.getJArray("date");
        System.out.println(ja);
        for(int i = 0; i < ja.length(); i++) {
            System.out.println(ja.get(i));
            for(int j = 0; j < ((JArray)ja.get(i)).length(); j++) {
                System.out.println(((JArray) ja.get(i)).get(j));
            }
        }

//        JObject latestNewsJSON = parseJSONObject(jsonString);
//        String date = latestNewsJSON.getString("date");
//        JArray top_storiesJSON = latestNewsJSON.getJArray("top_stories");
//        LatestNews latest = new LatestNews();
//        List<LatestNews.TopStory> stories = new ArrayList<>();
//        for (int i = 0; i < top_storiesJSON.length(); i++) {
//            LatestNews.TopStory story = new LatestNews.TopStory();
//            story.setId(((JObject) top_storiesJSON.get(i)).getInt("id"));
//            story.setType(((JObject) top_storiesJSON.get(i)).getInt("type"));
//            story.setImage(((JObject) top_storiesJSON.get(i)).getString("image"));
//            story.setTitle(((JObject) top_storiesJSON.get(i)).getString("title"));
//            stories.add(story);
//        }
//
//        long endTime = System.currentTimeMillis();
//        double time = (double) (endTime - startTime) / 1000.0;
//        System.out.println("took " + time + "seconds.");
//
//        latest.setDate(date);
//        System.out.println("date: " + latest.getDate());
//        for (int i = 0; i < stories.size(); i++) {
//            System.out.println(stories.get(i));
//        }


    }
}
