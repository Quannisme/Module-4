package code.vn.service;

import code.vn.modell.Medical;
import code.vn.reponsitory.MedicalReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicalServiceImpl implements MedicalService{
    @Autowired
    private MedicalReponsitory medicalReponsitory;
    @Override
    public List<Medical> findAll() {
        return medicalReponsitory.findAll();
    }

    @Override
    public void create(Medical medical) {
        medicalReponsitory.create(medical);
    }
}
