package com.agriculture.Services;

import com.agriculture.Models.Labour;
import java.util.List;
import java.util.Optional;

public interface LabourService {

    public Labour save(Labour labour);
    public List<Labour> getAllLabours();
    public Optional<Labour> getLabourById(Long id);
    public List<Labour> getLaboursByUserId(Long id);

}
