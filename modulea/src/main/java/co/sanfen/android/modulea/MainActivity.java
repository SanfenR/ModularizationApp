package co.sanfen.android.modulea;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import co.sanfen.android.router.RouterConstants;

@Route(path = RouterConstants.MODULEA_MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobilea_activity_main);
    }
}
