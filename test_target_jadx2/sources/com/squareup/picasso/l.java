package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.u;
import com.squareup.picasso.z;
import pe.M;

/* loaded from: classes2.dex */
class l extends C2930g {
    l(Context context) {
        super(context);
    }

    static int k(Uri uri) {
        return new androidx.exifinterface.media.a(uri.getPath()).i("Orientation", 1);
    }

    @Override // com.squareup.picasso.C2930g, com.squareup.picasso.z
    public boolean c(x xVar) {
        return "file".equals(xVar.f29666d.getScheme());
    }

    @Override // com.squareup.picasso.C2930g, com.squareup.picasso.z
    public z.a f(x xVar, int i10) {
        return new z.a(null, M.k(j(xVar)), u.e.DISK, k(xVar.f29666d));
    }
}
