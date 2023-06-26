package us.fobros.fobros.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import us.fobros.fobros.entity.State;

@Repository

public interface StateRepository extends JpaRepository<State, Integer> {
    @Query("SELECT s FROM State s WHERE s.city LIKE %?1%")
    Page<State> getAllStatesFromCity(String search, Pageable pageable);

    @Query("SELECT s FROM State s WHERE s.name LIKE %?1%")
    Page<State> getAllStatesFromZip(String search, Pageable pageable);

}
