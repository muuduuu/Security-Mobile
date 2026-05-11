package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.u;
import com.squareup.picasso.z;
import java.io.InputStream;
import pe.M;

/* renamed from: com.squareup.picasso.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2930g extends z {

    /* renamed from: a, reason: collision with root package name */
    final Context f29577a;

    C2930g(Context context) {
        this.f29577a = context;
    }

    @Override // com.squareup.picasso.z
    public boolean c(x xVar) {
        return "content".equals(xVar.f29666d.getScheme());
    }

    @Override // com.squareup.picasso.z
    public z.a f(x xVar, int i10) {
        return new z.a(M.k(j(xVar)), u.e.DISK);
    }

    InputStream j(x xVar) {
        return this.f29577a.getContentResolver().openInputStream(xVar.f29666d);
    }
}
