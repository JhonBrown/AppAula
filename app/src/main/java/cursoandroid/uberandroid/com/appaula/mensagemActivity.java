package cursoandroid.uberandroid.com.appaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mensagemActivity extends AppCompatActivity {

    private ListView listMensagem;
    private String[] itens = {
            "Mensagem 1", "Mensagem 2", "Mensagem 3"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        listMensagem = findViewById(R.id.listMensagem);

        //Criar adaptador para a Lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //Adicionar adaptador para a Lista
        listMensagem.setAdapter( adaptador );

    }


}
