package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.u;

/* loaded from: classes2.dex */
final class E extends AbstractC2924a {
    E(u uVar, D d10, x xVar, int i10, int i11, Drawable drawable, String str, Object obj, int i12) {
        super(uVar, d10, xVar, i10, i11, i12, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.AbstractC2924a
    void b(Bitmap bitmap, u.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        D d10 = (D) k();
        if (d10 != null) {
            d10.onBitmapLoaded(bitmap, eVar);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.AbstractC2924a
    void c(Exception exc) {
        D d10 = (D) k();
        if (d10 != null) {
            if (this.f29540g != 0) {
                d10.onBitmapFailed(exc, this.f29534a.f29628d.getResources().getDrawable(this.f29540g));
            } else {
                d10.onBitmapFailed(exc, this.f29541h);
            }
        }
    }
}
