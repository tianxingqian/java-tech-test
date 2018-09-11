package com.iday.script;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestScript {

    public static void main(String[] args) throws ScriptException {
//        String str = "43*(2 + 1.4)+2*32/(3-2.1) + 2";
//        String str = "@a - @b * @c ";
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("js");
//        Object result = engine.eval(str);
//        System.out.println("结果类型:" + result.getClass().getName() + ",计算结果:" + result);

//        (@a - @b) * 100      caculate(String ff, Double ... nums) {    }

        System.out.println(caculate("(@a - @b) * @c / @e ", 11, 1, 5, 8));

    }


    public static Double caculate(String formula, double... nums) throws ScriptException {

        String p = "@\\w";
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(formula);
        Vector<String> vector = new Vector<String>(); //存储变量
        //获取变量
        while (matcher.find()) {
            vector.add(matcher.group());
        }
        String t = formula;
        for (int j = 0; j < vector.size(); j++) {
            t = t.replace(vector.get(j), String.valueOf(nums[j]));
        }
        System.out.println("last==" + t);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        ;
        return (Double) engine.eval(t);
    }

}
