public class AnimalTest {
    public static void main(String[] args) {
Animals Animal01 = new Animals("Giraffe",4200, 16, "yellow", "Savannah");
Animals Animal02 = new Animals("Dolphin", 90, 6, "Grey", "Ocean");
Animals Animal03 = new Animals("Dog", 11,1,"Black","Homes");
        System.out.println("The first animal is a " + Animal01.getSpecies() + ". It weighs " +
                Animal01.getWeight() + " pounds. It is " + Animal01.getHeight() +"ft tall. It is " +
                Animal01.getColour()+ ". And it lives in the " + Animal01.getHabitat());
        Animal01.eat();
        Animal01.sleep();
    }

}
