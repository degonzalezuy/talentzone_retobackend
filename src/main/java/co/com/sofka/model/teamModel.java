package co.com.sofka.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Teams")
public class teamModel {

    @Id
    private int id;
    private String name;
    private List<cyclistModel> cyclists;

    public teamModel() {
    }

    public teamModel(int id, String name, List<cyclistModel> cyclists) {
        this.id = id;
        this.name = name;
        this.cyclists = cyclists;
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

    public List<cyclistModel> getCyclists() {
        return cyclists;
    }

    public void setCyclists(List<cyclistModel> cyclists) {
        this.cyclists = cyclists;
    }

    @Override
    public String toString() {
        return "teamModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cyclists=" + cyclists +
                '}';
    }
}
