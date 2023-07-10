package sg.edu.rp.c326.id22015010.p05_demodatapassing;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import sg.edu.rp.c326.id22015010.p05_demodatapassing.databinding.ActivitySecondBinding;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer2=findViewById(R.id.textView2);
        Intent intentReceived=getIntent();
        char value=intentReceived.getCharExtra("Value",'a');
        tvAnswer2.setText("Character value received is: "+value);
    }
}