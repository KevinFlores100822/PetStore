import java.util.HashMap;

public class Hamster extends Veterinary {
    private String color;
    private int size;
    private String death;

   public Hamster(){
   }

    public Hamster(String color, int size, String death) {
        this.color = color;
        this.size = size;
        this.death = death;
    }

    public Hamster(String specie, double age, String disease, String color, int size, String death) {
        super(specie, age, disease);
        this.color = color;
        this.size = size;
        this.death = death;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String toString(){
        String texto = "El hamster es de color " + getColor() +
                "\n  es de un tamaño de " + getSize() +
                "\n murio por qué " + getDeath();

        return texto;
    }

    public String soy(){
       return "Estoy en la veterinaria y soy un Hamster";
    }
}
