package cl.desafiolatam.tiempoestatico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import cl.desafiolatam.tiempoestatico.databinding.ActivityMainBinding;
import cl.desafiolatam.tiempoestatico.model.DailyWeather;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    DailyWeather dwTiempo;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        initData();
        initView();
    }

    private void initData() {
        dwTiempo = new DailyWeather("Santiago", "24-11-2020", R.drawable.ic_dom, "24º", "C");
    }

    private void initView() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setTiempo(dwTiempo);
    }
}