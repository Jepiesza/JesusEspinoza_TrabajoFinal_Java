package com.jesusespinoza.jesustrabajofinal.config;

import com.jesusespinoza.jesustrabajofinal.dto.EstudianteDTO;
import com.jesusespinoza.jesustrabajofinal.model.Estudiante;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean(name = "defaultMapper")
    public ModelMapper defaultMapper() {
        return new ModelMapper();
    }
    @Bean(name = "estudianteMapper")
    public ModelMapper estudianteMapper() {
        ModelMapper mapper = new ModelMapper();

        //Escritura POST PUT
        mapper.createTypeMap(EstudianteDTO.class, Estudiante.class)
                .addMapping(EstudianteDTO::getNombresEstudiante, (dest, v) -> dest.setNombres((String) v))
                .addMapping(EstudianteDTO::getApellidosEstudiante, (dest, v) -> dest.setApellidos((String) v));

        //Lectura GET
        mapper.createTypeMap(Estudiante.class, EstudianteDTO.class)
                .addMapping(Estudiante::getNombres, (dest, v) -> dest.setNombresEstudiante((String) v))
                .addMapping(Estudiante::getApellidos, (dest, v) -> dest.setApellidosEstudiante((String) v));

        return mapper;
    }
}
