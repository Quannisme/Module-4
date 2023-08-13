package code.vn.reponsitory;

import code.vn.modell.DateOfDeparture;
import code.vn.modell.EndOfMonthYear;
import code.vn.modell.Medical;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MedicalReponsitoryImpl implements MedicalReponsitory{
    private static Map<String,Medical> yTeMap;

    static {
        yTeMap=new HashMap<>();
        yTeMap.put("1",new Medical("1","nguyenvanquan","1990","12","12","1", new DateOfDeparture("01","02","1993"),new EndOfMonthYear("01","03","1993"),"da nang"));
        yTeMap.put("2",new Medical("2","nguyenvanquan2","1990","12","12","1", new DateOfDeparture("01","02","1993"),new EndOfMonthYear("01","03","1993"),"da nang"));
        yTeMap.put("3",new Medical("3","nguyenvanquan3","1990","12","12","1", new DateOfDeparture("01","02","1993"),new EndOfMonthYear("01","03","1993"),"da nang"));
        yTeMap.put("4",new Medical("4","nguyenvanquan4","1990","12","12","1", new DateOfDeparture("01","02","1993"),new EndOfMonthYear("01","03","1993"),"da nang"));
    }

    @Override
    public List<Medical> findAll() {
        return new ArrayList<>(yTeMap.values());
    }

    @Override
    public void create(Medical medical) {
        if (!yTeMap.containsKey(medical.getId())){
            yTeMap.put(medical.getId(),medical);
        }
    }
}
