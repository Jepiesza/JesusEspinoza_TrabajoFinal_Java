package com.jesusespinoza.jesustrabajofinal.service.impl;


import com.jesusespinoza.jesustrabajofinal.model.Curso;
import com.jesusespinoza.jesustrabajofinal.repo.ICursoRepo;
import com.jesusespinoza.jesustrabajofinal.repo.IGenericRepo;
import com.jesusespinoza.jesustrabajofinal.service.ICursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl extends CRUDImpl<Curso, Integer> implements ICursoService{

    private final ICursoRepo repo;

    @Override
    protected IGenericRepo<Curso, Integer> getRepo() {
        return repo;
    }

    /*@Override
    public Curso save(Curso curso) {
        return repo.save(curso);
    }

    @Override
    public Curso update(Integer id, Curso curso) {
        curso.setIdCurso(id);
        return repo.save(curso);
    }

    @Override
    public List<Curso> findAll() {
        return repo.findAll();
    }

    @Override
    public Curso findById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new ModelNotFoundException("ID NOT FOUND: " + id));
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }*/

    /*public Curso validAndSave(Curso curso) {
        //repo = new CursoRepo();
        if(curso.getIdCurso() > 0){
            return repo.save(curso);
        }else{
            return new Curso(99, "Jesus", "Jes", true);
        }
    }*/


}
