public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        // your code here
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == chr) {
                    vowelsCount += 1;
                }
            }
        }
        return vowelsCount;
    }
}

