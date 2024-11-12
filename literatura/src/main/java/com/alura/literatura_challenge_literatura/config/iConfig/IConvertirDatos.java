package com.alura.literatura_challenge_literatura.config.iConfig;

public interface IConvertirDatos {

    <T> T convertirDatosJsonAJava(String json , Class<T> clase);
}
