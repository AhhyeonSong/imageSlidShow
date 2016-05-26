package kr.hs.emirim.thddkgus96.imageslidshow;

import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ViewFlipper flip;
    EditText editTime;
    int time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTime=(EditText)findViewById(R.id.edit_time);
        flip=(ViewFlipper)findViewById(R.id.view_flip);
        Button butStart=(Button)findViewById(R.id.but_start);
        butStart.setOnClickListener(this);
        Button butStop=(Button)findViewById(R.id.but_stop);
        butStop.setOnClickListener(this);

    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.but_start:
                time=(int)(Double.parseDouble(editTime.getText().toString())*1000);
                flip.startFlipping();
                flip.setFlipInterval(time);
                break;
            case R.id.but_stop:
                flip.stopFlipping();
                break;
        }
    }
}
