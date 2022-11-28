public class Burger extends Item  {
    public Burger(String type, double price) {
        super(type, price);

    }



    private String topping1Name;
    private double topping1price;

    private String topping2Name;
    private double topping2Price;


    public double gettotalPrice() {
        double BurgerPrice = this.price;
        System.out.println("Burger price is"  + this.price);

        if(topping1Name!=null){
            BurgerPrice+=this.topping1price;
            System.out.println("Added" + this.getName("topping1")+ "for an extra"+this.getBasePrice());
        }
        if(topping2Name!=null){
           BurgerPrice+=this.topping2Price;
            System.out.println("Added" + this.getName("topping2")+ "for an extra"+this.getBasePrice());
        }
        return BurgerPrice;
    }



    public void addtopping1(String name,double price) {
        this.topping1Name = name;
        this.topping1price = price;
    }
    public void addtopping2(String name,double price){
        this.topping2Name=name;
        this.topping2Price=price;
    }
    public void settoppings(Item topping1,Item topping2){
    this.topping1Name= topping1.toString();
    this.topping2Name=topping2.toString();
    }
    public void printMenu(){

    }

}
