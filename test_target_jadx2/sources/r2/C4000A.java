package r2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: r2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4000A implements k2.v, k2.r {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f39113a;

    /* renamed from: b, reason: collision with root package name */
    private final k2.v f39114b;

    private C4000A(Resources resources, k2.v vVar) {
        this.f39113a = (Resources) D2.k.d(resources);
        this.f39114b = (k2.v) D2.k.d(vVar);
    }

    public static k2.v c(Resources resources, k2.v vVar) {
        if (vVar == null) {
            return null;
        }
        return new C4000A(resources, vVar);
    }

    @Override // k2.v
    public Class a() {
        return BitmapDrawable.class;
    }

    @Override // k2.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f39113a, (Bitmap) this.f39114b.get());
    }

    @Override // k2.r
    public void initialize() {
        k2.v vVar = this.f39114b;
        if (vVar instanceof k2.r) {
            ((k2.r) vVar).initialize();
        }
    }

    @Override // k2.v
    public int k() {
        return this.f39114b.k();
    }

    @Override // k2.v
    public void recycle() {
        this.f39114b.recycle();
    }
}
