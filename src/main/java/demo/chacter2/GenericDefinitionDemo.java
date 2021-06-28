package demo.chacter2;

/**
 * @Author yujt
 * @Date 2021/6/27 下午6:46
 * @Version 1.0
 */
public class GenericDefinitionDemo<T> {
    static <String,T,Alibaba> String get(String string,Alibaba alibaba) {
        return string;
    }

    public static void main(String[] args) {
        Integer first = 222;
        Long second = 333L;

        Integer result = get(first,second);
        System.out.println(result);
    }


}
