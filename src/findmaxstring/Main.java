package findmaxstring;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi vào xem nào");
        String str = sc.nextLine();
        findMaxString(str);

    }

    public static void findMaxString(String str) {
        char[] ch = str.toCharArray();
        LinkedList<Character> list1 = new LinkedList<>();
        LinkedList<Character> temp = new LinkedList<>();
        int i = 0;
        temp.add(ch[0]);
        do {
            if (temp.getLast() < ch[i]) {
                temp.add(ch[i]);
            } else {
                if (list1.size() < temp.size()) {
                    list1.clear();
                    list1.addAll(temp);
                }
                temp.clear();
                temp.add(ch[i]);
            }
            i++;
        } while (i < ch.length);

        if (list1.size() < temp.size()){
            list1.clear();
            list1.addAll(temp);
        }
        for (char cha : list1) {
            System.out.print(cha);
        }
    }
}
