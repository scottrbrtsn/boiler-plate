package com.robertson.boiler.plate.ras;

import com.robertson.boiler.plate.domain.Logs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILogsRepository extends JpaRepository<Logs, String> {
    List<Logs> findByName(String name);

    List<Logs> findById(long id);

}
