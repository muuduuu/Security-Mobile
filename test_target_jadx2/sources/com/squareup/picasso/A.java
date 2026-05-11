package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.u;
import com.squareup.picasso.z;

/* loaded from: classes2.dex */
class A extends z {

    /* renamed from: a, reason: collision with root package name */
    private final Context f29498a;

    A(Context context) {
        this.f29498a = context;
    }

    private static Bitmap j(Resources resources, int i10, x xVar) {
        BitmapFactory.Options d10 = z.d(xVar);
        if (z.g(d10)) {
            BitmapFactory.decodeResource(resources, i10, d10);
            z.b(xVar.f29670h, xVar.f29671i, d10, xVar);
        }
        return BitmapFactory.decodeResource(resources, i10, d10);
    }

    @Override // com.squareup.picasso.z
    public boolean c(x xVar) {
        if (xVar.f29667e != 0) {
            return true;
        }
        return "android.resource".equals(xVar.f29666d.getScheme());
    }

    @Override // com.squareup.picasso.z
    public z.a f(x xVar, int i10) {
        Resources m10 = G.m(this.f29498a, xVar);
        return new z.a(j(m10, G.l(m10, xVar), xVar), u.e.DISK);
    }
}
