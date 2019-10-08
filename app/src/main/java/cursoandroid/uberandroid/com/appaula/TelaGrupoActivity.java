package cursoandroid.uberandroid.com.appaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TelaGrupoActivity extends AppCompatActivity {

    private ListView listView;
    private String[] itens = {
      "Visualizar Grupos", "Lista de Espera", "Adicionar Grupo"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_grupo);

        listView = findViewById(R.id.listView);

        //Criar adaptador para a Lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //Adicionar adaptador para a Lista
        listView.setAdapter( adaptador );

    }
}






