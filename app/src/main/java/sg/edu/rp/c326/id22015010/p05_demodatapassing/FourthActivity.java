package sg.edu.rp.c326.id22015010.p05_demodatapassing;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswer3=findViewById(R.id.textView4);
        Intent intentReceived=getIntent();
        double value=intentReceived.getDoubleExtra("value",0);
        tvAnswer3.setText("Double value received is: "+value);
    }
}
