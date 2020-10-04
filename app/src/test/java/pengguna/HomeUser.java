package pengguna;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.dwiromadon.puskes.LoginActivity;
import com.dwiromadon.puskes.R;

public class HomeUser extends AppCompatActivity {

    Button cardMaps, btnPuskesMas, btnHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_user);
        getSupportActionBar().hide();

        cardMaps = (Button) findViewById(R.id.cardMaps);
        btnPuskesMas = (Button) findViewById(R.id.btnPuskesMas);
        btnHistory = (Button) findViewById(R.id.btnHistory);

        cardMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeUser.this, Maps.class);
                startActivity(i);
                finish();
            }
        });

        btnPuskesMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeUser.this, DataPesantrenPengguna.class);
                startActivity(i);
                finish();
            }
        });

        btnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeUser.this, History.class);
                startActivity(i);
                finish();
            }
        });
    }


    @Override
    public void onBackPressed(){
        Intent i = new Intent(HomeUser.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}