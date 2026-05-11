package p2;

import android.content.Context;
import android.net.Uri;
import i2.h;
import j2.AbstractC3481b;
import j2.C3482c;
import o2.n;
import o2.o;
import o2.r;
import r2.I;

/* renamed from: p2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3789c implements n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f38302a;

    public C3789c(Context context) {
        this.f38302a = context.getApplicationContext();
    }

    private boolean e(h hVar) {
        Long l10 = (Long) hVar.c(I.f39134d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(Uri uri, int i10, int i11, h hVar) {
        if (AbstractC3481b.e(i10, i11) && e(hVar)) {
            return new n.a(new C2.c(uri), C3482c.g(this.f38302a, uri));
        }
        return null;
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return AbstractC3481b.d(uri);
    }

    /* renamed from: p2.c$a */
    public static class a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final Context f38303a;

        public a(Context context) {
            this.f38303a = context;
        }

        @Override // o2.o
        public n e(r rVar) {
            return new C3789c(this.f38303a);
        }

        @Override // o2.o
        public void d() {
        }
    }
}
