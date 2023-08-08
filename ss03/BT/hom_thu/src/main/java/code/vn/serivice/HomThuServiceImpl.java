package code.vn.serivice;

import code.vn.model.HomThu;
import code.vn.reponsitory.HomThuReponsitoryImpl;
import code.vn.reponsitory.HomThuReponsitoryInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomThuServiceImpl implements HomThuServiceInter{
    @Autowired
    private HomThuReponsitoryInter homThuReponsitoryInter;


    @Override
    public List<HomThu> FindAll() {
        return homThuReponsitoryInter.FindAll();
    }

    @Override
    public void create(HomThu homThu) {
        homThuReponsitoryInter.create(homThu);
    }
}
