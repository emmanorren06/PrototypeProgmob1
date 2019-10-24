package prototypeprogmob.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*Button appBtn =(Button) findViewById(R.id.sign_in);
        appBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MenuDosen.class);
                startActivity(i);
            }
        });*/

        Button appBtn = (Button) findViewById(R.id.sign_in);
        appBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MenuAdmin.class);
                startActivity(i);
            }
        });

    }
}
