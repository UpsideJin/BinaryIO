package Main.Levin;

import utils.Levin.Array;
import utils.Levin.Data;
import utils.Levin.Modules;
import utils.Levin.Stream;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int m = 0;
        do {
            int n = random.nextInt(100);
            System.out.println("******已经产生一个大小为" + n + "的随机数组******");
            String[] str = Array.getArray(n);
            Array.showArray(str);
            System.out.println("*****************************************");
            Modules.show();
            m = input.nextInt();
            switch (m) {
                case 1:
                    Stream.out(str);
                    System.out.println("******已经成功存放在./output.txt中******");
                    Stream.in();
                    System.out.println("********读取output.txt成功*************");
                    break;
                case 2:
                    Data.out(str);
                    System.out.println("*******已经成功存放在./output.txt中*****");
                    Data.in();
                    System.out.println("********读取output.txt成功*************");
                    break;
                case 3:
                    Modules.caculate(n);
                    break;

            }
        }while(m!=-1);
    }
}
