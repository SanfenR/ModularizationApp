package co.sanfen.android.modulea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;

import co.sanfen.android.library.utils.ToastUtils;
import co.sanfen.android.router.RouterConstants;
import co.sanfen.android.router.RouterUtils;

@Route(path = RouterConstants.MODULEA_MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity {

    int request_code = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobilea_activity_main);
    }

    public void onViewClick(View view) {
        int i = view.getId();
        if (i == R.id.btn_jump_module2) {
            RouterUtils.startActivityForResult(RouterConstants.MODULEB_MAIN_ACTIVITY, MainActivity.this, request_code);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100 && data != null) {
            String mobileb = data.getStringExtra("moduleb");
            ToastUtils.showToast(this, mobileb);
        }

    }
}
