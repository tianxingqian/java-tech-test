package com.iday.bigfile;

import java.io.*;

public class ReadBigFile {

    /**
     * 处理大的SQL备份文件，取到日志表的内容  mis_data_opt_log
     * 将包含 mis_data_opt_log 的数据都去掉
     * @param fileName
     * @throws IOException
     */
    public void readBigFile(String fileName) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + ".bak"));

        String line = null;
        while ((line = reader.readLine()) != null) {
            if (line.contains("INSERT INTO `mis_data_opt_log`")) {
                continue;
            }
            if (line.contains("INSERT INTO `mis_login_log`")) {
                continue;
            }
            if (line.contains("INSERT INTO `mis_sms`")) {
                continue;
            }
            if (line.contains("INSERT INTO `igrt_data_receive`")) {
                continue;
            }
            if (line.contains("INSERT INTO `mqa_system_log`")) {
                continue;
            }
            if (line.contains("INSERT INTO `mqa_qatool_log`")) {
                continue;
            }
            if (line.contains("INSERT INTO `plan_sys_operating_log`")) {
                continue;
            }
            if (line.contains("INSERT INTO `plan_sys_operate_log`")) {
                continue;
            }
            if (line.contains("INSERT INTO `mosaiq_treatment`")) {
                continue;
            }
            if (line.contains("INSERT INTO `mosaiq_schedule`")) {
                continue;
            }
            if (line.contains("INSERT INTO `mosaiq_plan`")) {
                continue;
            }
            if (line.contains("INSERT INTO `mosaiq_patient`")) {
                continue;
            }

            writer.write(line);
            writer.newLine();
            writer.flush();
        }
        writer.flush();
        writer.close();
        reader.close();
    }

}
