package y3;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: y3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5170d {

    /* renamed from: a, reason: collision with root package name */
    private int f45179a = -1;

    /* renamed from: b, reason: collision with root package name */
    private boolean f45180b = false;

    /* renamed from: c, reason: collision with root package name */
    private ColorFilter f45181c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f45182d = -1;

    /* renamed from: e, reason: collision with root package name */
    private int f45183e = -1;

    public void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i10 = this.f45179a;
        if (i10 != -1) {
            drawable.setAlpha(i10);
        }
        if (this.f45180b) {
            drawable.setColorFilter(this.f45181c);
        }
        int i11 = this.f45182d;
        if (i11 != -1) {
            drawable.setDither(i11 != 0);
        }
        int i12 = this.f45183e;
        if (i12 != -1) {
            drawable.setFilterBitmap(i12 != 0);
        }
    }

    public void b(int i10) {
        this.f45179a = i10;
    }

    public void c(ColorFilter colorFilter) {
        this.f45181c = colorFilter;
        this.f45180b = colorFilter != null;
    }

    public void d(boolean z10) {
        this.f45182d = z10 ? 1 : 0;
    }

    public void e(boolean z10) {
        this.f45183e = z10 ? 1 : 0;
    }
}
