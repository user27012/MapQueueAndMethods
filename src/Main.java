import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Map<String, String> familiesInCities = new HashMap<>();
        familiesInCities.put("Львов", "Ивановы");
        familiesInCities.put("Киев", "Петровы");
        familiesInCities.put("Лондон", "Абрамовичи");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемый город:");
        String city = scanner.nextLine();

        if (familiesInCities.containsKey(city)) {
            String family = familiesInCities.get(city);
            System.out.println("Семья, что живет в городе " + city + ": " + family);
        } else {
            System.out.println("Семья с такими данными не найдена.");
        }
    }
}
