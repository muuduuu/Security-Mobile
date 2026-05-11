package r2;

import java.nio.ByteBuffer;

/* renamed from: r2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4010i implements i2.j {

    /* renamed from: a, reason: collision with root package name */
    private final t f39155a;

    public C4010i(t tVar) {
        this.f39155a = tVar;
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
        return this.f39155a.f(byteBuffer, i10, i11, hVar);
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, i2.h hVar) {
        return this.f39155a.q(byteBuffer);
    }
}
