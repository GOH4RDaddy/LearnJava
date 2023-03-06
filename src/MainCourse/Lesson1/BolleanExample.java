package MainCourse.Lesson1;

public class BolleanExample {
    public static void main(String[] args) {
        int value1 = 0;
        int value2 = 10;
        boolean test1 = value1 != 0;
        boolean test2 = value2 > 0;
        System.out.println(test1 || test2 || 25 > 100);
    }
}
