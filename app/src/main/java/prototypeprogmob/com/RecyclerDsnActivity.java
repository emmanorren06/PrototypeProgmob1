package prototypeprogmob.com;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import prototypeprogmob.com.Adapter.DosenAdapter;
import prototypeprogmob.com.Model.DSN;
import prototypeprogmob.com.Network.GetDataService;
import prototypeprogmob.com.Network.RetrofitClientInstance;
import prototypeprogmob.com.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RecyclerDsnActivity extends AppCompatActivity {
    RecyclerView rvDsn;
    private RecyclerView recyclerView;
    private DosenAdapter dsnAdapter;
    private ArrayList<DSN> dsnArrayList;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_dsn);

        ImageButton ImgDsn = (ImageButton) findViewById(R.id.ImgDsn);
        ImgDsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(RecyclerDsnActivity.this,CRUDDosen.class);
                startActivity(i);
            }
        });

        //addData();
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<DSN>>call = service.getDosenAll("721600012");
        call.enqueue(new Callback<List<DSN>>() {
            @Override
            public void onResponse(Call<List<DSN>> call, Response<List<DSN>> response) {

                progressDialog.dismiss();

                recyclerView = findViewById(R.id.rvDsn);
                dsnAdapter = new DosenAdapter(dsnArrayList);

                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerDsnActivity.this);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(dsnAdapter);
            }

            @Override
            public void onFailure(Call<List<DSN>> call, Throwable t) {

            }
        });


    }
    /*private void addData(){
        dsnArrayList = new ArrayList<>();
        dsnArrayList.add(new DSN("",
                "123456789","Hendra Sigalingging", "hendra12@gmail.com", "jl.Mangga 12A Yogyakarta","S.Kom", R.drawable.hendra));
        dsnArrayList.add(new DSN("",
                "234567890","Yetli Oslan","yetli_oslan@gmail.com", "JL.Kamboja 78 Yogyakarta", "S.Kom",R.drawable.yetli));
//        R.drawable.yetli
        dsnArrayList.add(new DSN("",
                "345678901","Wimmie H", "wimmiesyalala@gmail.com", "jl.Naga mas 66 Yogyakarta","S.Kom", R.drawable.wimmie));

    }*/

}
