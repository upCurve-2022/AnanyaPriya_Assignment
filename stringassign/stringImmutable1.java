package stringassign;

public class stringImmutable1 {
    public static void verify(Object x, Object y) {
        if (x == y) {
            System.out.println("same references");

        } else {
            System.out.println("different references");
        }
    }
    public static void main(String []args){
        String a = "Java";
        String b = "Java";
        System.out.println("Before Modification");
        verify(a, b);
        a += "java";
        System.out.println("After Modification");
        verify(a, b);

    }
}
