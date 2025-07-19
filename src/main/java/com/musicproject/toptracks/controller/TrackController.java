package com.musicproject.toptracks.controller;

import com.musicproject.toptracks.model.Track;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TrackController {

    List<Track> tracks = new ArrayList<>();

    // create a GET endpoint
    @GetMapping("/tracks")
    public List<Track> getTrack(){
        return tracks;
    }

    @PostMapping("/tracks")
    public void createTrack(@RequestBody Track track){
        System.out.println(track.getTitle());
        tracks.add(track);
    }
}
