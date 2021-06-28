package demo.chacter2;

/**
 * @Author yujt
 * @Date 2021/6/27 上午8:54
 * @Version 1.0
 */
public class ParamPassing {
    private static int intStatic = 222;
    private static String stringStatic = "old String";
    private static StringBuilder stringBuilderStatic
            = new StringBuilder("old stringBuilder");

    public static void main(String[] args) {
        //实参调用
        method(intStatic);
        method(stringStatic);
        method(stringBuilderStatic,stringBuilderStatic);

        //输出222
        System.out.println(intStatic);
        //输出777
        method();
        System.out.println(intStatic);
        //输出"old string"
        System.out.println(stringStatic);
        //输出""
        System.out.println(stringBuilderStatic);
    }

    private static void method(int intStatic) {
        intStatic = 777;
    }

    private static void method() {
        intStatic = 777;
    }

    private static void method(String stringStatic) {
        stringStatic = "new string";
    }

    private static void method(StringBuilder stringBuilderStatic1,StringBuilder stringBuilderStatic2) {
        stringBuilderStatic1.append(".method.first-");
        stringBuilderStatic2.append("method.second-");

        stringBuilderStatic1 = new StringBuilder("new stringBuilder");
        stringBuilderStatic1.append("new method's append");
    }
}
