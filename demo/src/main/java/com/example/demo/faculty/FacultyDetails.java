package com.example.demo.faculty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacultyDetails {
@Id
private long id;
private String name;
private long salary;
private String facultyDepartment;
private String Address;
}
