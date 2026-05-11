package q7;

import V6.C1284o;
import X8.AbstractC1297c;
import X8.C1301g;
import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class N {

    /* renamed from: k, reason: collision with root package name */
    private static final AbstractC3942p f38778k = AbstractC3942p.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f38779a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38780b;

    /* renamed from: c, reason: collision with root package name */
    private final H f38781c;

    /* renamed from: d, reason: collision with root package name */
    private final X8.m f38782d;

    /* renamed from: e, reason: collision with root package name */
    private final Task f38783e;

    /* renamed from: f, reason: collision with root package name */
    private final Task f38784f;

    /* renamed from: g, reason: collision with root package name */
    private final String f38785g;

    /* renamed from: h, reason: collision with root package name */
    private final int f38786h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f38787i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f38788j = new HashMap();

    public N(Context context, final X8.m mVar, H h10, String str) {
        this.f38779a = context.getPackageName();
        this.f38780b = AbstractC1297c.a(context);
        this.f38782d = mVar;
        this.f38781c = h10;
        Y.a();
        this.f38785g = str;
        this.f38783e = C1301g.a().b(new Callable() { // from class: q7.L
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return N.this.a();
            }
        });
        C1301g a10 = C1301g.a();
        mVar.getClass();
        this.f38784f = a10.b(new Callable() { // from class: q7.M
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return X8.m.this.a();
            }
        });
        AbstractC3942p abstractC3942p = f38778k;
        this.f38786h = abstractC3942p.containsKey(str) ? DynamiteModule.b(context, (String) abstractC3942p.get(str)) : -1;
    }

    final /* synthetic */ String a() {
        return C1284o.a().b(this.f38785g);
    }
}
