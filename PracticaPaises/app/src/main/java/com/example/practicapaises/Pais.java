package com.example.practicapaises;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Pais {
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String nombre;
    String url;

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    String subtitulo;
    public Pais() throws JSONException {
        subtitulo="";
       // nombre = a.getString("Name").toString();
        //url = a.getString("intro").toString();
       // url = "http://www.geognos.com/api/en/countries/flag/"+a.getString("iso2")+".png";
    }

    public static ArrayList<Pais> JsonObjectsBuild(JSONArray datos) throws JSONException {
        ArrayList<Pais> noticias = new ArrayList<>();
        //for (int i = 0; i < datos.length(); i++) {
          //  noticias.add(new Pais(datos.getJSONObject(i)));
        //}
        return noticias;
    }
}
