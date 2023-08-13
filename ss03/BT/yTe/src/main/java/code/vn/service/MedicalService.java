package code.vn.service;

import code.vn.modell.Medical;

import java.util.List;

public interface MedicalService {
    List<Medical> findAll();
    void create(Medical medical);
}
