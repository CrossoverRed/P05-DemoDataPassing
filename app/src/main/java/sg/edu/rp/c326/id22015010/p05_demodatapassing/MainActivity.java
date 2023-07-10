package sg.edu.rp.c326.id22015010.p05_demodatapassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btnPassInteger;
Button btnPassChar;
TextView textPassDouble;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPassInteger=findViewById(R.id.buttonPassInteger);
        btnPassChar=findViewById(R.id.buttonPassChar);
        textPassDouble=findViewById(R.id.textView3);
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });
        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("Character",'a');
                startActivity(intent);
            }
        });
        textPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("value",99.99);
                startActivity(intent);
            }
        });
    }
}