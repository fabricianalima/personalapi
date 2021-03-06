package one.digitalinovationone.personalapi.dto.mapper;

import one.digitalinovationone.personalapi.dto.PersonDTO;
import one.digitalinovationone.personalapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

   PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

   @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
   Person toModel(PersonDTO dto);

   PersonDTO toDTO (Person dto);
}
