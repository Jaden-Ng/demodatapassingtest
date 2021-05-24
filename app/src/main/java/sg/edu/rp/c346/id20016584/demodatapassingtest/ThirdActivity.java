package sg.edu.rp.c346.id20016584.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswers=findViewById(R.id.textView2);
        Intent i=getIntent();
        char cvalue=i.getCharExtra("value", 'z');
        tvAnswers.setText("Char value received is: "+ cvalue);
    }
}