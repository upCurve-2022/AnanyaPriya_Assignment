package javachallenges;

public class permutation {
    public static void string_perm(String input, String ans){
        if (input.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String a = input.substring(0, i) + input.substring(i + 1);
            string_perm(a, ans + ch);
        }

    }
    public static void main(String[] args) {
        String str = "GOD";
        string_perm(str, "");
    }
}
