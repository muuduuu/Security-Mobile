package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class d1 {

    /* renamed from: b, reason: collision with root package name */
    private static final d1 f14562b = new d1(new ArrayMap());

    /* renamed from: a, reason: collision with root package name */
    protected final Map f14563a;

    protected d1(Map map) {
        this.f14563a = map;
    }

    public static d1 a(Pair pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new d1(arrayMap);
    }

    public static d1 b() {
        return f14562b;
    }

    public static d1 c(d1 d1Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : d1Var.e()) {
            arrayMap.put(str, d1Var.d(str));
        }
        return new d1(arrayMap);
    }

    public Object d(String str) {
        return this.f14563a.get(str);
    }

    public Set e() {
        return this.f14563a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
