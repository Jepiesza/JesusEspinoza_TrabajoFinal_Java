package com.jesusespinoza.jesustrabajofinal.service.impl;

import com.jesusespinoza.jesustrabajofinal.model.Matricula;
import com.jesusespinoza.jesustrabajofinal.repo.IGenericRepo;
import com.jesusespinoza.jesustrabajofinal.repo.IMatriculaRepo;
import com.jesusespinoza.jesustrabajofinal.service.IMatriculaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MatriculaServiceImpl extends CRUDImpl<Matricula,Integer> implements IMatriculaService {

    private final IMatriculaRepo repo;

    @Override
    protected IGenericRepo<Matricula, Integer> getRepo() {
        return repo;
    }
}
