import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String[] testCases = {
                "aE:dC:cA:56:76:34",
                "01:23:45:67:89:Az",
                "01:23:45:67:89",
                "01:23:45:67:89:AB"
        };

        String regex = "^([0-9a-fA-F]{2}:){5}[0-9a-fA-F]{2}$";
        Pattern pattern = Pattern.compile(regex);

        for (String mac : testCases) {
            Matcher matcher = pattern.matcher(mac);
            if (matcher.matches()) {
                System.out.println(mac + " - правильный MAC-адрес.");
            } else {
                System.out.println(mac + " - неправильный MAC-адрес.");
            }
        }
    }
}