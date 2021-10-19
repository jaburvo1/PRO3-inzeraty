package cz.uhk.ppro.inzeraty.model;

public class Inzerat{
    private int id;
    private String name;
    private String description;
    private int typ;
    private String password;

    public Inzerat(int id, String name, String description, int typ, String password) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.typ = typ;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTyp() {
        return typ;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
