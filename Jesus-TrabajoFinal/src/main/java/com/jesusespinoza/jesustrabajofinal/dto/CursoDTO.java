package com.jesusespinoza.jesustrabajofinal.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CursoDTO {
    private Integer idCurso;
    @NonNull
    @Size(min = 3, max = 20)
    private String nombre;
    @NonNull
    @Size(min = 2, max = 5)
    private String siglas;
    @NonNull
    private boolean estado;
}
