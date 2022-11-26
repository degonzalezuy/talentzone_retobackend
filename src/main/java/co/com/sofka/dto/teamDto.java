package co.com.sofka.dto;

import co.com.sofka.model.cyclistModel;

import java.util.List;

public class teamDto {
    private int id;
    private String name;
    private List<cyclistDto> cyclists;

    public teamDto() {
    }

    public teamDto(int id, String name, List<cyclistDto> cyclists) {
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

    public List<cyclistDto> getCyclists() {
        return cyclists;
    }

    public void setCyclists(List<cyclistDto> cyclists) {
        this.cyclists = cyclists;
    }

    @Override
    public String toString() {
        return "teamDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cyclists=" + cyclists +
                '}';
    }
}
