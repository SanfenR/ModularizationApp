package co.sanfen.android.modularizationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import co.sanfen.android.library.utils.ToastUtils;
import co.sanfen.android.modulea.ModuleAShapeImpl;
import co.sanfen.android.router.RouterConstants;
import co.sanfen.android.router.RouterUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);
    }

    public void onViewClick(View view) {
        switch (view.getId()) {
            case R.id.btn_jump_mobilea:
                RouterUtils.startActivity(RouterConstants.MODULEA_MAIN_ACTIVITY);
                break;
            case R.id.btn_mobilea_shape:
                ModuleAShapeImpl shape = (ModuleAShapeImpl) RouterUtils.navigation(RouterConstants.MODULEA_SHAPE_IMPL);
                ToastUtils.showToast(MainActivity.this, shape.shape());
                break;
        }
    }
}
