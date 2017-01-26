package justuschickens.comp3717.bcit.ca.joggingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        Button jogButton;
        Button cycleButton;

        jogButton = (Button)findViewById(R.id.jog_button);
        jogButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SelectActivity.this, JogRouteSelect.class));
            }
        });

        cycleButton = (Button)findViewById(R.id.cycle_button);
        cycleButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(SelectActivity.this, BikeRouteSelectActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
