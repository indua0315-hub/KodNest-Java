
public class StringMethod5 {

    public static void main(String[] args) {
        String s1 = "Raja";
        String s2 = "Rani";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s4 = s1.concat(s2);
        System.out.println(s4);

        String s5 = "java";
        char arr[] = s5.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String s6 = new String(arr);
        System.out.println(s6);

    }
}
