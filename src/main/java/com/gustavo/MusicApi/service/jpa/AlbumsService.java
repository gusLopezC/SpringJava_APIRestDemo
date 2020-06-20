package com.gustavo.MusicApi.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.MusicApi.entity.Album;
import com.gustavo.MusicApi.repository.AlbumsRepository;
import com.gustavo.MusicApi.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {

	
	@Autowired
	private AlbumsRepository repoAlbums;
	
	@Override
	public List<Album> buscarTodos() {
		// TODO Auto-generated method stub
		return repoAlbums.findAll();
	}

	@Override
	public void guardar(Album album) {
		// TODO Auto-generated method stub
		repoAlbums.save(album);
		
	}

	@Override
	public void eliminar(Integer idAlbum) {
		// TODO Auto-generated method stub
		
		repoAlbums.deleteById(idAlbum);
		
		
	}

}
