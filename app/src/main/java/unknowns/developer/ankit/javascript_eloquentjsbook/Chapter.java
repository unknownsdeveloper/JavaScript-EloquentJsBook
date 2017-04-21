package unknowns.developer.ankit.javascript_eloquentjsbook;

/**
 * Created by Lincoln on 15/01/16.
 */
public class Chapter {
    private String number, name;


    public Chapter() {
    }

    public Chapter(String Number, String Name) {
        this.number = Number;
        this.name = Name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }
}
