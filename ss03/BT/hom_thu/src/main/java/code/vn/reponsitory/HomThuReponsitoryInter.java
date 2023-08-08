package code.vn.reponsitory;

import code.vn.model.HomThu;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface HomThuReponsitoryInter {
    List<HomThu>FindAll();
    void create(HomThu homThu);
}
