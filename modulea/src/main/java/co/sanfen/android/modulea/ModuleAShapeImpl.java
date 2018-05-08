package co.sanfen.android.modulea;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;

import co.sanfen.android.router.RouterConstants;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2018/5/8.
 */

@Route(path = RouterConstants.MODULEA_SHAPE_IMPL)
public class ModuleAShapeImpl implements IProvider {
    private static final String TAG = "ModuleAServiceImpl";


    public String shape() {
        return TAG + " shape!";
    }

    @Override
    public void init(Context context) {
        Log.d(TAG,"init=" + context);
    }
}
