public class VeterinaryApp {

    public static void main(String[] args) {
        Dog Dog1 = new Dog("Solovino", 19);
        Hamster Hamster1 = new Hamster("Blanco", 10,"no aguanto un susto");

        System.out.println("el nombre del perrro es " + Dog1.getName());
        System.out.println("El color del Hamster es " + Hamster1.getColor());

        Dog1.setDisease("Envenenamiento");
        System.out.println("El perro " + Dog1.getName() + " estaba enfermo porque sufrio de " + Dog1.getDisease());


        //Probando la sobrecarga de datos

        System.out.println("Metodo toString() de Dog: " + Dog1.toString());
        System.out.println("El perro " + Dog1.soy());

        System.out.println("Metodo toString de Hamster: " + Hamster1.toString());
        System.out.println("El hamster " + Hamster1.soy());
    }
}
