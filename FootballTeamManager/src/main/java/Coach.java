public class Coach extends Person {
    private String word;
    
    public Coach(String id, String name, String addres, String word){
        super(id, name, addres);
        this.word=word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}

