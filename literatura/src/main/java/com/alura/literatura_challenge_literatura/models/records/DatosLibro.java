package com.alura.literatura_challenge_literatura.models.records;

import com.alura.literatura_challenge_literatura.models.Autor;
import com.fasterxml.jackson.annotation.JsonAlias;

import javax.print.attribute.standard.Media;
import java.util.List;

public record DatosLibro(
        @JsonAlias("id") Long libroId,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<Autor> autor, //@JsonAlias("authors") List<Author> authors,
        @JsonAlias("subjects")  List<String> genero,
        @JsonAlias("languages") List<String> idioma,
        @JsonAlias("formats") Media imagen, // @JsonAlias("formats") Formats formatos,
        @JsonAlias("download_count") Long cantidadDescargas
)
 {
}
