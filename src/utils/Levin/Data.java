package utils.Levin;

import java.io.*;

public class Data {
    public static void in() throws IOException{
        File file = new File("./output.txt");
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        String str = null;
        while(dataInputStream.available()>0){
            str = dataInputStream.readLine();
            System.out.println(str);
        }
    }
    public static void out(String[] str) throws IOException{
        File file = new File("./output.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file,true));
        int flag = 0;
        for(int i = 0;i<str.length;i++){
            if(flag<5) {
                dataOutputStream.writeBytes(str[i]);
                flag++;
            } else {
                flag = 0;
                dataOutputStream.writeBytes("\n");
                dataOutputStream.writeBytes(str[i]);
                flag++;
            }
        }
        dataOutputStream.writeBytes("\n");
    }
}
