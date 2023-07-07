package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.faculty.FacultyDetails;
@Repository
public interface facultyRepository extends JpaRepository<FacultyDetails,Long>{


}
