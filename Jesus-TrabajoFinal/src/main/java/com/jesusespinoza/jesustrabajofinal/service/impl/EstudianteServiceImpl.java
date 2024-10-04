package com.jesusespinoza.jesustrabajofinal.service.impl;

import com.jesusespinoza.jesustrabajofinal.exception.ModelNotFoundException;
import com.jesusespinoza.jesustrabajofinal.model.Estudiante;
import com.jesusespinoza.jesustrabajofinal.repo.IEstudianteRepo;
import com.jesusespinoza.jesustrabajofinal.repo.IGenericRepo;
import com.jesusespinoza.jesustrabajofinal.service.IEstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImpl extends CRUDImpl<Estudiante, Integer> implements IEstudianteService {

    private final IEstudianteRepo repo;

    @Override
    protected IGenericRepo<Estudiante, Integer> getRepo() {
        return repo;
    }

    /*@Override
    public Estudiante save(Estudiante estudiante) {
        return repo.save(estudiante);
    }

    @Override
    public Estudiante update(Integer id, Estudiante estudiante) {
        estudiante.setIdEstudiante(id);
        return repo.save(estudiante);
    }

    @Override
    public List<Estudiante> findAll() {
        return repo.findAll();
    }

    @Override
    public Estudiante findById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new ModelNotFoundException("ID NOT FOUND: " + id));
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
*/

}
