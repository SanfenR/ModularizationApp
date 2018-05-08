package co.sanfen.android.router;

import android.app.Activity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author MZ
 * @email sanfenruxi1@163.com
 * @date 2018/5/8.
 */

public class RouterUtils {
    public static Object navigation(String path) {
        // 构建标准的路由请求
        return  ARouter.getInstance().build(path).navigation();
    }


    public static Object startActivity(String path) {
        // 构建标准的路由请求
        return  ARouter.getInstance().build(path).navigation();
    }

    public static Object startActivity(String path, Bundle bundle) {
        // 构建标准的路由请求
        return  ARouter.getInstance()
                .build(path)
                .with(bundle)
                .navigation();
    }

    public static void startActivityForResult(String path, Activity c, int requestCode) {
        ARouter.getInstance().build(path).navigation(c, requestCode);
    }
}
