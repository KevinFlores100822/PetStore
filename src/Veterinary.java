public class Veterinary {

    private String specie;
    private double age;
    private String disease;

    //constructor vacio

    public Veterinary(){
    }

    //constructor parametrizado

    public Veterinary(String specie, double age, String disease) {
        this.specie = specie;
        this.age = age;
        this.disease = disease;
    }


    //comienzan getters and setters

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    //terminan getters and setters


}
