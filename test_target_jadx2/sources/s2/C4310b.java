package s2;

import D2.k;
import k2.v;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4310b implements v {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f40761a;

    public C4310b(byte[] bArr) {
        this.f40761a = (byte[]) k.d(bArr);
    }

    @Override // k2.v
    public Class a() {
        return byte[].class;
    }

    @Override // k2.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] get() {
        return this.f40761a;
    }

    @Override // k2.v
    public int k() {
        return this.f40761a.length;
    }

    @Override // k2.v
    public void recycle() {
    }
}
