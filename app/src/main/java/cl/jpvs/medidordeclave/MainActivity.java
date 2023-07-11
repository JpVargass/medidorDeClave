package cl.jpvs.medidordeclave;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import cl.jpvs.medidordeclave.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity implements VistaPresentador{

    private ActivityMainBinding binding;
    private Presentador presentando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        presentando = new Presentador((this));
        binding.ediTxtPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentando.evaluarContrasena(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void mostrarDebil() {
        binding.tvResultado.setText("Seguridad debil");
        binding.tvResultado.setBackgroundColor(Color.RED);
    }

    @Override
    public void mostrarMedia() {
        binding.tvResultado.setText("Seguridad media");
        binding.tvResultado.setBackgroundColor(Color.YELLOW);
    }

    @Override
    public void mostrarFuerte() {
        binding.tvResultado.setText("Seguridad correcta");
        binding.tvResultado.setBackgroundColor(Color.GREEN);
    }

    @Override
    public void mostrarError() {
        binding.tvResultado.setText("error en password");
        binding.tvResultado.setBackgroundColor(Color.YELLOW);
    }
}