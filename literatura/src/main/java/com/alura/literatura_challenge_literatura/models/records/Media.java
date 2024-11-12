package com.alura.literatura_challenge_literatura.models.records;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Media(
        @JsonAlias("image/jpeg") String imagen)
 {
}
