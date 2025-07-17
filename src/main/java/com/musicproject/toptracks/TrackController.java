package com.musicproject.toptracks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackController {

    // create a GET endpoint
    @GetMapping("/tracks")
    public List<Track> getTrack(){
        // returns 3 hard coded tracks as JSON
        var t1 = new Track("Sicko Mode", "Travis Scott", "Hip Hop", 20);
        var t2 = new Track("Driver's License", "Olivia Rodrigo", "Pop", 15);
        var t3 = new Track("Humble", "Kendrick Lamar", "Hip Hop", 50);
        return List.of(t1, t2, t3);
    }
}
