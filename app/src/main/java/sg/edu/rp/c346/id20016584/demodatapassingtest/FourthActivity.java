package sg.edu.rp.c346.id20016584.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAnswers=findViewById(R.id.textView3);
        Intent i=getIntent();
        double dvalue= i.getDoubleExtra("value", 0.0);
        tvAnswers.setText("Double value is "+dvalue);
    }
}