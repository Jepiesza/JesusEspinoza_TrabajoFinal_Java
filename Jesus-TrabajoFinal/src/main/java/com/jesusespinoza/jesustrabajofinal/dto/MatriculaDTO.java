package com.jesusespinoza.jesustrabajofinal.dto;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.jesusespinoza.jesustrabajofinal.model.Estudiante;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaDTO {
    private Integer idMatricula;
    @NotNull
    private LocalDateTime fechaMatricula;
    @NotNull
    private Estudiante estudiante;
    @NotNull
    @JsonManagedReference
    private List<DetalleMatriculaDTO> detalleMatricula;
    @NotNull
    private boolean estado;
}
