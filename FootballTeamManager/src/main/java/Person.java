public class Person {

    private String id;
    private String name;
    private String addres ;
    
    public Person() {
    }

    public Person(String id, String name, String addres) {
        this.id = id;
        this.name = name;
        this.addres = addres;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getaddres() {
        return addres;
    }
    public void setaddres(String addres) {
        this.addres = addres;
    }
 
}

