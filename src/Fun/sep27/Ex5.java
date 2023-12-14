package Fun.sep27;

public class Ex5 {
    public static void main(String[] args) {

        BLOCK1:
        while(true){
            System.out.println("While in");
            BLOCK2:
            for(int i = 0; i < 5; i ++){
                BLOCK3:
                if(i == 3){
                    break BLOCK1;
                }
                System.out.printf("End iteration %s\n", i);
            }
            System.out.println("End for cycle");
        }
        System.out.println("End while cycle");
    }
}

