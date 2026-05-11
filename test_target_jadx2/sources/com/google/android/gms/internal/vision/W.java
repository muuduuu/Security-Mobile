package com.google.android.gms.internal.vision;

/* loaded from: classes2.dex */
public abstract class W implements InterfaceC2618w1 {
    protected abstract W d(X x10);

    public abstract W h(byte[] bArr, int i10, int i11, A0 a02);

    @Override // com.google.android.gms.internal.vision.InterfaceC2618w1
    public final /* synthetic */ InterfaceC2618w1 o1(InterfaceC2609t1 interfaceC2609t1) {
        if (v().getClass().isInstance(interfaceC2609t1)) {
            return d((X) interfaceC2609t1);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
