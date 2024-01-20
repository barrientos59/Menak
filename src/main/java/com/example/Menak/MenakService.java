package com.example.Menak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MenakService {

    @Autowired
    RestTemplate restTemplate;

    protected MenakResponse[] getMenakResponse() {

        MenakResponse data[] = restTemplate.getForObject(
                "https://premier-league-standings1.p.rapidapi.com/", MenakResponse[].class);

        return data;
    }
}
