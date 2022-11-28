public class Main {
    public static void main(String[] args) {

        Burger regularBurger = new Burger("reggie", 5);
        Item mayo = new Topping("mayo", 4.0);
        Item ketchup = new Topping("ketchup", 3.0);
        regularBurger.settoppings(ketchup,mayo);


        Item coke = new Drink("coca cola", 1);
        Item fries = new SideDish("Fries", 2);

        Meal regularMeal = new Meal(regularBurger, coke, fries);
        regularMeal.printmeny();


    }
}