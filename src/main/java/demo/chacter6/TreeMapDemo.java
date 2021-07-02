package demo.chacter6;

import java.util.TreeMap;

/**
 * @Author yujt
 * @Date 2021/7/2 下午12:32
 * @Version 1.0
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(55,"fifty-five");
        treeMap.put(56,"fifty-six");
        treeMap.put(57,"fifty-seven");
        treeMap.put(58,"fifty-eight");
        treeMap.put(83,"eighty-three");
        treeMap.remove(57);
        treeMap.put(59,"fifty-nine");
    }
}
