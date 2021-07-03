package iterator;

/**
 *
 * @author Weslei
 */
public class Product {
    
    private String name;
    private float price;
    private int qtdProduct;

    public Product(String name, float price, int qtdProduct) {
        this.name = name;
        this.price = price;
        this.qtdProduct = qtdProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public int getQtdProduct(){
        return qtdProduct;
    }
    
    public void setQtdProduct(int qtdProduct){
        this.qtdProduct = qtdProduct;
    }
    
}
