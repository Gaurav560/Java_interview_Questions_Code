package JavaArrayInterviewQuestions;

public class AnonymousArray {
    public static void main(String[] args) {
sum(new int[]{2,3,4,2,5});
    }
    public static void sum(int[] a){
        int total=0;
        for (int x:a
             ) {
         total=total+x;
        }
        System.out.println("total sum is :: "+total);
    }
}
