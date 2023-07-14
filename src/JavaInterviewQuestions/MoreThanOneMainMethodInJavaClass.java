package JavaInterviewQuestions;

public class MoreThanOneMainMethodInJavaClass {
    public static void main(String[] args) {

        main(4,5);
    }

    public static void main(Integer[] args) {
        System.out.println("it takes input as an array of integers from cmd");
    }

    public static void main(int a,int b) {
        System.out.println(a+b);
    }
}
