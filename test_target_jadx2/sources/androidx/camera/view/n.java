package androidx.camera.view;

import A.I0;
import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    Size f14864a;

    /* renamed from: b, reason: collision with root package name */
    FrameLayout f14865b;

    /* renamed from: c, reason: collision with root package name */
    private final f f14866c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14867d = false;

    interface a {
        void a();
    }

    n(FrameLayout frameLayout, f fVar) {
        this.f14865b = frameLayout;
        this.f14866c = fVar;
    }

    Bitmap a() {
        Bitmap c10 = c();
        if (c10 == null) {
            return null;
        }
        return this.f14866c.a(c10, new Size(this.f14865b.getWidth(), this.f14865b.getHeight()), this.f14865b.getLayoutDirection());
    }

    abstract View b();

    abstract Bitmap c();

    abstract void d();

    abstract void e();

    void f() {
        this.f14867d = true;
        h();
    }

    abstract void g(I0 i02, a aVar);

    void h() {
        View b10 = b();
        if (b10 == null || !this.f14867d) {
            return;
        }
        this.f14866c.s(new Size(this.f14865b.getWidth(), this.f14865b.getHeight()), this.f14865b.getLayoutDirection(), b10);
    }

    abstract h8.d i();
}
