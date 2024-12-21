public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                System.out.println(i++); // Print 5 before breaking, fixing the loop iteration issue.
                break; // Exit the loop when i is 5
            }
            System.out.println(i++);
        }
        System.out.println("Loop finished");
    }
}