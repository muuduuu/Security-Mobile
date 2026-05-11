package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.f;
import java.util.Locale;

/* loaded from: classes.dex */
final class d extends f.i {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayoutManager f18024a;

    /* renamed from: b, reason: collision with root package name */
    private f.k f18025b;

    d(LinearLayoutManager linearLayoutManager) {
        this.f18024a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.f.i
    public void a(int i10) {
    }

    @Override // androidx.viewpager2.widget.f.i
    public void b(int i10, float f10, int i11) {
        if (this.f18025b == null) {
            return;
        }
        float f11 = -f10;
        for (int i12 = 0; i12 < this.f18024a.J(); i12++) {
            View I10 = this.f18024a.I(i12);
            if (I10 == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i12), Integer.valueOf(this.f18024a.J())));
            }
            this.f18025b.a(I10, (this.f18024a.h0(I10) - i10) + f11);
        }
    }

    @Override // androidx.viewpager2.widget.f.i
    public void c(int i10) {
    }

    f.k d() {
        return this.f18025b;
    }

    void e(f.k kVar) {
        this.f18025b = kVar;
    }
}
