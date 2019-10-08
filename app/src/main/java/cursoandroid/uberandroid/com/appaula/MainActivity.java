package cursoandroid.uberandroid.com.appaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editEmail, editSenha;
    private Button buttonSalvar;
    private Button buttonSalvar2;
    private Button buttonSalvar3;
    private Button buttonSalvar4;
    private Button buttonSalvar5;
    private Button buttonSalvar6;
            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //editEmail = findViewById(R.id.editEmail);
        //editSenha = findViewById(R.id.editSenha);
        buttonSalvar = findViewById(R.id.buttonSalvar);
        buttonSalvar2 = findViewById(R.id.buttonSalvar2);
        buttonSalvar3 = findViewById(R.id.buttonSalvar3);
        buttonSalvar4 = findViewById(R.id.buttonSalvar4);
        buttonSalvar5 = findViewById(R.id.buttonSalvar5);
        buttonSalvar6 = findViewById(R.id.buttonSalvar6);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TelaGrupoActivity.class);
                startActivity( intent );
            }
        });
        buttonSalvar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mensagemActivity.class);
                startActivity( intent );
            }
        });
        buttonSalvar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), cadastroActivity.class);
                startActivity( intent );
            }
        });
        buttonSalvar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity( intent );
            }
        });buttonSalvar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Msg_Activity.class);
                startActivity( intent );
            }
        });buttonSalvar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), grupoListActivity.class);
                startActivity( intent );
            }
        });
    }



    //public void salvar(View view){ }

}
