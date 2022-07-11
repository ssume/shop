package act.study.shop.repository;

import act.study.shop.domain.ItemVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemVO, Long> {

    public List<ItemVO> findAll();
}
