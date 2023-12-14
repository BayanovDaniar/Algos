package YandexCup.CatsInArts;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pair<Integer,Integer>> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = 0; i < n; i++){
            list.add(new Pair<>(scanner.nextInt(), i));
        }

        Comparator<Pair<Integer,Integer>> pairKeyComparator = Comparator.comparing(Pair::getKey);

        list.sort(pairKeyComparator);


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < m; i++){
            min = Math.min(min, list.get(i).getValue());
            max = Math.max(max, list.get(i).getValue());
        }

        int i = m-1;
        while(list.get(i).value == list.get(i+1).value){
            min = Math.min(min, list.get(i).getValue());
        }

        System.out.println(max - min + 1);


    }

    static class Pair<I extends Number, I1 extends Number> {

        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

    }
}