package utils.Levin;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Modules {
    public static void show() {
        System.out.println("请选择你的操作方式：");
        System.out.println("1.字节流输入输出");
        System.out.println("2.数据转化流输入输出");
        System.out.println("3.计算已写入output.txt中，某列的均值");
        System.out.println("Tips：输入-1可退出程序");
        System.out.println("请输入你的选择：");
    }

    public static void caculate(int m)  {
        try{
            File fl = new File("./output.txt");
            if(!(fl.exists())){
                System.out.println("请先选择输入输出，再计算均值");
                return;
            }
        System.out.println("请输入你要计算的那一列（-1退出）：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        FileInputStream fileInputStream = new FileInputStream(fl);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line = null;
        Double sum = 0.00;
        Double Average;
        int key = 0;
        if(n>5||n<=0){
            System.out.println("你的输入错误,请重试");
            return;
        }
        while ((line = bufferedReader.readLine())!=null){
            String[] temp = line.split("\\|");
            Double[] doubles = new Double[temp.length];
            for(int i = 0;i<temp.length;i++){
                doubles[i] = Double.parseDouble(temp[i].trim());
            }
            key++;
            if(n<=temp.length){
            sum = sum+doubles[n-1];
            }else{
              sum = sum+0.00;
            }
        }
        if(n<=(m%5)){
            Average = sum/key;
        }else {
            Average =sum/(key-1);
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println("*************************该列平均值为"+decimalFormat.format(Average)+"*************************");
        System.out.println("若要继续请输入除-1以外任意数字：");
            n = input.nextInt();
        }catch (IOException e){
            System.out.println("请输出output.txt之后再计算");
            return;
        }
//

//        int key = temp.length / 5;
//        System.out.println(key);
//        int map = temp.length % 5;
//        System.out.println(map);
//        Double Average;
//        Double sum = 0.00;
//
//            if (map != 0) {
//                if (n <= map) {
//                    for (int j = 0; j <= key; j++) {
//                        sum = sum + temp[(n + j * 5) - 1];
//                        System.out.println(temp[(n + j * 5) - 1]);
//                    }
//                    Average = sum / (key + 1);
//                } else {
//                    for (int k = 0; k < key; k++) {
//                        sum = sum + temp[(n + k * 5) - 1];
//                        System.out.println(temp[(n + k * 5) - 1]);
//                    }
//                    Average = sum / key;
//                }
//
//            } else {
//                for (int i = 0; i < key; i++) {
//                    sum = sum + temp[(n + i * 5) - 1];
//                    System.out.println(temp[(n + i * 5) - 1]);
//                }
//                Average = sum / key;
//            }


    }
}

