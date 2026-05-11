package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Map;

/* loaded from: classes.dex */
public class D0 extends d1 {
    private D0(Map map) {
        super(map);
    }

    public static D0 g() {
        return new D0(new ArrayMap());
    }

    public static D0 h(d1 d1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : d1Var.e()) {
            arrayMap.put(str, d1Var.d(str));
        }
        return new D0(arrayMap);
    }

    public void f(d1 d1Var) {
        Map map;
        Map map2 = this.f14563a;
        if (map2 == null || (map = d1Var.f14563a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void i(String str, Object obj) {
        this.f14563a.put(str, obj);
    }
}
