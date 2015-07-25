

/**
 * Created by Семья on 22.07.2015.
 */
public class Tuning extends Product {
    private String type;
    private String descriprion;

    public Tuning() {
        super();
        type = "not specified";
        descriprion = "none";
    }
    public Tuning(String type, String name, int price, String descriprion){
        super(name,price);
        this.type = type;
        this.descriprion = descriprion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescriprion() {
        return descriprion;
    }

    public void setDescriprion(String descriprion) {
        this.descriprion = descriprion;
    }

    @Override
    public String toString() {
        return "Tuning:" + '\n' +
                " Type: " + type + '\n' +
                " Name: " + getName() + '\n' +
                " Price: $" + getPrice() + '\n' +
                " descriprion: " + descriprion + '\n';
    }
}