package cl.jpvs.medidordeclave;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements VistaPresentador{
    private Presentador presentando;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void mostrarDebil() {

    }

    @Override
    public void mostrarMedia() {

    }

    @Override
    public void mostrarFuerte() {

    }

    @Override
    public void mostrarError() {

    }
}