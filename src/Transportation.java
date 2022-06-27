public class Transportation {
    private int price;
    private String type;

    public Transportation(int price, String type){
        this.price = price;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void choose(int budget, String name){
        if(this.price <= budget)System.out.println(name+"可以选择"+this.type);
    }
}
