package cl.desafiolatam.tiempoestatico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import cl.desafiolatam.tiempoestatico.databinding.ActivityMainBinding;
import cl.desafiolatam.tiempoestatico.model.DailyWeather;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DailyWeather dwTiempo = new DailyWeather("Santiago", "24-11-2020", 1, "24º", "C");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setTiempo(dwTiempo);



    }
}