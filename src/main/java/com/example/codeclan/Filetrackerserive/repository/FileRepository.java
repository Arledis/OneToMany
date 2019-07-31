package com.example.codeclan.Filetrackerserive.repository;

import com.example.codeclan.Filetrackerserive.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
