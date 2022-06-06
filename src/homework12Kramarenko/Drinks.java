package homework12Kramarenko;

public class Drinks{
    private final int PRICE_COFFEE = 20;
    private final int PRICE_TEA = 10;
    private final int PRICE_LEMONADE = 20;
    private final int PRICE_MOJITO = 30;
    private final int PRICE_SODA = 20;
    private final int PRICE_COCA_COLA = 20;

    public int price;

    public void prepareCoffee(int count) {
        System.out.println("Беремо каву, заварюємо і вуаля");
        price = count * PRICE_COFFEE;
    }

    public void prepareTea(int count) {
        System.out.println("Беремо заварку, заварюємо і вуаля");
        price = count * PRICE_TEA;
    }

    public void prepareLemonade(int count) {
        System.out.println("Змішуємо мінералку, мʼяту та лимон і вуаля");
        price = count * PRICE_LEMONADE;
    }

    public void prepareMojito(int count) {
        System.out.println("Змішуємо тонік, тростниковий цукор, мʼяту, лайм та подріблений льод і вуаля");
        price = count * PRICE_MOJITO;
    }

    public void prepareSoda(int count) {
        System.out.println("Дістаємо мінералку з холодильника і вуаля");
        price = count * PRICE_SODA;
    }

    public void prepareCola(int count) {
        System.out.println("Дістаємо колу з холодильника і вуаля");
        price = count * PRICE_COCA_COLA;
    }

    public void prepareSomeDrinks(int count, DrinksMachine drinks) {
        switch (drinks) {
            case TEA -> prepareTea(count);
            case SODA -> prepareSoda(count);
            case COFFEE -> prepareCoffee(count);
            case MOJITO -> prepareMojito(count);
            case LEMONADE -> prepareLemonade(count);
            case COCA_COLA -> prepareCola(count);
        }
    }

    public void orderDrinks(int count, DrinksMachine...drinks) {
        int fullPrice = 0;
        for (DrinksMachine drink:
        drinks) {
            prepareSomeDrinks(count, drink);
            fullPrice = fullPrice + price;
        }
        System.out.println("Ваш заказ коштує: " + fullPrice);
    }
}
