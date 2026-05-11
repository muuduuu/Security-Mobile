package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final b0 f16332c = new b0();

    /* renamed from: d, reason: collision with root package name */
    static boolean f16333d = false;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f16335b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final g0 f16334a = new H();

    private b0() {
    }

    public static b0 a() {
        return f16332c;
    }

    public f0 b(Class cls, f0 f0Var) {
        AbstractC1557y.b(cls, "messageType");
        AbstractC1557y.b(f0Var, "schema");
        return (f0) this.f16335b.putIfAbsent(cls, f0Var);
    }

    public f0 c(Class cls) {
        AbstractC1557y.b(cls, "messageType");
        f0 f0Var = (f0) this.f16335b.get(cls);
        if (f0Var != null) {
            return f0Var;
        }
        f0 a10 = this.f16334a.a(cls);
        f0 b10 = b(cls, a10);
        return b10 != null ? b10 : a10;
    }

    public f0 d(Object obj) {
        return c(obj.getClass());
    }
}
