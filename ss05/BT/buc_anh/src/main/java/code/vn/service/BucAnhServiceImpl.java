package code.vn.service;

import code.vn.entity.BucAnh;
import code.vn.repository.BucAnhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BucAnhServiceImpl implements BucAnhService {
    @Autowired
    private BucAnhRepository bucAnh;

    @Override
    public List<BucAnh> findAll() {
        return bucAnh.findAll();
    }

    @Override
    public void create(BucAnh bucAnh1) {
        bucAnh.create(bucAnh1);
    }
}
