
import java.util.Random;

/**
 * Created by ����� on 22.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        ProductsContainer container = ProductsContainer.getContainerInstance();
        int ADDEDqUANTITY = 10;
        Random random = new Random();
        for(int i = 0; i < ADDEDqUANTITY; i++){
            container.add(new Vehicle("vehicle"+i,"Impreza",4.5,"Sedan","auto",220,(random.nextInt(100)+50)*1000));
            container.add(new Tuning("spoiler"+i,"hirokama",(random.nextInt(10)+1)*100,"new spoiler"));
        }
        Product vehicle1 = new Vehicle();
        Product vehicle2 = new Vehicle("Subaru","Impreza",4.5,"Sedan","auto",220,250_000);
        Product vehicle3 = new Vehicle("ZAZ","Forza",1.5,"Sedan","manual",200,20_000);
        Product vehicle4 = new Vehicle("Lada","2108",1.3,"Hatchback","manual",160,7_000);
        Product tuning1 = new Tuning();
        Product tuning2 = new Tuning("spoiler","hirokama",1500,"new spoiler");
        Product tuning3 = new Tuning("tire","michelin",200,"R60.....");
        Product tuning4 = new Tuning("disc","sparco",400,"R16, light steel");
        Product tuningInsert = new Tuning("insert","toFifthposition",800,"testing");
        Product vehicle5 = new Vehicle("Tesla","Tesla",6,"Sedan","auto",190,250_000);

        container.add(vehicle1);
        container.add(vehicle2);
        container.add(vehicle3);
        container.add(vehicle4);
        container.add(tuning1);
        container.add(tuning2);
        container.add(vehicle5);
        container.add(tuning3);
        container.add(tuning4);
        container.add(5,tuningInsert);


        System.out.println("Unsorted container: ");
        container.printContent();
        System.out.println("Printing count: " + container.count());
        container.sort();
        System.out.println("Sorted container: ");
        container.printContent();

        Product.getAveragePrice();
    }
}
