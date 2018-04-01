package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> rst = new ArrayList<String>();
        for (String s : collection1) {
            if (collection2.contains(s)) {
                rst.add(s);
            }
        }
        return rst;
    }
}
