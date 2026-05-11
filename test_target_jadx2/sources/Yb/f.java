package Yb;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private final Context f12171b;

    /* renamed from: c, reason: collision with root package name */
    private String f12172c;

    /* renamed from: d, reason: collision with root package name */
    private final g f12173d;

    /* renamed from: e, reason: collision with root package name */
    private final g f12174e;

    public f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f12171b = context;
        this.f12173d = new g();
        this.f12174e = new g();
    }

    private final void f() {
        if (this.f12172c != null) {
            this.f12171b.unbindService(this);
        }
        this.f12172c = null;
        this.f12173d.b();
        this.f12174e.b();
    }

    private final void i(String str) {
        String str2 = this.f12172c;
        if (str2 != null && !Intrinsics.b(str2, str)) {
            f();
        }
        if (l(str)) {
            return;
        }
        androidx.browser.customtabs.c.a(this.f12171b, str, this);
        this.f12172c = str;
    }

    private final void j() {
        if (this.f12174e.e()) {
            return;
        }
        this.f12173d.c(new Ea.c() { // from class: Yb.e
            @Override // Ea.c
            public final void apply(Object obj) {
                f.k(f.this, (androidx.browser.customtabs.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(f this$0, androidx.browser.customtabs.c client) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(client, "client");
        this$0.f12174e.f(client.e(null));
    }

    private final boolean l(String str) {
        return Intrinsics.b(str, this.f12172c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(Uri uri, androidx.browser.customtabs.f fVar) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        if (fVar != null) {
            fVar.c(uri, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(androidx.browser.customtabs.c client) {
        Intrinsics.checkNotNullParameter(client, "client");
        client.g(0L);
    }

    @Override // androidx.browser.customtabs.e
    public void a(ComponentName componentName, androidx.browser.customtabs.c client) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        Intrinsics.checkNotNullParameter(client, "client");
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        if (l(packageName)) {
            this.f12173d.f(client);
        }
    }

    public final boolean g(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        if (!l(packageName)) {
            return false;
        }
        f();
        return true;
    }

    public final void h() {
        f();
    }

    public final void m(String packageName, final Uri uri) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f12174e.c(new Ea.c() { // from class: Yb.d
            @Override // Ea.c
            public final void apply(Object obj) {
                f.n(uri, (androidx.browser.customtabs.f) obj);
            }
        });
        i(packageName);
        j();
    }

    public final void o(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f12173d.c(new Ea.c() { // from class: Yb.c
            @Override // Ea.c
            public final void apply(Object obj) {
                f.p((androidx.browser.customtabs.c) obj);
            }
        });
        i(packageName);
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        if (l(packageName)) {
            f();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        if (l(packageName)) {
            f();
        }
    }
}
