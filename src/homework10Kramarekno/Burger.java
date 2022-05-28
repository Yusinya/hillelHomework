package homework10Kramarekno;

public class Burger {
    String bread;
    String meat;
    String meat2;
    String cheese;
    String green;
    String mayonnaise;

    public Burger(String bread, String meat, String cheese, String green, String mayonnaise) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        System.out.printf("\nСклад бургера: %s, %s, %s, %s, %s", bread, meat, cheese, green, mayonnaise);
    }

    public Burger(String bread, String meat, String cheese, String green) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        System.out.printf("\nСклад бургера: %s, %s, %s, %s", bread, meat, cheese, green);
    }

    public Burger(String bread, String meat, String cheese, String meat2, String green, String mayonnaise) {
        this.bread = bread;
        this.meat = meat;
        this.meat2 = meat2;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        System.out.printf("\nСклад бургера: %s, %s, %s, %s, %s, %s ", bread, meat, cheese, meat2, green, mayonnaise);
    }
}
