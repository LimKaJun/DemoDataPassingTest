package sg.edu.rp.c346.id20026955.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnPassInteger;
    Button btnPassCharacter;
    TextView btnPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        btnPassCharacter =findViewById(R.id.buttonPassChar);
        btnPassDouble =findViewById(R.id.textViewDouble);

        //Event handling step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });
        btnPassCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, thirdActivity.class);
                intent.putExtra("value", "a");
                startActivity(intent);
            }
        });
        btnPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, fourthActivity.class);
                intent.putExtra("value", 99.99);
                startActivity(intent);
            }
        });
    }
}