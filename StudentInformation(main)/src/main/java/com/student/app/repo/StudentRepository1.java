package com.student.app.repo;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.student.app.model.Student1;

@Repository
@Transactional
public interface StudentRepository1 extends JpaRepository<Student1, Long> {

}
