package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c1 {
    c1() {
    }

    public static c1 a(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        return new C1448m(size, map, size2, map2, size3, map3, map4);
    }

    public abstract Size b();

    public Size c(int i10) {
        return (Size) d().get(Integer.valueOf(i10));
    }

    public abstract Map d();

    public abstract Size e();

    public abstract Size f();

    public Size g(int i10) {
        return (Size) h().get(Integer.valueOf(i10));
    }

    public abstract Map h();

    public Size i(int i10) {
        return (Size) j().get(Integer.valueOf(i10));
    }

    public abstract Map j();

    public Size k(int i10) {
        return (Size) l().get(Integer.valueOf(i10));
    }

    public abstract Map l();
}
