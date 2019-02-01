package com.student.app.repo;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.student.app.model.Student2;

@Repository
@Transactional
public interface Student2Repository extends JpaRepository<Student2, Long> {

}
