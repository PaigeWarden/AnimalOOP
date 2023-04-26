public class Animals {
    private String species;
    private double weight;
    private double height;
    private String colour;
    private String habitat;
    public Animals(String species, double weight, double height, String colour, String habitat){
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.colour = colour;
        this.habitat = habitat;
    }
    public String getSpecies(){
        return species;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public String getColour(){
        return colour;
    }

    public String getHabitat(){
        return habitat;
    }
    public void eat() {
        System.out.println(species + " is eating.");
    }
    public void sleep(){
        System.out.println(species + " is sleeping.");
    }
    }
