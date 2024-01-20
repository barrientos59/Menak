package com.example.Menak;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
record Stats(
        Integer wins, Integer losses, Integer ties,
        Integer gamesPlayed, Integer goalsFor,
        Integer goalsAgainst, Integer points,
        Integer rank, Integer goalDifference
) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record Team(String name, String logo, String abbreviation) {}

@JsonIgnoreProperties(ignoreUnknown = true)
record MenakResponse(Team team, Stats stats) {}
