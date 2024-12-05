package com.codegnan.repo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codegnan.entity.Doctor;
@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {
	Optional<Doctor> findByName(String name);
}
