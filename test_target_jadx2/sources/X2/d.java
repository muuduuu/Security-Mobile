package x2;

import android.content.Context;
import x2.b;

/* loaded from: classes.dex */
final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44731a;

    /* renamed from: b, reason: collision with root package name */
    final b.a f44732b;

    d(Context context, b.a aVar) {
        this.f44731a = context.getApplicationContext();
        this.f44732b = aVar;
    }

    private void e() {
        r.a(this.f44731a).d(this.f44732b);
    }

    private void f() {
        r.a(this.f44731a).e(this.f44732b);
    }

    @Override // x2.l
    public void a() {
        f();
    }

    @Override // x2.l
    public void b() {
        e();
    }

    @Override // x2.l
    public void c() {
    }
}
