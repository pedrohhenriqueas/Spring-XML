package com.example.spring_boot_xml.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.spring_boot_xml.entities.Videos;
import com.example.spring_boot_xml.repository.VideosRepository;

@Service
public class VideosService {
	
	@Autowired
	private VideosRepository repository;

	public List<Videos> findAll(){
		return repository.findAll();
	}
	
	public ResponseEntity<List<Videos>> findByTitle(String title){
		List<Videos> videos = repository.findByTitle(title);
		return ResponseEntity.ok(videos);
	}
	
	public ResponseEntity<Videos> findById(Long id){
		Optional<Videos> videos = repository.findById(id);
	    if (videos.isPresent()) {
	        return ResponseEntity.ok(videos.get());
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }	
	}
	
	public Videos postVideo(Videos video){
		Videos videoToPublish = new Videos();
		videoToPublish.setTitle(video.getTitle());
		videoToPublish.setDescription(video.getDescription());
		videoToPublish.isPublished();
		repository.save(videoToPublish);
		return videoToPublish;
	}
	
	public ResponseEntity<?> deleteById(Long id) {
		repository.deleteById(id);
	    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	public void deleteAllVideos(){
		repository.deleteAll();
	}
	
	public ResponseEntity<List<Videos>> findByPublished(){
		List<Videos> videos = repository.findByPublished(true);

		if(videos.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
	    return new ResponseEntity<>(videos, HttpStatus.OK);
	}
}
