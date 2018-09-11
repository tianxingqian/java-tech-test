package iday;

import java.io.IOException;

/**
 * @ClassName StringDemo
 * @Description TODO
 * @Author Administrator
 * @Date 2018/7/25 13:22
 * @Version 1.0
 **/
public class StringDemo {

    static String str0 = "0123456789";
    static String str1 = "0123456789";
    String str2 = str1.substring(5);
    String str3 = new String(str2);
    String str4 = new String(str3.toCharArray());

    public static void main(String[] args) throws IOException {
        str0 = null;

        System.in.read();
    }


}
