package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
abstract class J extends G {

    /* renamed from: h, reason: collision with root package name */
    private static final WeakReference f23291h = new WeakReference(null);

    /* renamed from: g, reason: collision with root package name */
    private WeakReference f23292g;

    J(byte[] bArr) {
        super(bArr);
        this.f23292g = f23291h;
    }

    @Override // com.google.android.gms.common.G
    final byte[] l1() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f23292g.get();
                if (bArr == null) {
                    bArr = n1();
                    this.f23292g = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }

    protected abstract byte[] n1();
}
