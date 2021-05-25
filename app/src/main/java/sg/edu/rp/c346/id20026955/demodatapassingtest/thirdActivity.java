package sg.edu.rp.c346.id20026955.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {

    TextView tvAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Step 2
        tvAnswer1 = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'a');
        tvAnswer1.setText("Character value received is: " + value);
    }
}