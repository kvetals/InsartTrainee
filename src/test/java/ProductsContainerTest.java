import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ProductsContainerTest {

    @org.junit.Test
    public void testCount() throws Exception {
        ProductsContainer container = ProductsContainer.getContainerInstance();
        container.add(new Vehicle("Subaru","Impreza",4.5,"Sedan","auto",220,250_000));
        container.add(new Vehicle("ZAZ","Forza",1.5,"Sedan","manual",200,20_000));
        container.add(new Vehicle("Lada","2108",1.3,"Hatchback","manual",160,7_000));
        container.add(new Tuning("spoiler","hirokama",1500,"new spoiler"));
        container.add(new Tuning("tire","michelin",200,"R60....."));
        container.add(new Tuning("disc","sparco",400,"R16, light steel"));
        assertEquals(6, container.count());
        container.clear();
    }

    @org.junit.Test
    public void testSort() throws Exception {
        ProductsContainer container = ProductsContainer.getContainerInstance();
        Product v1 = new Vehicle("Subaru","Impreza",4.5,"Sedan","auto",220,250_000);
        Product v2 = new Vehicle("ZAZ","Forza",1.5,"Sedan","manual",200,20_000);
        Product v3 = new Vehicle("Lada","2108",1.3,"Hatchback","manual",160,7_000);
        Product t1 = new Tuning("spoiler","hirokama",1500,"new spoiler");
        Product t2 = new Tuning("tire","michelin",200,"R60.....");
        Product t3 = new Tuning("disc","sparco",400,"R16, light steel");
        container.add(v1);
        container.add(v2);
        container.add(v3);
        container.add(t1);
        container.add(t2);
        container.add(t3);
        container.sort();
        Product [] expected = {t2, t3, t1, v3, v2, v1};
        Product [] real = new Product[6];
        for(int i = 0; i < container.count(); i++){
            real[i] = container.get(i);
        }
        assertArrayEquals(expected,real);
    }
}