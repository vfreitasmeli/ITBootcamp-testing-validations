package com.meli.obterdiploma.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Data
public class SubjectDTO {

    @Valid
    @NotEmpty(message = "O nome do assunto não pode ficar vazio")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ/s]+", message = "O nome do assunto deve começar com letra maiúscula.")
    @Size(max = 30, message = "O comprimento não pode exceder 30 caracteres")
    String name;

    @Valid
    @NotNull(message = "A nota não pode estar vazia")
    @DecimalMax(value = "10.0", message = "A nota máxima é 10.0")
    @DecimalMin(value = "0.0", message = "A nota mínima é 0.0")
    Double score;
}
