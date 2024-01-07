package com.imuzio.crud.repository;

import com.imuzio.crud.model.entity.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSubjectRepository extends JpaRepository<StudentSubject,Long> {
}
