package ss7_asbtract_and_interface.thuc_hanh.lop_animal_and_interface_edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "cluck";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
