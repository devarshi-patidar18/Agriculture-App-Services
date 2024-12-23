package com.agriculture.Repositories;

import com.agriculture.Models.Labour;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabourRepository extends JpaRepository<Labour,Long>{

    List<Labour> findLabourByUserId(Long id);

}
