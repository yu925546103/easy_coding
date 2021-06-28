package demo.chacter2;

/**
 * @Author yujt
 * @Date 2021/6/27 下午6:55
 * @Version 1.0
 */
public class StoveDemo {
    public static <T> T heat(T food) {
        System.out.println(food.toString() + " is done");
        return food;
    }

    public static void main(String[] args) {
        Meat meat = new Meat();
        meat = StoveDemo.heat(meat);

        Soup soup = new Soup();
        soup = StoveDemo.heat(soup);
    }

    public static class Food {

    }

    public static class  Meat extends Food {
        @Override
        public String toString() {
            return "Meat";
        }
    }

    public static class Soup extends Food {
        @Override
        public String toString() {
            return "Soup";
        }
    }
}
