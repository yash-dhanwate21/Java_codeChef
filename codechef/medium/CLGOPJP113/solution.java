// Debug the code
import java.util.*;
class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c, x, y;
        c = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();

        int result = Math.max(0, c - x) * y;
        System.out.println(result);

        scanner.close();
    }
}
