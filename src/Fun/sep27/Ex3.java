package Fun.sep27;

public class Ex3 {
    public static void main(String[] args) {
        int x = 0b011001;
        int n = 0; // Индекс бита
        while (x != 0) {
            if ((x & 1) != 0) { // Проверка статуса последнего бита
                System.out.println(n + " установлен");
            } else {
                System.out.println(n + " сброшен");
            }
            x = x >>> 1; // Сдвиг на один разряд вправо
            n++;
        }
    }
}
