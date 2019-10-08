package cursoandroid.uberandroid.com.appaula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class grupoListActivity extends AppCompatActivity {
    private ListView listGrupo;
    private String[] itens = {
            "Grupo 1", "Grupo 2", "Grupo 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_list);

        listGrupo = findViewById(R.id.listGrupo);

        //Criar adaptador para a Lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //Adicionar adaptador para a Lista
        listGrupo.setAdapter(adaptador);

    }
}
