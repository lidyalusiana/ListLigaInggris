package id.ac.poliban.mi.listligainggris;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<LigaInggris> LigaInggrises = new ArrayList<>();
    private ListView lvLigaInggris;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //koneksikan object dengan view
        lvLigaInggris = findViewById(R.id.listview);

        //ambil data dari LigaInggrisData dan berikan ke object LigaInggrises
        LigaInggrises.addAll(LigaInggrisData.getLigaInggrises());

        //buat object adapter dan kirim data makanans sebagai
        //parameter di konstruktor MakananAdapter()
        adapter = new LigaInggrisAdapter(LigaInggrises);
        //pasang object adapter sebagai adapter lvMakanan
        lvLigaInggris.setAdapter(adapter);

        //menambahkan kejadian ketika user mengklik salah satu item
        lvLigaInggris.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("info")
                    .setMessage(LigaInggrises.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });
    }
}
