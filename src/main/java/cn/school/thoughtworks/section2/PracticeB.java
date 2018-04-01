package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
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
                System.out.println("expect d : " + k);
                Integer n = Integer.parseInt(s.substring(2));
                System.out.println("expect 5 : " + n);
                if (rst.containsKey(k)) {
                    rst.put(k, rst.get(k) + n);
                } else {
                    rst.put(k, n);
                }
            }
        }
        return rst;
    }
}
