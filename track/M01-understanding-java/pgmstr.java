
class pgmstr {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "heLlo";
        if (s1 == s2) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("same");
        } else {
            System.out.println("not same");
        }

    }
}
