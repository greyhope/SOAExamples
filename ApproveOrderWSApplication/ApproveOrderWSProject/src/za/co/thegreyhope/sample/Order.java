package za.co.thegreyhope.sample;

public class Order {
    
    private long value;
    private String item;
    
    public Order() {
      
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}
