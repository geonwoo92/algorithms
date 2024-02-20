package kaupOOP;

public class Person {
    private String name;
    private double height;
    private double weight;
    private double bmi;
    private String bodyMass;



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;

    }
    public void createHeight() {
        this.height = Math.floor( Math.random() * 50 + 150);
    }

    public double getHeight() {
        return this.height;
    }

    public void createWeight() {
        this.weight = Math.floor( Math.random()* 70 + 30);
    }

    public double getWeight() {
        return this.weight;
    }

    public double getBmi() {
        return this.bmi;
    }

    public String getBodyMass() {
        return this.bodyMass;
    }
    public void createBMI(){
        this.bmi =Math.floor( weight/(height/100 * height/100));
    }

    public void createBodyMass(){
        String bodyMass = "";
        if (bmi >= 39) bodyMass = "고도비만";
        else if (bmi >= 30) {
            bodyMass = "중도비만";
        } else if (bmi >= 24) {
            bodyMass = "과체중";
        } else if (bmi >= 10) {
            bodyMass = "정상체중";
        } else {
            bodyMass = "저체충";
        }

        this.bodyMass = bodyMass;
    }

}
