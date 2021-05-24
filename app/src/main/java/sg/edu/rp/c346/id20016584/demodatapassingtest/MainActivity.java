package sg.edu.rp.c346.id20016584.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPassInteger, btnPassChar;
    TextView tvPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPassInteger=findViewById(R.id.buttonPassInteger);
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("value", 1);
                startActivity(i);
            }
        });
        btnPassChar=findViewById(R.id.buttonPassChar);
        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, ThirdActivity.class);
                i.putExtra("value", 'a');
                startActivity(i);
            }
        });
        tvPassDouble =findViewById(R.id.textViewPassDouble);
        tvPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this, FourthActivity.class);
                i.putExtra("value",99.99);
                startActivity(i);
            }
        });
    }
}