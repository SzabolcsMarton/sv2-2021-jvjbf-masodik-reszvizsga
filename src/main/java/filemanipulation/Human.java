package filemanipulation;

public class Human {
    private String name;
    private String identityNumber;

    public Human(String name, String identityNumber) {
        this.name = name;
        this.identityNumber = identityNumber;
    }

    public String getIdentityNumber() {
        return this.identityNumber;
    }

    public String getName() {
        return name;
    }
}
