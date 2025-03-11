package com.example.spring_boot_xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_boot_xml.entities.Videos;
import com.example.spring_boot_xml.service.VideosService;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/videos")
public class VideosController {

	@Autowired
	private VideosService videosService;
	
	@GetMapping("/all")
	public List<Videos> getAllVideos(){
		return videosService.findAll();
	}
	
	@PostMapping
	public Videos create(@RequestBody Videos video){
		return videosService.postVideo(video);
	}
	
	@GetMapping
	public ResponseEntity<List<Videos>> findByTitle(@RequestParam String title){
		return videosService.findByTitle(title);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Videos> findById(@PathVariable("id") Long id){
		return videosService.findById(id);
	}
	
	@DeleteMapping("/all")
	public ResponseEntity<?> deleteAll(){
		videosService.deleteAllVideos();
		return ResponseEntity.ok("Videos deleted successfully!");

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable("id") Long id){
		videosService.deleteById(id);
		return ResponseEntity.ok("Video deleted successfully!");
	}
	
}
