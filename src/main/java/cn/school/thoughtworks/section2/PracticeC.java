package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        System.out.println("collection1 = [" + collection1 + "]");
        Map<String, Integer> rst = new HashMap<>();
        for (String s : collection1) {
            if (s.length() == 1) {
                if (rst.containsKey(s)) {
                    rst.put(s, rst.get(s) + 1);
                } else {
                    rst.put(s, 1);
                }
            } else {
                String k = s.substring(0, 1);
                System.out.println("key : " + k);
//                Integer n = Integer.parseInt(s.replaceAll("\\D", ""));
                Integer n = getNumber(s);
                System.out.println("number : " + n);
                if (rst.containsKey(k)) {
                    rst.put(k, rst.get(k) + n);
                } else {
                    rst.put(k, n);
                }
            }
        }
        return rst;
    }

    public Integer getNumber(String s) {
        System.out.println("PracticeC.getNumber");
        System.out.println("s = [" + s + "]");
        List<Integer> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 48 && c <= 57) {
                chars.add(i);
            }
        }
        System.out.println("chars = [" + chars + "]");
        Integer start_index = chars.get(0);
        if (chars.size() != 1) {
            Integer end_index = chars.get(chars.size()-1);
            return Integer.parseInt(s.substring(start_index, end_index+1));
        } else {
            return Integer.parseInt(s.substring(start_index, start_index+1));
        }

    }
}
