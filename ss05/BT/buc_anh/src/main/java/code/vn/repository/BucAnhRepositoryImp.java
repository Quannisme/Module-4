package code.vn.repository;

import code.vn.entity.BucAnh;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class BucAnhRepositoryImp implements IBucAnhRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<BucAnh> findAll() {
        return entityManager.createQuery("from BucAnh b").getResultList();
    }

    @Override
    public void create(BucAnh bucAnh) {
        entityManager.persist(bucAnh);
    }
}
