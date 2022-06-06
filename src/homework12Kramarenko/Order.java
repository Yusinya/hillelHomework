package homework12Kramarenko;

public class Order extends Drinks{
    public static void main(String[] args) {
        Drinks drinks = new Drinks();
        System.out.println("Замовлення 1");
        drinks.orderDrinks(2, DrinksMachine.COFFEE, DrinksMachine.TEA);
        System.out.println("Замовлення 2");
        drinks.orderDrinks(1, DrinksMachine.SODA, DrinksMachine.LEMONADE);
    }
}
