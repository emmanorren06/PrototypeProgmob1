package prototypeprogmob.com;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import prototypeprogmob.com.Adapter.MHSAdapter;
import prototypeprogmob.com.Model.MhsSI;

public class RecyclerMhsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MHSAdapter mhsAdapter;
    private ArrayList<MhsSI> mhsSIArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_mhs);

        Button resetButton = (Button) findViewById(R.id.BtnSimpan);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(RecyclerMhsActivity.this);

                builder.setMessage("Apakah anda yakin untuk mereset nilai prototype?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(RecyclerMhsActivity.this, "Tidak jadi reset", Toast.LENGTH_SHORT).show();
                            }
                        })

                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(RecyclerMhsActivity.this,MenuAdmin.class);
                                startActivity(i);
                            }
                        });

                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });

        addData();

        recyclerView = findViewById(R.id.rvDataMhs);
        mhsAdapter = new MHSAdapter(mhsSIArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(RecyclerMhsActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mhsAdapter);
    }
    private  void addData(){
        mhsSIArrayList = new ArrayList<>();
        mhsSIArrayList.add(new MhsSI("72170157","Frizk F.Nainggolan",
                "jl.Mawar 45 Yogyakarta","frizka12@gmail.com",R.drawable.frizka));
        mhsSIArrayList.add(new MhsSI("72170101","Cynthia Kumalasari",
                "jl.Melati 22 Yogyakarta","cynku.syalala@gmail.com",R.drawable.cyntia));
        mhsSIArrayList.add(new MhsSI("72170149","Ivan Bernov",
                "jl.Anggrek 23 Yogyakerta","ivan55@gmail.com",R.drawable.ivan));
        mhsSIArrayList.add(new MhsSI("72170117","Daniel Surya Nugraha",
                "jl.Kamboja 67 Yogyakarta","damen@gmail.com",R.drawable.daniel));
    }

}
