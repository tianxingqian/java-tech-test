package iday;


import java.io.UnsupportedEncodingException;

public class Chartest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = {-62, -71, -62, -88, -62, -67, -61, -102, -61, -112, -61, -79};

//        String str = new String(bytes, "utf-8");
        String str = new String(bytes);
        String str1 = new String(str.getBytes("ISO-8859-1"), "GBK");
        System.out.println(str1);



//        Set<String> charsetNames = Charset.availableCharsets().keySet();
//        System.out.println("-----the number of jdk1.67's charset is "+charsetNames.size()+"-----");
//        for (Iterator it = charsetNames.iterator(); it.hasNext();)
//        {
//            String charsetName = (String) it.next();
////            System.out.println(charsetName);
//
//
//            for (Iterator it1 = charsetNames.iterator(); it1.hasNext();) {
//                String charsetName1 = (String) it1.next();
//                try {
//                    System.out.println(charsetName1 + " - " + charsetName + "\t\t\t" + new String(str.getBytes(charsetName1), charsetName));
//                } catch (Exception e) {
//
//                }
//
//            }
//
//
//        }
    }

}
