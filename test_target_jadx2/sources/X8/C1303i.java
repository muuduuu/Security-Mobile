package X8;

import D7.AbstractC0788l;
import V6.AbstractC1287s;
import android.content.Context;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import o8.C3766c;

/* renamed from: X8.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1303i {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f11790b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static C1303i f11791c;

    /* renamed from: a, reason: collision with root package name */
    private o8.n f11792a;

    private C1303i() {
    }

    public static C1303i c() {
        C1303i c1303i;
        synchronized (f11790b) {
            AbstractC1287s.q(f11791c != null, "MlKitContext has not been initialized");
            c1303i = (C1303i) AbstractC1287s.m(f11791c);
        }
        return c1303i;
    }

    public static C1303i d(Context context) {
        C1303i c1303i;
        synchronized (f11790b) {
            AbstractC1287s.q(f11791c == null, "MlKitContext is already initialized");
            C1303i c1303i2 = new C1303i();
            f11791c = c1303i2;
            Context e10 = e(context);
            o8.n e11 = o8.n.k(AbstractC0788l.f1343a).d(o8.f.c(e10, MlKitComponentDiscoveryService.class).b()).b(C3766c.s(e10, Context.class, new Class[0])).b(C3766c.s(c1303i2, C1303i.class, new Class[0])).e();
            c1303i2.f11792a = e11;
            e11.n(true);
            c1303i = f11791c;
        }
        return c1303i;
    }

    private static Context e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    public Object a(Class cls) {
        AbstractC1287s.q(f11791c == this, "MlKitContext has been deleted");
        AbstractC1287s.m(this.f11792a);
        return this.f11792a.a(cls);
    }

    public Context b() {
        return (Context) a(Context.class);
    }
}
