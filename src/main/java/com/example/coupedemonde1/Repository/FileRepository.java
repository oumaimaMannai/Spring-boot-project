package com.example.coupedemonde1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.coupedemonde1.entities.File;

@Repository
public interface FileRepository extends JpaRepository<File , String>{

}
