package co.com.sofka.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cyclists")
public class cyclistModel {
    @Id
    private int id;
    private String fullName;
    private countryModel country;

    public cyclistModel() {
    }

    public cyclistModel(int id, String fullName, countryModel country) {
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

    public countryModel getCountry() {
        return country;
    }

    public void setCountry(countryModel country) {
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
