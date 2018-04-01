package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        for (String s : collectionA) {
            if (s.length() == 1) {
                if (collection3.containsKey(s)) {
                    collection3.put(s, collection3.get(s) + 1);
                } else {
                    collection3.put(s, 1);
                }

            } else {
                String k = s.substring(0, 1);
//                Integer n = Integer.parseInt(s.replaceAll("\\D", ""));
                Integer n = getNumber(s);
                if (collection3.containsKey(k)) {
                    collection3.put(k, collection3.get(k) + n);
                } else {
                    collection3.put(k, n);
                }

            }
        }

        List<String> collection2 = object.get("value");
        for (String s : collection2) {
            if (collection3.containsKey(s)) {
                collection3.put(s, collection3.get(s) - collection3.get(s) / 3);
            }
        }
        return collection3;
    }

    private Integer getNumber(String s) {
        List<Integer> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                chars.add(i);
            }
        }
        Integer start_index = chars.get(0);
        if (chars.size() != 1) {
            Integer end_index = chars.get(chars.size()-1);
            return Integer.parseInt(s.substring(start_index, end_index+1));
        } else {
            return Integer.parseInt(s.substring(start_index, start_index+1));
        }

    }
}
