package aplicacion.androi.scarlett.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText primernumero,segundonumero,tercernumero;
    private TextView resultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primernumero = (EditText)findViewById(R.id.editText);
        segundonumero = (EditText)findViewById(R.id.editText2);
        tercernumero = (EditText)findViewById(R.id.editText4);
        resultado = (TextView)findViewById(R.id.textView4);
    }

    public void Sumar (View view){

        String numero1 = primernumero.getText().toString();
        String numero2 = segundonumero.getText().toString();
        String numero3 = tercernumero.getText().toString();

        if (primernumero.getText().toString().length()>0 |
                segundonumero.getText().toString().length()>0 |
                tercernumero.getText().toString().length()>0){

            Double A = Double.valueOf(numero1);
            Double B = Double.valueOf(numero2);
            Double C = Double.valueOf(numero3);
            String r =Double.toString(A+B+C);


            resultado.setText(r);
        }

        }
    public void restar (View view){

        String numero1 = primernumero.getText().toString();
        String numero2 = segundonumero.getText().toString();


        if (primernumero.getText().toString().length()>0 |
                segundonumero.getText().toString().length()>0 ){

            Double A = Double.valueOf(numero1);
            Double B = Double.valueOf(numero2);

            String r =Double.toString(A-B);


            resultado.setText(r);
        }

    }


    }






