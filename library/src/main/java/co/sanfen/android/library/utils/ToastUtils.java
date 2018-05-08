package co.sanfen.android.library.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2018/5/8.
 */

public class ToastUtils {
    private static Toast mToast = null;
    public static void showToast(Context context, String s) {
        if (mToast == null) {
            mToast = Toast.makeText(context, s, Toast.LENGTH_SHORT);
        }
        mToast.setText(s);
        mToast.show();
    }
}
