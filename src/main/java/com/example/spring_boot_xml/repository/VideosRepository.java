package com.example.spring_boot_xml.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_boot_xml.entities.Videos;

@Repository
public interface VideosRepository extends JpaRepository<Videos, Long>{

	List<Videos> findByPublished(boolean published);
	List<Videos> findByTitle(String title);
}
