package aug22.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        // key / value

        Map<String, String> map = new HashMap<>();
        map.put("name", "John");
        map.put("name", "Peter");


        map.putIfAbsent("password" , "password");

        map.putIfAbsent("password" , "2313131321");
        System.out.println(map.get("name"));

        System.out.println(map);


    }
}

/*
'{"name":"John",
 "email: "email@gmail.com"
"car":null}'
 */