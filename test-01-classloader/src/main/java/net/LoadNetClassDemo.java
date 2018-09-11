package net;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class LoadNetClassDemo {


    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        URL url = new URL("http://192.168.6.78/class/");
        URLClassLoader classLoader = new URLClassLoader(new URL[]{url});

        Object obj = classLoader.loadClass("com.iday.classloader.net.test.TheLoadedClass1").newInstance();

        System.out.println(obj.getClass());
    }

}
