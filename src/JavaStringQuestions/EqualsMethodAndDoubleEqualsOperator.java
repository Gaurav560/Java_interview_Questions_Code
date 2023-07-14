package JavaStringQuestions;

public class EqualsMethodAndDoubleEqualsOperator {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("hello");
        //== compares the reference of objects
        System.out.println(s1==s2);
        //equals() compares the content of the string object
        System.out.println(s1.equals(s2));
    }
}
