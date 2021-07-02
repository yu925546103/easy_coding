package demo.chacter6;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yujt
 * @Date 2021/6/30 下午12:38
 * @Version 1.0
 */
public class ListNoGeneric {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        a1.add(new Object());
        a1.add(new Integer(111));
        a1.add("a1");

        List<Object> a2 = a1;
        a2.add(new Object());
        a2.add(new Integer(222));
        a2.add("a2");

        List<Integer> a3 = a1;
        a3.add(new Integer(333));
        //a3.add(new Object());

        List<?> a4 = a1;
        a1.remove(0);
        a4.clear();
        //a4.add(new Object[]);

    }
}
