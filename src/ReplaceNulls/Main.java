package ReplaceNulls;
import java.util.*;
public class Main {




        public static void main(String[] args) {


            //Test
            Map<String, String> location =  new HashMap<>();
            location.put("id",  "1");
            location.put("latitude", "0.0");
            location.put("longitude", "0.0");
            location.put("address", "169 Rath Rapids");
            location.put("building_name", null);
            location.put("location_type_label", "Home");
            location.put("apartment_name", null);
            location.put("require_permission", "false");
            location.put("city", null);
            location.put("zip_code", null);
            System.out.println(removeNulls(location));

        }


        public static Map<String, String> removeNulls(Map<String, String> map){
            Map<String, String> location =  new HashMap<>();


            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    map.put(entry.getKey(),entry.getValue());
                }else{
                    map.put(entry.getKey(),"");
                }
            }

            return map;
        }
    }
