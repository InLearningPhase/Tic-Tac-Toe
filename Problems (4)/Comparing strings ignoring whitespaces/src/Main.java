import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        string1.trim();
        string2.trim();
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == ' ')
                continue;
            else
                string1 += string1.charAt(i);
        }
        for (int i = 0; i < string2.length(); i++) {
            if (string2.charAt(i) == ' ')
                continue;
            else
                string2 += string2.charAt(i);
        }
        if (string1.equals(string2)) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}