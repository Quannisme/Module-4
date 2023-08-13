package code.vn.reponsitory;

import code.vn.modell.Medical;

import java.util.List;
public interface MedicalReponsitory {
    List<Medical>findAll();
    void create(Medical medical);
}
