package co.com.sofka.utils;

import co.com.sofka.dto.CountryDto;
import co.com.sofka.dto.CyclistDto;
import co.com.sofka.dto.TeamDto;
import co.com.sofka.model.CountryModel;
import co.com.sofka.model.CyclistModel;
import co.com.sofka.model.TeamModel;
import org.springframework.beans.BeanUtils;


public class AppUtils {

    //Parse Country Model  to Dto
    public static CountryDto countryEntityToDto(CountryModel model){
        CountryDto countryDto = new CountryDto();
        BeanUtils.copyProperties(model, countryDto);
        return countryDto;
    }
    //Parse Country Dto To Model
    public static CountryModel countryDtoToModel(CountryDto dto){
        CountryModel model = new CountryModel();
        BeanUtils.copyProperties(dto, model);
        return model;
    }

    //Parse Cyclist Model  to Dto
    public static CyclistDto cyclistModelToDto(CyclistModel model){
        CyclistDto dto = new CyclistDto();
        BeanUtils.copyProperties(model, dto);
        return dto;
    }
    //Parse Cyclist Dto To Model
    public static CyclistModel cyclistDtoToModel(CyclistDto dto){
        CyclistModel model = new CyclistModel();
        BeanUtils.copyProperties(dto, model);
        return model;
    }

    //Parse Team Model  to Dto
    public static TeamDto TeamModelToDto(TeamModel model){
        TeamDto dto = new TeamDto();
        BeanUtils.copyProperties(model, dto);
        return dto;
    }
    //Parse Teams Dto To Model
    public static TeamModel teamDtoToModel(TeamDto dto){
        TeamModel model = new TeamModel();
        BeanUtils.copyProperties(dto, model);
        return model;
    }

}
