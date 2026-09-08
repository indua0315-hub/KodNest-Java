
public class StringMethodss {

    public static void main(String[] args) {
        String str = "Kodnest Tecnologies";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.contains("Tech"));
        System.out.println(str.isEmpty());
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.endsWith("ies"));
        System.out.println(str.indexOf("Tech"));
        System.out.println(str.lastIndexOf("Tech"));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 5));
        System.out.println(str.replace("Tech", "T"));

    }
}
