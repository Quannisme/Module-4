package code.vn.reponsitory;

import code.vn.model.HomThu;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class HomThuReponsitoryImpl implements HomThuReponsitoryInter{
    private static Map<String , HomThu>homThuMap;
    static {
        homThuMap=new HashMap<>();
        homThuMap.put("1",new HomThu("1","haha"));
        homThuMap.put("2",new HomThu("2","sad"));
        homThuMap.put("3",new HomThu("3","kkkk"));
        homThuMap.put("4",new HomThu("4","haha"));
    }

    @Override
    public List<HomThu> FindAll() {

        return new ArrayList<>(homThuMap.values());
    }

    @Override
    public void create(HomThu homThu) {
        if (!homThuMap.containsKey(homThu.getId())){
            homThuMap.put(homThu.getId(),homThu);
        }
    }
}
