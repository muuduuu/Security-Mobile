package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.u;

/* loaded from: classes2.dex */
class m extends AbstractC2924a {

    /* renamed from: m, reason: collision with root package name */
    InterfaceC2928e f29603m;

    m(u uVar, ImageView imageView, x xVar, int i10, int i11, int i12, Drawable drawable, String str, Object obj, InterfaceC2928e interfaceC2928e, boolean z10) {
        super(uVar, imageView, xVar, i10, i11, i12, drawable, str, obj, z10);
        this.f29603m = interfaceC2928e;
    }

    @Override // com.squareup.picasso.AbstractC2924a
    void a() {
        super.a();
        if (this.f29603m != null) {
            this.f29603m = null;
        }
    }

    @Override // com.squareup.picasso.AbstractC2924a
    public void b(Bitmap bitmap, u.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f29536c.get();
        if (imageView == null) {
            return;
        }
        u uVar = this.f29534a;
        v.c(imageView, uVar.f29628d, bitmap, eVar, this.f29537d, uVar.f29636l);
        InterfaceC2928e interfaceC2928e = this.f29603m;
        if (interfaceC2928e != null) {
            interfaceC2928e.onSuccess();
        }
    }

    @Override // com.squareup.picasso.AbstractC2924a
    public void c(Exception exc) {
        ImageView imageView = (ImageView) this.f29536c.get();
        if (imageView == null) {
            return;
        }
        Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        int i10 = this.f29540g;
        if (i10 != 0) {
            imageView.setImageResource(i10);
        } else {
            Drawable drawable2 = this.f29541h;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
            }
        }
        InterfaceC2928e interfaceC2928e = this.f29603m;
        if (interfaceC2928e != null) {
            interfaceC2928e.onError(exc);
        }
    }
}
