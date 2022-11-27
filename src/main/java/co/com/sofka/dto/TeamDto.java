package co.com.sofka.dto;

import java.util.List;

public class TeamDto {
    private int id;
    private String name;
    private List<CyclistDto> cyclists;

    public TeamDto() {
    }

    public TeamDto(int id, String name, List<CyclistDto> cyclists) {
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

    public List<CyclistDto> getCyclists() {
        return cyclists;
    }

    public void setCyclists(List<CyclistDto> cyclists) {
        this.cyclists = cyclists;
    }

    @Override
    public String toString() {
        return "TeamDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cyclists=" + cyclists +
                '}';
    }
}
