public class FabrikaZoo {
    public Zoo seeAnimal(String input) {
        Zoo zoo;
        switch (input) {
            case "cat":
                zoo = new Cat("Cat", 3, 15, "Myau");
                break;
            case "dog":
                zoo = new Dog("Dog", 15, 60, "Gav");
                break;
            case "parrot":
                zoo = new Parrot("Parrot", 1, 10, "Pirats-Pirats");
                break;
            default:
                zoo = null;

        }
        return zoo;
    }
}
