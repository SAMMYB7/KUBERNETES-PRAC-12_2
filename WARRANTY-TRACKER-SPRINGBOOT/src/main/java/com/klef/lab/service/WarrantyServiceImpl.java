package com.klef.lab.service;

import com.klef.lab.entity.Warranty;
import com.klef.lab.repository.WarrantyRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class WarrantyServiceImpl implements WarrantyService {
    
    private final WarrantyRepository warrantyRepository;
    
    public WarrantyServiceImpl(WarrantyRepository warrantyRepository) {
        this.warrantyRepository = warrantyRepository;
    }
    
    @Override
    public List<Warranty> getAllWarranties() {
        return warrantyRepository.findAll();
    }
    
    @Override
    public Warranty getWarrantyById(Long id) {
        return warrantyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Warranty not found with ID: " + id));
    }
    
    @Override
    public Warranty createWarranty(Warranty warranty) {
        if (warranty.getItemName() == null || warranty.getItemName().trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty");
        }
        LocalDate expiryDate = warranty.getPurchaseDate().plusMonths(warranty.getWarrantyPeriodMonths());
        warranty.setExpiryDate(expiryDate);
        return warrantyRepository.save(warranty);
    }
    
    @Override
    public Warranty updateWarranty(Long id, Warranty warranty) {
        Warranty existingWarranty = getWarrantyById(id);
        existingWarranty.setItemName(warranty.getItemName());
        existingWarranty.setPurchaseDate(warranty.getPurchaseDate());
        existingWarranty.setWarrantyPeriodMonths(warranty.getWarrantyPeriodMonths());
        LocalDate expiryDate = warranty.getPurchaseDate().plusMonths(warranty.getWarrantyPeriodMonths());
        existingWarranty.setExpiryDate(expiryDate);
        existingWarranty.setVendor(warranty.getVendor());
        existingWarranty.setNotes(warranty.getNotes());
        return warrantyRepository.save(existingWarranty);
    }
    
    @Override
    public void deleteWarranty(Long id) {
        Warranty existingWarranty = getWarrantyById(id);
        warrantyRepository.delete(existingWarranty);
    }
}
