package aa_rough;
import java.util.*;

public class PasswordGroups {
    public static void main(String[] args) {
        // Example input
        int N = 5;
        String[] passwords = {"abcd", "cbad"};

        System.out.println(countDistinctPasswords(N, passwords));
    }

    public static int countDistinctPasswords(int N, String[] passwords) {
        Set<String> distinctGroups = new HashSet<>();

        for (String password : passwords) {
            char[] evenChars = new char[(password.length() + 1) / 2];
            char[] oddChars = new char[password.length() / 2];

            for (int i = 0; i < password.length(); i++) {
                if (i % 2 == 0) {
                    evenChars[i / 2] = password.charAt(i);
                } else {
                    oddChars[i / 2] = password.charAt(i);
                }
            }

            Arrays.sort(evenChars);
            Arrays.sort(oddChars);

            String key = new String(evenChars) + new String(oddChars);
            distinctGroups.add(key);
        }

        return distinctGroups.size();
    }
}