package co.com.sofka.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cyclists")
public class CyclistModel {
    @Id
    private int id;
    private String fullName;
    private CountryModel country;

    public CyclistModel() {
    }

    public CyclistModel(int id, String fullName, CountryModel country) {
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

    public CountryModel getCountry() {
        return country;
    }

    public void setCountry(CountryModel country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "cyclingModel{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", country=" + country +
                '}';
    }
}