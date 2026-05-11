package expo.modules.image.records;

import Ta.e;
import Ta.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.h;
import expo.modules.image.records.b;
import k2.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f32675a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32676b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32677c;

    /* renamed from: d, reason: collision with root package name */
    private final double f32678d;

    public a(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f32675a = drawable;
        this.f32676b = drawable.getIntrinsicWidth();
        this.f32677c = drawable.getIntrinsicHeight();
        this.f32678d = 1.0d;
    }

    @Override // expo.modules.image.records.b
    public m createGlideModelProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new e(this.f32675a);
    }

    @Override // expo.modules.image.records.b
    public h createGlideOptions(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        com.bumptech.glide.request.a k10 = ((h) new h().h0(true)).k(j.f36073b);
        Intrinsics.checkNotNullExpressionValue(k10, "diskCacheStrategy(...)");
        return (h) k10;
    }

    @Override // expo.modules.image.records.b
    public int getHeight() {
        return this.f32677c;
    }

    @Override // expo.modules.image.records.b
    public double getPixelCount() {
        return b.a.a(this);
    }

    @Override // expo.modules.image.records.b
    public double getScale() {
        return this.f32678d;
    }

    @Override // expo.modules.image.records.b
    public int getWidth() {
        return this.f32676b;
    }

    @Override // expo.modules.image.records.b
    public boolean usesPlaceholderContentFit() {
        return b.a.b(this);
    }
}
