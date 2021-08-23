package one.digitalinovationone.personalapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinovationone.personalapi.enums.PhoneType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

        private Long Id;

        @Enumerated(EnumType.STRING)
        private PhoneType type;

        @NotEmpty
        @Size(min = 13, max = 14)
        private String number;
}