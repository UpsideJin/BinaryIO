package utils.Levin;

import java.io.*;
import java.util.Arrays;

public class Stream {
    public static void in() throws IOException {
        File fl = new File("./output.txt");
        FileInputStream fileInputStream = new FileInputStream(fl);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = null;
       while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
       }
    }

    public static void out(String[] str) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("./output.txt",true);
        int flag = 0;
        for (int i = 0; i < str.length; i++) {
            if(flag<5) {
                fileOutputStream.write(str[i].getBytes());
                flag++;
            }else{
                flag = 0;
                fileOutputStream.write("\r\n".getBytes());
                fileOutputStream.write(str[i].getBytes());
                flag++;
            }
        }
        fileOutputStream.write("\r\n".getBytes());
    }
}
