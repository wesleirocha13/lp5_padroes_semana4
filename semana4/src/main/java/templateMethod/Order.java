package templateMethod;

/**
 *
 * @author Weslei
 */
public abstract class Order {
    
    private int id;
    private double value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public abstract double getDiscount();
    
    public void setValue(double value) {
        this.value = value;
    }
    
    public double getFinalValue(){
        double discount = getValue() * getDiscount();
        return getValue() - discount;
    }
    
}
