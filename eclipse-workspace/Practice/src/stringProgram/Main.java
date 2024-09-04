package stringProgram;

public class Main {
    public static void main(String[] args) {
        String input = "a2b3c4";
        String output = expandString(input);
        System.out.println(output);
    }

    public static String expandString(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();
        int i = 0;

        while (i < length) {
            char ch = input.charAt(i);
            i++; // Move to the digit part
            
            int count = 0;
            // Collect the full number (it could be more than one digit)
            while (i < length && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }
            System.out.println(count);
            
            // Append the character 'count' times to the result
            for (int j = 1; j <= count; j++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
