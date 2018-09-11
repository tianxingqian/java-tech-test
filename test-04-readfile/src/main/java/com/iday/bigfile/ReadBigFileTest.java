package com.iday.bigfile;



import org.junit.Test;

import java.io.IOException;


public class ReadBigFileTest {


    @Test
    public void readBigFile() throws IOException {
        ReadBigFile readBigFile = new ReadBigFile();
//        readBigFile.readBigFile("D:\\工作文件\\质控系统\\mqa_plan_db_2018-5-15\\mqa_plan.sql");
//        readBigFile.readBigFile("D:\\工作文件\\质控系统\\数据库\\mqa_plan_18.6.11\\mqa_plan.sql");
//        readBigFile.readBigFile("D:\\mqa_plan_1807191724.sql");
        readBigFile.readBigFile("D:\\mqa_plan_1808271041.sql");
    }
}
