package com.iday.http;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 从FTP读取文件
 */
public class ReadFtpFile {

    public static void main(String[] args) throws Exception {
        FTPClient client = new FTPClient();
        int reply;
        client.connect("192.168.6.78", 21);
        client.login("xiao", null);
        reply = client.getReplyCode();
        if (! FTPReply.isPositiveCompletion(reply)) {
            client.disconnect();
        }

//        client.changeWorkingDirectory("logging");
        FTPFile[] fs = client.mlistDir("logging");
//        FTPFile[] fs = client.listFiles();
        byte[] data = new byte[1024];
        for(FTPFile ff:fs){

//            System.out.println(ff.getName());
//            System.out.println(ff.getTimestamp().getTime());
//            System.out.println(ff.isDirectory());
            StringBuilder sb = new StringBuilder();
            int x = 0;
            if (ff.isFile() && ff.getName().equalsIgnoreCase("LOG0018")) {
                sb.delete(0, sb.length());
                File file = new File(sb.append("e:/ftptest/" ).append(ff.getName()).toString());

                OutputStream outputStream = new FileOutputStream(file);
                InputStream inputStream = client.retrieveFileStream("logging/" + ff.getName());

                x = inputStream.read(data);
                while((x = inputStream.read(data)) > 0) {
                    System.out.println(data);
                }
//                client.retrieveFile("logging/" + ff.getName(), outputStream);
//                outputStream.flush();
                outputStream.close();
            }
        }
        client.logout();
    }
}
