package homework11Kramarenko;

public class Account {
    private final String name;
    private final int birthYear;
    private final int birthMonth;
    private final int birthDay;
    private final String email;
    private final int phoneNumber;
    private String surname;
    private int weight;
    private int tusk;
    private int steps;
    private int age;

    public Account(String name, int birthYear, int birthMonth, int birthDay, String email, int phoneNumber, String surname, int weight, int tusk, int steps) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.tusk = tusk;
        this.steps = steps;
    }

    public void printAccountInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Account{" +
            "name='" + name + '\'' +
            ", birthYear=" + birthYear +
            ", birthMonth=" + birthMonth +
            ", birthDay=" + birthDay +
            ", email='" + email + '\'' +
            ", phoneNumber=" + phoneNumber +
            ", surname='" + surname + '\'' +
            ", weight=" + weight +
            ", tusk=" + tusk +
            ", steps=" + steps +
            ", age=" + getAge() +
            '}';
    }

    public void countAge() {
        this.age = 2022 - birthYear;
    }

    public int getAge(){
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
