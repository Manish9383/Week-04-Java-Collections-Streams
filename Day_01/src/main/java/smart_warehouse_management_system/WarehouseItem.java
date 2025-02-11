package smart_warehouse_management_system;

public abstract class WarehouseItem {

    private String name;
    private int price;

    WarehouseItem(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
