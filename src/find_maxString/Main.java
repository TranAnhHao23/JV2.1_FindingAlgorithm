package find_maxString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự: ");
        String str = sc.nextLine();
        System.out.println("Nhập số lượng ký tự muốn xuất: ");
        int number = sc.nextInt();
        System.out.println(outputStringArrange(str,number));

    }

    public static String outputStringArrange(String str, int number) {
        if (number > str.length()){
            return "Wrong number!!!";
        }else {
            char[] ch = str.toCharArray();
            char[] chNew = new char[number];
            for (int i = 0; i < ch.length; i++) {
                char temp = 0;
                for (int j = 0; j < ch.length; j++) {
                    if (Character.compare(ch[i], ch[j]) < 0) {
                        temp = ch[i];
                        ch[i] = ch[j];
                        ch[j] = temp;
                    }
                }
            }

            for (int i = 0; i < chNew.length; i++) {
                chNew[i] = ch[i];
            }
            return String.valueOf(chNew);
        }
    }


}
