package be.kdg.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class GridLayoutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
    }

    public void close(View view) {
        finish();
    }
}
