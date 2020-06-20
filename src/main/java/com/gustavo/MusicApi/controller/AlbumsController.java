package com.gustavo.MusicApi.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.MusicApi.entity.Album;
import com.gustavo.MusicApi.service.IAlbumsService;

@RestController
@RequestMapping("/api")
public class AlbumsController {

	@Autowired
	private IAlbumsService serviceAlbums;

	@GetMapping("/albums")
	public List<Album> buscarTodos() {
		return serviceAlbums.buscarTodos();

	}

	@RequestMapping(value = "/albums", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)

	public Album guardar(@RequestBody Album album) {

		album.setLanzamiento(new Date());
		serviceAlbums.guardar(album);
		return album;
	}
	
	@RequestMapping(value = "/albums", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Album update(@RequestBody Album album) {
		
		serviceAlbums.guardar(album);
		return album;
		
	}
	
	@RequestMapping(value = "/albums/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String eliminar(@PathVariable("id") int idAlbum) {
	
		serviceAlbums.eliminar(idAlbum);
		return "Registro eliminado";
	}
}
