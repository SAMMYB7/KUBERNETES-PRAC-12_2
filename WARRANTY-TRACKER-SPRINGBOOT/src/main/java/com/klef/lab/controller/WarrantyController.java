package com.klef.lab.controller;

import com.klef.lab.entity.Warranty;
import com.klef.lab.service.WarrantyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warrantyapi/")
@CrossOrigin(origins = "*")
public class WarrantyController {
    
    private final WarrantyService warrantyService;
    
    public WarrantyController(WarrantyService warrantyService) {
        this.warrantyService = warrantyService;
    }
    
    @GetMapping("/")
    public String home() 
    {
        return "Full Stack Deployment Practice";
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Warranty>> getAllWarranties() {
        List<Warranty> warranties = warrantyService.getAllWarranties();
        return new ResponseEntity<>(warranties, HttpStatus.OK);
    }
    
    @GetMapping("/get/{id}")
    public ResponseEntity<Warranty> getWarrantyById(@PathVariable Long id) {
        try {
            Warranty warranty = warrantyService.getWarrantyById(id);
            return new ResponseEntity<>(warranty, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("/add")
    public ResponseEntity<Warranty> createWarranty(@RequestBody Warranty warranty) {
        try {
            Warranty createdWarranty = warrantyService.createWarranty(warranty);
            return new ResponseEntity<>(createdWarranty, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Warranty> updateWarranty(@PathVariable Long id, @RequestBody Warranty warranty) {
        try {
            Warranty updatedWarranty = warrantyService.updateWarranty(id, warranty);
            return new ResponseEntity<>(updatedWarranty, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteWarranty(@PathVariable Long id) {
        try {
            warrantyService.deleteWarranty(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
