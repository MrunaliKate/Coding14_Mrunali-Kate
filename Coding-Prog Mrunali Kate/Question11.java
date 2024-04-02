public class Question11 {
    public static void main(String[] args) {
        String str = "Hello123World!";
        String result = removeNonAlphabeticCharacters(str);
        System.out.println("String with only alphabets: " + result);
    }
    public static String removeNonAlphabeticCharacters(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }
        result.toString();
    }
}