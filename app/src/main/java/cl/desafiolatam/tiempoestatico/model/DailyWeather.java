package cl.desafiolatam.tiempoestatico.model;

import android.widget.ImageView;

import androidx.databinding.BindingMethod;

public class DailyWeather {
    String tvCiudad;
    String tvFecha;
    int imgSun;
    String tvTemperatura;
    String tvUnidad;

    public DailyWeather(String tvCiudad, String tvFecha, int imgSun, String tvTemperatura, String tvUnidad) {
        this.tvCiudad = tvCiudad;
        this.tvFecha = tvFecha;
        this.imgSun = imgSun;
        this.tvTemperatura = tvTemperatura;
        this.tvUnidad = tvUnidad;
    }

    public String getTvCiudad() {
        return tvCiudad;
    }

    public void setTvCiudad(String tvCiudad) {
        this.tvCiudad = tvCiudad;
    }

    public String getTvFecha() {
        return tvFecha;
    }

    public void setTvFecha(String tvFecha) {
        this.tvFecha = tvFecha;
    }

    public int getImgSun() {
        return imgSun;
    }

    public void setImgSun(int imgSun) {
        this.imgSun = imgSun;
    }

    public String getTvTemperatura() {
        return tvTemperatura;
    }

    public void setTvTemperatura(String tvTemperatura) {
        this.tvTemperatura = tvTemperatura;
    }

    public String getTvUnidad() {
        return tvUnidad;
    }

    public void setTvUnidad(String tvUnidad) {
        this.tvUnidad = tvUnidad;
    }
}
