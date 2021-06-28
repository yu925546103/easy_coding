package demo.chacter3;

import java.net.URL;

/**
 * @Author yujt
 * @Date 2021/6/27 下午10:19
 * @Version 1.0
 * @Description 查看Bootstrap所有已经加载的类库
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (java.net.URL url : urls) {
            System.out.println(url.toExternalForm());
        }
    }
}
