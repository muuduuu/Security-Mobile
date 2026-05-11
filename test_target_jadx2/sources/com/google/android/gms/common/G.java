package com.google.android.gms.common;

import V6.AbstractC1287s;
import V6.E0;
import V6.F0;
import android.os.RemoteException;
import android.util.Log;
import e7.BinderC3090b;
import e7.InterfaceC3089a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class G extends E0 {

    /* renamed from: f, reason: collision with root package name */
    private final int f23285f;

    protected G(byte[] bArr) {
        AbstractC1287s.a(bArr.length == 25);
        this.f23285f = Arrays.hashCode(bArr);
    }

    protected static byte[] m1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC3089a f10;
        if (!(obj instanceof F0)) {
            return false;
        }
        try {
            F0 f02 = (F0) obj;
            if (f02.g() == this.f23285f && (f10 = f02.f()) != null) {
                return Arrays.equals(l1(), (byte[]) BinderC3090b.l1(f10));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    @Override // V6.F0
    public final InterfaceC3089a f() {
        return BinderC3090b.m1(l1());
    }

    @Override // V6.F0
    public final int g() {
        return this.f23285f;
    }

    public final int hashCode() {
        return this.f23285f;
    }

    abstract byte[] l1();
}
