package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> strings = collection2.get("value");
        List<String> rst = new ArrayList<>();
        for (String s : collection1) {
            if (strings.contains(s)) {
                rst.add(s);
            }
        }
        return rst;
    }
}
