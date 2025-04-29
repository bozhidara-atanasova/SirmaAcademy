import java.util.*;
public class PopulationCounter {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Map<String, LinkedHashMap<String, Long>> countryData = new LinkedHashMap<>();

        String line = scanner.nextLine();
        while (!line.equals("report")) {
            String[] parts = line.split("\\|");
            String city = parts[0];
            String country = parts[1];
            long population = Long.parseLong(parts[2]);

            countryData.putIfAbsent(country, new LinkedHashMap<>());
            countryData.get(country).put(city, population);

            line = scanner.nextLine();
        }


        Map<String, Long> countryPopulation = new LinkedHashMap<>();
        for (var entry : countryData.entrySet()) {
            long totalPopulation = entry.getValue().values().stream().mapToLong(Long::longValue).sum();
            countryPopulation.put(entry.getKey(), totalPopulation);
        }

        countryPopulation.entrySet().stream()
                .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                .forEach(countryEntry -> {
                    String country = countryEntry.getKey();
                    System.out.printf("%s (total population: %d)%n", country, countryEntry.getValue());

                    countryData.get(country).entrySet().stream()
                            .sorted((c1, c2) -> Long.compare(c2.getValue(), c1.getValue()))
                            .forEach(cityEntry ->
                                    System.out.printf("=>%s: %d%n", cityEntry.getKey(), cityEntry.getValue())
                            );
                });
    }
}

