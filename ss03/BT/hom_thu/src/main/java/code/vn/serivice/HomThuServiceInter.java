package code.vn.serivice;

import code.vn.model.HomThu;

import java.util.List;

public interface HomThuServiceInter {
    List<HomThu> FindAll();
    void create(HomThu homThu);
}
