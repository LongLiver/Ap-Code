public class FootballPlayer extends Person{
    private String ltb;
    

    public FootballPlayer(String id, String name, String addres, String ltb) {
        super(id, name, addres);
        this.ltb = ltb;
    }

    public String getltb() {
        return this.ltb;
    }

    public void setltb(String ltb) {
        this.ltb = ltb;
    }

} 
