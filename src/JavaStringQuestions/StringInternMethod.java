package JavaStringQuestions;

public class StringInternMethod {
    public static void main(String[] args) {
        //object created through String literal .it will get Stored in scp
        String s1="gaurav";

        String s2=new String("gaurav");
        //intern method -creates an exact copy of String object in the heap memory and stores in scp
        //if another string with same content exist in scp ,then it will not create a new object in scp .instead it will start pointing to that existing object
        String s3=s2.intern();
        System.out.println(s1==s3);
    }
}
