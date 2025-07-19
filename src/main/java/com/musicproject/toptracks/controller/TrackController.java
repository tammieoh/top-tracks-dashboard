package com.musicproject.toptracks.controller;

import com.musicproject.toptracks.model.Track;
import com.musicproject.toptracks.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TrackController {

    List<Track> tracks = new ArrayList<>();
    Map<String, List<Track>> map = new HashMap<>();
    User u1 = new User("user1", "abcd");
    User u2 = new User("user2", "efgh");
    User u3  = new User("user3", "ijkl");
    Track t1 = new Track("Part of Me", "Katy Perry", "Pop", 4);
    Track t2 = new Track("Sicko Mode", "Travis Scott", "Rap", 10);
    Track t3 = new Track("After Party", "Don Toliver", "Hip Hop", 2);
    Track t4 = new Track("Driver's License", "Olivia Rodrigo", "Pop", 5);

    List<Track> tracksForUser1 = List.of(t1, t2);
    List<Track> tracksForUser2 = List.of(t3);
    List<Track> tracksForUser3 = List.of(t4);

    public TrackController() {
        map.put(u1.getUsername(), tracksForUser1);
        map.put(u2.getUsername(), tracksForUser2);
        map.put(u3.getUsername(), tracksForUser3);
    }

    // create a GET endpoint to get all tracks
    @GetMapping("/tracks")
    public List<Track> getTrack(){
        return tracks;
    }

    // create a POST endpoint to create track
    @PostMapping("/tracks")
    public void createTrack(@RequestBody Track track){
        System.out.println(track.getTitle());
        tracks.add(track);
    }

    @GetMapping("/users/{username}/tracks")
    public List<Track> getTracksByUsername(@PathVariable String username){
        if(!this.map.containsKey(username)){
            return null;
        }
        return this.map.get(username);
    }
}
