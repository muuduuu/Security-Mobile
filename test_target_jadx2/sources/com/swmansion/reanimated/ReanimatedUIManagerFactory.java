package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.C1981z0;
import com.facebook.react.uimanager.ReanimatedUIManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.i1;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes2.dex */
public class ReanimatedUIManagerFactory {
    static UIManagerModule create(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i10) {
        i1 i1Var = new i1(list);
        ReanimatedUIManager reanimatedUIManager = new ReanimatedUIManager(reactApplicationContext, list, i10);
        C1981z0 c1981z0 = new C1981z0(reactApplicationContext, i1Var, reanimatedUIManager.getEventDispatcher(), i10);
        Class superclass = ReanimatedUIManager.class.getSuperclass();
        if (superclass == null) {
            Log.e("reanimated", "unable to resolve super class of ReanimatedUIManager");
            return reanimatedUIManager;
        }
        try {
            Field declaredField = superclass.getDeclaredField("mUIImplementation");
            declaredField.setAccessible(true);
            try {
                Field declaredField2 = Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (IllegalAccessException | NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            declaredField.set(reanimatedUIManager, c1981z0);
        } catch (IllegalAccessException | NoSuchFieldException e11) {
            e11.printStackTrace();
        }
        return reanimatedUIManager;
    }
}
