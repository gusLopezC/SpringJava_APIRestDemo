package com.gustavo.MusicApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.MusicApi.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
