// String Contains Char
// Write a function that takes a and a `char` and returns `true`
// if the character is found. `String`

public class Main {
    public static boolean containsChar(String s, char c){
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == c) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsChar("money", 'm')); // true
    }
}
