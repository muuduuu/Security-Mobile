package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.u;

/* loaded from: classes2.dex */
class k extends AbstractC2924a {

    /* renamed from: m, reason: collision with root package name */
    private final Object f29601m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC2928e f29602n;

    k(u uVar, x xVar, int i10, int i11, Object obj, String str, InterfaceC2928e interfaceC2928e) {
        super(uVar, null, xVar, i10, i11, 0, null, str, obj, false);
        this.f29601m = new Object();
        this.f29602n = interfaceC2928e;
    }

    @Override // com.squareup.picasso.AbstractC2924a
    void a() {
        super.a();
        this.f29602n = null;
    }

    @Override // com.squareup.picasso.AbstractC2924a
    void b(Bitmap bitmap, u.e eVar) {
        InterfaceC2928e interfaceC2928e = this.f29602n;
        if (interfaceC2928e != null) {
            interfaceC2928e.onSuccess();
        }
    }

    @Override // com.squareup.picasso.AbstractC2924a
    void c(Exception exc) {
        InterfaceC2928e interfaceC2928e = this.f29602n;
        if (interfaceC2928e != null) {
            interfaceC2928e.onError(exc);
        }
    }

    @Override // com.squareup.picasso.AbstractC2924a
    Object k() {
        return this.f29601m;
    }
}
