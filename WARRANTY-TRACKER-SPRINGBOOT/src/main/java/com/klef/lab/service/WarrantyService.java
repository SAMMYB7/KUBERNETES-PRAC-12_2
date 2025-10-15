package com.klef.lab.service;

import com.klef.lab.entity.Warranty;
import java.util.List;

public interface WarrantyService {
    List<Warranty> getAllWarranties();
    Warranty getWarrantyById(Long id);
    Warranty createWarranty(Warranty warranty);
    Warranty updateWarranty(Long id, Warranty warranty);
    void deleteWarranty(Long id);
}
