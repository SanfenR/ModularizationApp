package co.sanfen.android.mobuleb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;

import co.sanfen.android.moduleb.R;
import co.sanfen.android.router.RouterConstants;


@Route(path = RouterConstants.MODULEB_MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moduleb_activity_main);
        findViewById(R.id.btn_return).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent();
                b.putExtra("moduleb", "MODULEB_MAIN_ACTIVITY result");
                setResult(100, b);
                finish();
            }
        });
    }
}
