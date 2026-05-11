package v2;

import D2.k;
import android.content.Context;
import android.graphics.Bitmap;
import i2.l;
import java.security.MessageDigest;
import k2.v;
import r2.C4008g;

/* renamed from: v2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4916f implements l {

    /* renamed from: b, reason: collision with root package name */
    private final l f43833b;

    public C4916f(l lVar) {
        this.f43833b = (l) k.d(lVar);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        this.f43833b.a(messageDigest);
    }

    @Override // i2.l
    public v b(Context context, v vVar, int i10, int i11) {
        C4913c c4913c = (C4913c) vVar.get();
        v c4008g = new C4008g(c4913c.e(), com.bumptech.glide.c.d(context).g());
        v b10 = this.f43833b.b(context, c4008g, i10, i11);
        if (!c4008g.equals(b10)) {
            c4008g.recycle();
        }
        c4913c.m(this.f43833b, (Bitmap) b10.get());
        return vVar;
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof C4916f) {
            return this.f43833b.equals(((C4916f) obj).f43833b);
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return this.f43833b.hashCode();
    }
}
