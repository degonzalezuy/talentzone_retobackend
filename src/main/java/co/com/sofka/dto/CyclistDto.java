package co.com.sofka.dto;

public class CyclistDto {
    private String id;
    private String fullName;
    private String country;

    public CyclistDto() {
    }

    public CyclistDto(String id, String fullName, String country) {
        this.id = id;
        this.fullName = fullName;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
