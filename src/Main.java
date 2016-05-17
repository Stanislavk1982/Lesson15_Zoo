import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        FabrikaZoo fabrikaZoo = new FabrikaZoo();
        Zoo zoo = fabrikaZoo.seeAnimal(input);

        zoo.showAnimal();
    }
}
