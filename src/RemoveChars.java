public class RemoveChars {
    public static String remove(String str) {
        String entry = str;
        return str.substring( 1, str.length() - 1 );
    }

    public static void main(String[] args) {
        System.out.println(remove("Hello world"));
        System.out.println(remove("Whats this? it works!"));
    }
}
