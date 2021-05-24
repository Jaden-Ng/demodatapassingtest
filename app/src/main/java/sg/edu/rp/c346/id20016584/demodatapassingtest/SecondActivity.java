package sg.edu.rp.c346.id20016584.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvAnswers=findViewById(R.id.textView);
        Intent i=getIntent();
        int value= i.getIntExtra("value", 0);
        tvAnswers.setText("Integer value received is: "+ value);
    }
}