package muzi.obj.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by muzi on 2017/9/23.
 */
class PokerDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] colors = {"♣", "♥", "♠", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String number:
             numbers) {
            for (String color:
                 colors) {
                String poker = color.concat(number);
                hashMap.put(index, poker);
                arrayList.add(index);
                index++;
            }
        }
        hashMap.put(index, "小王");
        index++;
        arrayList.add(index);
        hashMap.put(index, "大王");
        arrayList.add(index);

        //洗牌
        Collections.shuffle(arrayList);

        //发牌
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        TreeSet<Integer> treeSet3 = new TreeSet<>();
        TreeSet<Integer> treeSet4 = new TreeSet<>();
        for (int x = 0; x < arrayList.size(); x++) {
            if (x >= arrayList.size() - 3) {
                treeSet4.add(arrayList.get(x));
            } else if (x % 3 == 0) {
                treeSet1.add(arrayList.get(x));
            } else if (x % 3 == 1) {
                treeSet2.add(arrayList.get(x));
            } else if (x % 3 == 2) {
                treeSet3.add(arrayList.get(x));
            }
        }

        //看牌
        lookPoker("muzi", treeSet1, hashMap);
        lookPoker("cunzhang", treeSet2, hashMap);
        lookPoker("wangkai", treeSet3, hashMap);
        lookPoker("dipai", treeSet4, hashMap);

    }

    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是:");
        for (Integer i:
             ts) {
            String poker = hm.get(i);
            System.out.print(poker + " ");
        }
        System.out.println("\t");
    }
}
