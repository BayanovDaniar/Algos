package Fun.sep27;

public class Ex3 {
    public static void main(String[] args) {
        int x = 0b011001;
        int n = 0; // ������ ����
        while (x != 0) {
            if ((x & 1) != 0) { // �������� ������� ���������� ����
                System.out.println(n + " ����������");
            } else {
                System.out.println(n + " �������");
            }
            x = x >>> 1; // ����� �� ���� ������ ������
            n++;
        }
    }
}
