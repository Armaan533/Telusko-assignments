import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }

        return null;
    }

    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;

    }

    // Assignment-2 Part-1

    public List<Product> getProductWithPlace(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p: products){
            String place = p.getPlace().toLowerCase();
            if(place.contains(str))
                prods.add(p);
        }
        return prods;
    }

    // Assignment-2 Part-2

    public List<Product> getProductWithWarranty(int date) {
        List<Product> prods = new ArrayList<>();

        for(Product p: products){
            int warranty = p.getWarranty();
            if(warranty == date){
                prods.add(p);
            }

        }
        return prods;
    }

}