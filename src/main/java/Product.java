

/**
 * Created by ����� on 22.07.2015.
 */
abstract public class Product implements Comparable<Product>{
    private static int counter;
    private static double summ;
    private String name;
    private int price;
    /**
     * empty constructor
     */
    public Product(){
        name = "not specified";
        price = 0;
        counter++;
        summ = summ + price;
    }
    /**
     * constructor with parameters
     */
    public Product(String name, int price){
        this.name = name;
        this.price = price;

        counter++;
        summ = summ + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * method to get Average Price between all added Products.
     */
    public static void getAveragePrice(){
        System.out.println("Average price = " + (float)(summ/counter)+ " at the moment");
        System.out.println("Products quantity = " + counter);
        System.out.println("Total summ of prices = " + summ);
    }

    /**
     * method returns total cuantity of added Products
     */
    public static int getCount(){
        return counter;
    }

    /**
     method only for Tests
     */
    public static void setCount(int i){counter = i;}

    /**
     implementation of "Comparable<T>" interface
     */
    public int compareTo(Product o) {
        int result = price - o.price;
        return result > 0 ? 1 : result < 0? -1 : 0;
    }
}
