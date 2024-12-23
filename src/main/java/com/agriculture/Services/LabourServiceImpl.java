package com.agriculture.Services;

import com.agriculture.Models.Labour;
import com.agriculture.Repositories.LabourRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabourServiceImpl implements LabourService{

    @Autowired
    private LabourRepository labourRepository;

    @Override
    public Labour save(Labour labour) {

        return labourRepository.save(labour);
    }

    @Override
    public List<Labour> getAllLabours() {
        return labourRepository.findAll();
    }

    @Override
    public Optional<Labour> getLabourById(Long id) {
        return labourRepository.findById(id);
    }

    @Override
    public List<Labour> getLaboursByUserId(Long id) {
        return this.labourRepository.findLabourByUserId(id);
    }

}
