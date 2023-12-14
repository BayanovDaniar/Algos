package Fun;

public class Oct4Ex2 {
    public static void main(String[] args) {

        int a = 12;
        String s = Integer.toBinaryString(a);


        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder();
        while(a / 2 != 0){
            stringBuilder.append(a%2);

        }

    }
}
