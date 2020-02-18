import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                newstr = newstr + 'b';
            } else
                newstr = newstr + str.charAt(i);
        }
        System.out.println(newstr);
    }
}