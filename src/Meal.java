public class Meal {
    private Burger burger;
    private Item drink;
    private Item side;

    public Meal(Burger burger, Item drink, Item side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }
    public double totalPrice(){
        double totalPrice=this.burger.gettotalPrice()+this.drink.getBasePrice()+this.side.getBasePrice();
        return totalPrice;
    }
    public void printmeny(){
        System.out.println("The total bill for selected items are " +this.totalPrice());

    }



}
