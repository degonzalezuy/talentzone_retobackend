package co.com.sofka.dto;

public class CyclistDto {
    private int id;
    private String fullName;
    private CountryDto country;

    public CyclistDto() {
    }

    public CyclistDto(int id, String fullName, CountryDto country) {
        this.id = id;
        this.fullName = fullName;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
        this.country = country;
    }
}
