package es.upm.miw.swc;

public class User {
    private int number;

    private String name;

    private String familyName;

    private String format(String string) {
        string = string.trim();
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public User(int number, String name, String familyName) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }
    
    public String includePointsInName (){
        String NamewithDots="";
        for (int i=0; i<this.name.length(); i++){
            NamewithDots += this.name.charAt(i)+".";
        }
        return (NamewithDots);
    }
}
