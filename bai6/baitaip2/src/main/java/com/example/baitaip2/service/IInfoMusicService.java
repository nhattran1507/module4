package com.example.baitaip2.service;

import com.example.baitaip2.entity.InfoMusic;

import java.util.List;

public interface IInfoMusicService {
    List<InfoMusic> getInfoMusic();
    void save(InfoMusic infoMusic);
    void update(int id, InfoMusic infoMusic);
    InfoMusic findById(int id);
}
