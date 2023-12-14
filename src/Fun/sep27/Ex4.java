package Fun.sep27;

public class Ex4 {


    public static void main(String[] args) {
        Color color = Color.BLUE;
        switch (color){
            case RED -> System.out.println("RED");
            case BLUE -> System.out.println("BLUE");
            default -> System.out.println("Exception");
        }
    }
}

enum Color {RED, BLUE}
