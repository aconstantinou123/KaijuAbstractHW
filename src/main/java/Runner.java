import java.io.InputStreamReader;
import java.util.Scanner;

public class Runner {

    private Vehicles vehicles;
    private Mothra mothra;
    private Godzilla godzilla;

    public Runner(Vehicles vehicles, Mothra mothra, Godzilla godzilla){
        this.vehicles = vehicles;
        this.mothra = mothra;
        this.godzilla = godzilla;
    }

    public static void main(String[] args) {

        Vehicles vehicles = new Vehicles();
        Godzilla godzilla1 = new Godzilla("Godzilla", 1000, 50);
        Mothra mothra1 = new Mothra("Mothra", 1500, 75);
        Humvee humvee1 = new Humvee(Type.SOVIET, 100, 001, "Humvee");
        Humvee humvee2 = new Humvee(Type.ARMOURED, 200, 002, "Humvee");
        Humvee humvee3 = new Humvee(Type.CIVILIAN, 50, 003, "Humvee");
        Huey huey1 = new Huey(Type.CIVILIAN, 50, 004, "Huey");
        Huey huey2 = new Huey(Type.ARMOURED, 100, 005, "Huey");
        Huey huey3 = new Huey(Type.SOVIET, 150, 006, "Huey");

        vehicles.addVehicle(humvee1);
        vehicles.addVehicle(humvee2);
        vehicles.addVehicle(humvee3);
        vehicles.addVehicle(huey1);
        vehicles.addVehicle(huey2);
        vehicles.addVehicle(huey3);

        Runner runner = new Runner(vehicles, mothra1, godzilla1);
        runner.run();


    }

    public void run() {
        String choice;
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        do {
            System.out.println("Welcome to Kaiju fight. Please choose your monster");
            System.out.println("1. Mothra \n2. Godzilla");
            choice = scanner.nextLine().toLowerCase();
            switch (choice) {

                case "1":
                    String answer;
                    do {
                        System.out.println("Type a vehicle number to attack \n");
                        System.out.println(vehicles.seeAllVehicles());
                        Integer input2 = Integer.parseInt(scanner.nextLine());
                        System.out.println(mothra.attack(input2, vehicles));
                        mothra.checkDeath();
                        System.out.println(vehicles.allDestroyed());
                        System.out.println(vehicles.getRandomVehicle().attack(mothra) + "\n" + mothra.getName() + " health: "
                        + mothra.getHealthValue());
                        System.out.println("Press any key to attack again or q to change monster");
                        answer = scanner.nextLine();
                        System.out.println(mothra.move());
                        System.out.println(mothra.roar() + "\n");
                    } while (!answer.equals("q"));
                break;

                case "2":
                    String answer2;
                    do {
                        System.out.println("Type a vehicle number to attack \n");
                        System.out.println(vehicles.seeAllVehicles());
                        Integer input2 = Integer.parseInt(scanner.nextLine());
                        System.out.println(godzilla.attack(input2, vehicles));
                        godzilla.checkDeath();
                        System.out.println(vehicles.allDestroyed());
                        System.out.println(vehicles.getRandomVehicle().attack(godzilla) + "\n" + godzilla.getName() + " health: " + godzilla.getHealthValue());
                        System.out.println("Press any key to attack again or q to change monster");
                        answer2 = scanner.nextLine();
                        System.out.println(godzilla.move());
                        System.out.println(godzilla.roar()+ "\n");
                    } while (!answer2.equals("q"));
                    break;

                case "q":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Unrecognised Command");
                    System.out.println("Press any key return to the main menu");
                    String input10 = scanner.nextLine();
                    choice = input10.toLowerCase();
                    break;

            }
        } while (!choice.equals("q"));
    }
}
