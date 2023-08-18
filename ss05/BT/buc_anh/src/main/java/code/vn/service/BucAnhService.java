package code.vn.service;

import code.vn.entity.BucAnh;

import java.util.List;

public interface BucAnhService {
    List<BucAnh> findAll();

    void create(BucAnh bucAnh);
}
