package code.vn.reponsitory;

import code.vn.modell.DateOfDeparture;
import code.vn.modell.EndOfMonthYear;
import code.vn.modell.Medical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class MedicalReponsitoryImpl implements MedicalReponsitory{
    private static Map<String,Medical>medicalMap;
    static {
        medicalMap.put("1",new Medical("1","nguyenvanquan","1990","12","12","1", new DateOfDeparture("01","02","1993"),new EndOfMonthYear("01","03","1993"),"da nang"));
        medicalMap.put("1",new Medical("1","nguyenvanquan","1990","12","12","1", new DateOfDeparture("01","02","1993"),new EndOfMonthYear("01","03","1993"),"da nang"));
        medicalMap.put("1",new Medical("1","nguyenvanquan","1990","12","12","1", new DateOfDeparture("01","02","1993"),new EndOfMonthYear("01","03","1993"),"da nang"));
        medicalMap.put("1",new Medical("1","nguyenvanquan","1990","12","12","1", new DateOfDeparture("01","02","1993"),new EndOfMonthYear("01","03","1993"),"da nang"));
    }
    @Override
    public List<Medical> findAll() {
        return new ArrayList<>(medicalMap.values());
    }

    @Override
    public void create(Medical medical) {
        if (!medicalMap.containsKey(medical.getId())){
            medicalMap.put(medical.getId(),medical);
        }
    }
}
