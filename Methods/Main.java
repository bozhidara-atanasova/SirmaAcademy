public class Main {
    public static void main(String[] args) {
        printHello();
        printStudent("Ivan", 20, 5.50);

    }
    public static void printHello() {
        System.out.println("Hello!");
    }
    public static void printStudent(String name, int age, double grade) {
        System.out.printf("Student: %s; Age: %d, Grade: %.2f\n", name, age, grade);
    }
}