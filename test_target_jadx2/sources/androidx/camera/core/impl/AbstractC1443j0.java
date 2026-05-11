package androidx.camera.core.impl;

import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1443j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f14606a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f14607b = new HashMap();

    public static B a(Object obj) {
        B b10;
        synchronized (f14606a) {
            b10 = (B) f14607b.get(obj);
        }
        return b10 == null ? B.f14405a : b10;
    }
}
