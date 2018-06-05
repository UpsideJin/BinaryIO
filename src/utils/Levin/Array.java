package utils.Levin;

import java.text.DecimalFormat;
import java.util.Random;

public class Array {
    public static String[] getArray(int n) {
        String [] randomArray = new String[n];
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Random random = new Random();
        for(int i = 0;i < randomArray.length;i++){
            Double temp = random.nextDouble()+random.nextInt(100);
            randomArray[i] = decimalFormat.format(temp)+"|";
        }
        return randomArray;
    }

    public static void showArray(String[] str){
        int flag = 0;
            for(int j = 0;j<str.length;j++){
                if(flag<5) {
                    System.out.print(str[j]);
                    flag++;
                }else{
                    flag = 0;
                    System.out.println();
                    System.out.print(str[j]);
                    flag++;
                }
            }
            System.out.println();
        }

//        public static Double[] dealArray(String str){
//            String[] temp = str.split("\\|");
//            Double[] doubles = new Double[temp.length];
//            for(int i = 0;i<temp.length;i++){
//                doubles[i] = Double.parseDouble(temp[i].trim());
//            }
//            return doubles;
//        }
//        public static Double[] dealArray(String[] temp){
//            Double[] doubles = new Double[temp.length];
//            for(int i = 0;i<temp.length;i++){
//                doubles[i] = Double.parseDouble(temp[i].trim());
//            }
//            return doubles;
//        }
//        public static void showArray(Double[] temp){
//            int flag = 0;
//            for(int j = 0;j<temp.length;j++){
//                if(flag<5) {
//                    System.out.print(temp[j]+"|");
//                    flag++;
//                }else{
//                    flag = 0;
//                    System.out.println();
//                    System.out.print(temp[j]+"|");
//                    flag++;
//                }
//            }
//            System.out.println();
//        }
    }

