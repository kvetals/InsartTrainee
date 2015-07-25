

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ����� on 23.07.2015.
 */
public class ProductsContainer {
    private static ProductsContainer instance;
    private final ArrayList<Product> container;
    private ProductsContainer(){
        instance = this;
        container = new ArrayList<>();
    }
    public static ProductsContainer getContainerInstance(){
        if(instance == null){
            new ProductsContainer();
        }
        return instance;
    }
    public void add(Product product){
        container.add(product);
    }
    public void add(int position, Product product){
        container.add(position, product);
    }
    public Product get(int index){
        return container.get(index);
    }
    public void printContent(){
        for(Product counter: container)
            System.out.println(counter);
    }
    public int count(){
        return Product.getCount();
    }
    public void sort(){
        Collections.sort(container);
    }

    /**
     method only for Test purposes
     */
    public void clear(){container.clear(); Product.setCount(0);}

}
