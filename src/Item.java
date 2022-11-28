public class Item {
    protected String name;
    private String type;
    protected double price;


    public Item(String type, double price) {
        this.type = type;
        this.price = price;
    }
    private String Itemtype1Name;
    private double Itemtype1price;
    private String Itemtype2Name;
    private double Itemtype2price;
    private String Itemtype3Name;
    private double Itemtype3price;
    public String getName(String name){
        this.name=name;
        return name;
    }
    public void getItemtype1(String name,double price){
        this.Itemtype1Name=name;
        this.Itemtype1price=price;
    }
    public void getItemtype2(String name,double price){
        this.Itemtype2Name=name;
        this.Itemtype2price=price;
    }
    public void getItemtype3(String name,double price){
        this.Itemtype3Name=name;
        this.Itemtype3price=price;
    }

    public double getBasePrice(){
       double Itemprice=this.price;
       if(Itemtype1Name!=null){
           Itemprice+=this.Itemtype1price;
           System.out.println("Item" +this.Itemtype1Name+ "for an extra price"+this.Itemtype1price);
       }
       if(Itemtype2Name!=null){
           Itemprice+=this.Itemtype2price;
           System.out.println("Item"+this.Itemtype2Name+"for an extra"+this.Itemtype2price);
       }
       if(Itemtype3Name!=null){
           Itemprice+=this.Itemtype3price;
           System.out.println("Item"+this.Itemtype3Name+"for an extra"+this.Itemtype3price);
       }

        return Itemprice;
    }
    public void printMenu(){
        System.out.println("The following items costs" + this.getBasePrice());
    }

}
