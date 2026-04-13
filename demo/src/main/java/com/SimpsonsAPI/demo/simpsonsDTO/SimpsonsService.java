package com.SimpsonsAPI.demo.simpsonsDTO;

import org.springframework.stereotype.Service;

@Service
public class SimpsonsService {

    public SimpsonsResponse getSimpsonsQuote() {
        return new SimpsonsResponse("Homer Simpson", "¡Ouch! (Mosquis)");
    }
}
