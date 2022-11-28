package co.com.sofka.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Teams")
public class TeamModel {

    @Id
    private String id;
    private String name;
    private List<CyclistModel> cyclists;

    public TeamModel() {
    }

    public TeamModel(String id, String name, List<CyclistModel> cyclists) {
        this.id = id;
        this.name = name;
        this.cyclists = cyclists;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CyclistModel> getCyclists() {
        return cyclists;
    }

    public void setCyclists(List<CyclistModel> cyclists) {
        this.cyclists = cyclists;
    }

    @Override
    public String toString() {
        return "TeamModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cyclists=" + cyclists +
                '}';
    }
}
