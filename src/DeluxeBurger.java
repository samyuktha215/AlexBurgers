public class DeluxeBurger extends Item {
    private String extraItemName;
    private double extraItemprice;

    public DeluxeBurger(String type, double price, String extraItemName, double extraItemprice) {
        super(type, price);

    }
    public double getTotalprice(){
        double deluxeburgerprice=this.price;
        if(extraItemName!=null){
            deluxeburgerprice+=this.extraItemprice;
            System.out.println("Added "+this.extraItemName +"for extra"+ this.extraItemprice);
        }
        return deluxeburgerprice;
    }
}
