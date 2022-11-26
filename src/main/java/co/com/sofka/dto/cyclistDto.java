package co.com.sofka.dto;

import co.com.sofka.model.countryModel;

public class cyclistDto {
    private int id;
    private String fullName;
    private countryDto country;

    public cyclistDto() {
    }

    public cyclistDto(int id, String fullName, countryDto country) {
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

    public countryDto getCountry() {
        return country;
    }

    public void setCountry(countryDto country) {
        this.country = country;
    }
}
