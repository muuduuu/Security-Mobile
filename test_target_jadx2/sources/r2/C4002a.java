package r2;

import android.content.res.Resources;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4002a implements i2.j {

    /* renamed from: a, reason: collision with root package name */
    private final i2.j f39145a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f39146b;

    public C4002a(Resources resources, i2.j jVar) {
        this.f39146b = (Resources) D2.k.d(resources);
        this.f39145a = (i2.j) D2.k.d(jVar);
    }

    @Override // i2.j
    public boolean a(Object obj, i2.h hVar) {
        return this.f39145a.a(obj, hVar);
    }

    @Override // i2.j
    public k2.v b(Object obj, int i10, int i11, i2.h hVar) {
        return C4000A.c(this.f39146b, this.f39145a.b(obj, i10, i11, hVar));
    }
}
