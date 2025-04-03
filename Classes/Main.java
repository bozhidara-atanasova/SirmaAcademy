import java.util.*;
public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<CarInfo> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");

            CarInfo car;

            if (tokens.length == 1) {
                // Само марка
                car = new CarInfo(tokens[0]);
            } else if (tokens.length == 2) {
                // Марка и модел
                car = new CarInfo(tokens[0], tokens[1]);
            } else {
                // Марка, модел и конски сили
                String brand = tokens[0];
                String model = tokens[1];
                int horsePower = Integer.parseInt(tokens[2]);
                car = new CarInfo(brand, model, horsePower);
            }

            cars.add(car);
        }

        for (CarInfo car : cars) {
            System.out.println(car.carInfo());
        }*/
       /* Scanner scanner = new Scanner(System.in);
        Map<Integer, BankAccount> accounts = new HashMap<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End")) break;

            String[] tokens = line.split(" ");
            String command = tokens[0];

            switch (command) {
                case "Create":
                    BankAccount account = new BankAccount();
                    accounts.put(account.getId(), account);
                    System.out.println("Account ID" + account.getId() + " created");
                    break;

                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    double amount = Double.parseDouble(tokens[2]);
                    BankAccount acc = accounts.get(id);
                    if (acc != null) {
                        acc.deposit(amount);
                        System.out.println("Deposited " + (int) amount + " to ID" + id);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;

                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(interest);
                    break;

                case "GetInterest":
                    int accountId = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    BankAccount found = accounts.get(accountId);
                    if (found != null) {
                        System.out.printf("%.2f%n", found.getInterest(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }
        }
*/
       /* Engine engine = new Engine(150, 200);
        Vehicle vehicle = new Vehicle("Car", "BMW", engine);

        System.out.println(vehicle.getInfo());

        vehicle.drive(60);

        System.out.println(vehicle.getFuel());
        System.out.println(vehicle.getInfo());

       /* Product productOne = new Product("cucumber", 1.50, 15);
        Product productTwo = new Product("tomato", 0.90, 25);
        Product productThree = new Product("bread", 1.10, 8);

        Storage storage = new Storage(50);

        storage.addProduct(productOne);
        storage.addProduct(productTwo);
        storage.addProduct(productThree);

        storage.getProducts(); // JSON формат

        System.out.println("Remaining capacity: " + storage.getCapacity());
        System.out.printf("Total cost: %.2f%n", storage.getTotalCost()); */

        /*Scanner scanner = new Scanner(System.in);
        List<Students> students = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) break;

            String[] parts = line.split(" ");
            String firstName = parts[0];
            String lastName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String hometown = parts[3];

            Students student = new Students(firstName, lastName, age, hometown);
            students.add(student);
        }

        String city = scanner.nextLine();

        for (Students s : students) {
            if (s.getHometown().equals(city)) {
                System.out.println(s.getInfo());
            }
        }*/
        Scanner scanner = new Scanner(System.in);

        // Прочитаме първоначалния ред
        String[] articleParts = scanner.nextLine().split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String commandLine = scanner.nextLine();
            String[] parts = commandLine.split(": ", 2);
            String command = parts[0];
            String value = parts[1];

            switch (command) {
                case "Edit":
                    article.edit(value);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(value);
                    break;
                case "Rename":
                    article.rename(value);
                    break;
            }
        }

        System.out.println(article);
    }
    }


