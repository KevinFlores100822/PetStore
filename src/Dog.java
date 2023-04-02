public class Dog extends Veterinary{

    private String name;
    private double weight;

    public Dog(){
    }

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Dog(String specie, double age, String disease, String name, double weight) {
        super(specie, age, disease);
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        String texto = "El perro " + getName() +
                "\n es de la especie " + getSpecie() +
                "\n y tiene la edad de " + getAge();

        return texto;
    }

    public String soy(){
        return "Estoy en la veterinaria y soy un perro";
    }
}
