package Ta;

import android.content.Context;

/* loaded from: classes2.dex */
public class p extends com.bumptech.glide.l {
    public p(com.bumptech.glide.c cVar, x2.j jVar, x2.p pVar, Context context) {
        super(cVar, jVar, pVar, context);
    }

    @Override // com.bumptech.glide.l
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public o e(Class cls) {
        return new o(this.f20283a, this, cls, this.f20284b);
    }

    @Override // com.bumptech.glide.l
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public o f() {
        return (o) super.f();
    }

    @Override // com.bumptech.glide.l
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public o g() {
        return (o) super.g();
    }

    @Override // com.bumptech.glide.l
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public o o() {
        return (o) super.o();
    }

    @Override // com.bumptech.glide.l
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public o u(Object obj) {
        return (o) super.u(obj);
    }

    @Override // com.bumptech.glide.l
    protected void z(com.bumptech.glide.request.h hVar) {
        if (hVar instanceof n) {
            super.z(hVar);
        } else {
            super.z(new n().a(hVar));
        }
    }
}
