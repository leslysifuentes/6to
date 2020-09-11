package com.example.eva1_5_radio_group;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup rgComida;
    RadioButton rb_sel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rgComida = findViewById(R.id.rgComida);
        rgComida.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        rb_sel = findViewById(checkedId);
        Toast.makeText(this, "" + rb_sel.getText(), Toast.LENGTH_SHORT).show();
    }
}
