package MainCourse.Lesson4;

public class SwitchExample {
    public static void main(String[] args) {
        //byte, short, int, char, String, enum
        int value = 5;
        switch (value) {
            case 1:
                System.out.println("value == 1");
                break;
            case 2:
                System.out.println("value == 2");
                break;
            case 3:
                System.out.println("value == 3");
                break;
            case 4:
                System.out.println("value == 4");
                break;
            default:
                System.out.println("This is SOME SHIT, i think.");
        }
    }
}
