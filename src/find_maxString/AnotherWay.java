package find_maxString;

import java.util.ArrayList;
import java.util.Scanner;

public class AnotherWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự: ");
        String str = sc.nextLine();
        findMaxString(str);
    }

    public static void findMaxString(String str) {
        char[] ch = str.toCharArray();
        ArrayList<Character> characterArrayList = new ArrayList<>();
        characterArrayList.add(ch[0]);
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
//                char temp = characterArrayList.get(characterArrayList.size() - 1);
                if (ch[j] > characterArrayList.get(characterArrayList.size() - 1)) {
//                    System.out.println(characterArrayList.get(characterArrayList.size() - 1));
                    characterArrayList.add(ch[j]);
                    break;
                }
            }
        }
        for (char cha : characterArrayList) {
            System.out.print(cha);
        }

    }
}
