package p2;

import android.content.Context;
import android.net.Uri;
import i2.h;
import j2.AbstractC3481b;
import j2.C3482c;
import o2.n;
import o2.o;
import o2.r;

/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3788b implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38300a;

    public C3788b(Context context) {
        this.f38300a = context.getApplicationContext();
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, h hVar) {
        if (AbstractC3481b.e(i10, i11)) {
            return new n.a(new C2.c(uri), C3482c.d(this.f38300a, uri));
        }
        return null;
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return AbstractC3481b.b(uri);
    }

    /* renamed from: p2.b$a */
    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f38301a;

        public a(Context context) {
            this.f38301a = context;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new C3788b(this.f38301a);
        }

        @Override // o2.o
        public void d() {
        }
    }
}
