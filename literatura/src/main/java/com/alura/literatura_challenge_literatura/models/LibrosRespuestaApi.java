package com.alura.literatura_challenge_literatura.models;

import com.alura.literatura_challenge_literatura.models.records.DatosLibro;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class LibrosRespuestaApi {

    @JsonAlias("results")
    List<DatosLibro> resultadoLibros;

    public List<DatosLibro> getResultadoLibros() {
        return resultadoLibros;
    }

    public void setResultadoLibros(List<DatosLibro> resultadoLibros) {
        this.resultadoLibros = resultadoLibros;
    }
}
