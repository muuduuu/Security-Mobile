package p2;

import com.bumptech.glide.load.data.j;
import o2.h;
import o2.m;
import o2.n;
import o2.o;
import o2.r;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3787a implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final i2.g f38297b = i2.g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    private final m f38298a;

    public C3787a(m mVar) {
        this.f38298a = mVar;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(h hVar, int i10, int i11, i2.h hVar2) {
        m mVar = this.f38298a;
        if (mVar != null) {
            h hVar3 = (h) mVar.a(hVar, 0, 0);
            if (hVar3 == null) {
                this.f38298a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar3;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) hVar2.c(f38297b)).intValue()));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }

    /* renamed from: p2.a$a, reason: collision with other inner class name */
    public static class C0589a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final m f38299a = new m(500);

        @Override // o2.o
        public n e(r rVar) {
            return new C3787a(this.f38299a);
        }

        @Override // o2.o
        public void d() {
        }
    }
}
