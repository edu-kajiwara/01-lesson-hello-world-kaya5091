import java.lang.String;

public class HelloClassroom {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(String.valueOf(i + " : fizz buzz\n"));
            }else if (i % 3 == 0){
                System.out.print(String.valueOf(i + " : fizz\n"));
            }else if (i % 5 == 0){
                System.out.print(String.valueOf(i + " : buzz\n"));
            }else {
                System.out.print(String.valueOf(i + "\n"));
            }
        }
    }
}