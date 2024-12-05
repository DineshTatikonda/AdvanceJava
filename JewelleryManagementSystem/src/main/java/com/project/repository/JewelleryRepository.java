package com.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.model.Jewellery;
@Repository
public interface JewelleryRepository extends JpaRepository<Jewellery, Integer>{

}
