package com.gustavo.MusicApi.service;

import java.util.List;

import com.gustavo.MusicApi.entity.Album;

public interface IAlbumsService {

	List<Album> buscarTodos();
	
	void guardar(Album album);
	
	void eliminar(Integer idAlbum);	
}
