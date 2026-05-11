package Q5;

import D5.B;
import K5.C0922c;
import v5.p;

/* loaded from: classes2.dex */
public class a extends P5.s {

    /* renamed from: t, reason: collision with root package name */
    protected final String f8172t;

    protected a(String str, K5.s sVar, T5.a aVar, D5.j jVar) {
        this(str, sVar, aVar, jVar, sVar.c());
    }

    public static a E(String str, K5.s sVar, T5.a aVar, D5.j jVar) {
        return new a(str, sVar, aVar, jVar);
    }

    @Override // P5.s
    protected Object C(Object obj, com.fasterxml.jackson.core.f fVar, B b10) {
        return b10.K(this.f8172t);
    }

    @Override // P5.s
    public P5.s D(F5.l lVar, C0922c c0922c, K5.s sVar, D5.j jVar) {
        throw new IllegalStateException("Should not be called on this type");
    }

    protected a(String str, K5.s sVar, T5.a aVar, D5.j jVar, p.b bVar) {
        super(sVar, aVar, jVar, null, null, null, bVar, null);
        this.f8172t = str;
    }
}
