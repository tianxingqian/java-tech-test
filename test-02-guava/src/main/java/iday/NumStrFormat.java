package iday;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName NumStrFormat
 * @Description TODO
 * @Author Administrator
 * @Date 2018/7/24 18:44
 * @Version 1.0
 **/
public class NumStrFormat {

    public static void main(String[] args) {
        String numStr = "0.01000300";
//        String numStr = "120";

        String patternSt = "0*\\$";

        Pattern pattern = Pattern.compile(patternSt);
        Matcher matcher = pattern.matcher(numStr);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }


        DecimalFormat decimalFormat = new DecimalFormat("###############0.######");
        System.out.println(decimalFormat.format(Double.valueOf(numStr)));
    }
}
