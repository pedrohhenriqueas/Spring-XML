package com.example.spring_boot_xml.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCharSequence;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.spring_boot_xml.entities.Videos;
import com.example.spring_boot_xml.repository.VideosRepository;

@ExtendWith(SpringExtension.class)
@DisplayName("Tests to Videos Service")
class VideosServiceTest {
	
	// @InjectMocks
	// private VideosService videosService;
	
	// @Mock
	// private VideosRepository videosRepository;
	
	// @BeforeEach
	// public void setup() {
	// 	MockitoAnnotations.openMocks(this);
	// }
	
	// @Test
	// 	@DisplayName("Video Post Test")
	// 	void postVideoTest() {
		
	// 	Videos videoToPublish = new Videos("Video 1", "Description 1", true);
		
	// 	when(videosRepository.save(videoToPublish)).thenReturn(videoToPublish);
		
	// 	Videos video = videosService.postVideo(videoToPublish);
		
	// 	assertThat(video).isNotNull();
	
	// 	assertThat(video.getTitle()).isEqualTo(videoToPublish.getTitle());		
	// }
	
	
	// @Test
	// 	@DisplayName("Find All Test")
	// 	void findAllTest() {

	// 	when(videosRepository.findAll()).thenReturn(List.of(new Videos("Video 1", "Description 1", true)));
		
	// 	List<Videos> videos = videosService.findAll();

	// 	assertThat(videos).isNotEmpty();
	// }

}
