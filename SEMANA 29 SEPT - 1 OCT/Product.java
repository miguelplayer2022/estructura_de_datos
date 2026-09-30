package listaenlazadas_29;

// crear atributos

public class Product {
    private int ID;
    private String name;
    private Double price;
    private int Existence;
    
    
    // constructor lleno

    public Product(int ID, String name, Double price, int Existence) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.Existence = Existence;
    }
    
    // constructor vacio

    public Product() {
    }
    
    // asignar los valores

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setExistence(int Existence) {
        this.Existence = Existence;
        
    }
    
    // mostrar los valores

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getExistence() {
        return Existence;
    }
    
    // metodo para llamar al producto

    public String mostrarinfo() {
        return " Producto: " + " ID: " + ID + " - name: " + name + " - price: " + price + " - Existence: " + Existence + "." ;
    }
    
}
