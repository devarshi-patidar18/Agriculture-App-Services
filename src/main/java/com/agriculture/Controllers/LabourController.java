package com.agriculture.Controllers;

import com.agriculture.DTOs.LabourDto;
import com.agriculture.Models.Labour;
import com.agriculture.Services.LabourService;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labour")
public class LabourController {

    @Autowired
    public LabourService labourService;

    @PostMapping("/save")
    public String save(@RequestBody LabourDto labourDto){
        Labour labour = new Labour();
        labour.setAddress(labourDto.getAddress());
        labour.setDailyRates(labourDto.getDailyRates());
        labour.setGender(labourDto.getGender());
        labour.setLabourName(labourDto.getLabourName());
        labour.setUserId(labourDto.getUserId());
        labourService.save(labour);

        return "Labour Created Successfully";
    }

    @GetMapping("/get-by-id")
    public Labour getLabourById(@RequestHeader("id") Long id) throws NoSuchElementException{
        return labourService.getLabourById(id).get();
    }

    @GetMapping("/get-all")
    public List<Labour> getAllLabours(){
        return labourService.getAllLabours();
    }

    @GetMapping("/get-by-user")
    public List<Labour> getLaboursByUserId(@RequestHeader("userId") Long id){
        return labourService.getLaboursByUserId(id);
    }

}
