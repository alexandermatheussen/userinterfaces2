package be.kdg.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class LinearLayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }

    public void close(View view) {
        finish();
    }
}
