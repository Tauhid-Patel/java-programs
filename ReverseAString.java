public class ReverseAString {
    public static void main(String[] args) {
        String r = reverse("Hello");
        System.out.println(r);
    }
        public static String reverse(String str){
            char[] letters = new char[str.length()];

            int letterIndex=0;
            for(int i=str.length()-1; i>=0; i--) {
                letters[letterIndex] = str.charAt(i);
                letterIndex++;
            }
            String reverse = "";
            for(int i=0; i<str.length(); i++) {
                reverse += letters[i];
            }

            return reverse;
        }
}
