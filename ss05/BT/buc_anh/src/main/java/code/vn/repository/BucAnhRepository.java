package code.vn.repository;

import code.vn.entity.BucAnh;

import java.util.List;

public interface BucAnhRepository {
    List<BucAnh> findAll();

    void create(BucAnh bucAnh);
}
