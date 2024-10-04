package com.jesusespinoza.jesustrabajofinal.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleMatriculaDTO {
    private Integer idDetalleMatricula;
    @NotNull
    private CursoDTO curso;
    @JsonBackReference
    private MatriculaDTO matricula;
    @NotNull
    @Size(min = 5, max = 15)
    private String aula;
}
