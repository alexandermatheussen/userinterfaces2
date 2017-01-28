package be.kdg.layouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRelativeLayoutActivity(View view) {
        startActivity(new Intent(this, RelativeLayoutActivity.class));
    }

    public void openLinearLayoutActivity(View view) {
        startActivity(new Intent(this, LinearLayoutActivity.class));
    }

    public void openGridLayoutActivity(View view) {
        startActivity(new Intent(this, GridLayoutActivity.class));
    }
}
