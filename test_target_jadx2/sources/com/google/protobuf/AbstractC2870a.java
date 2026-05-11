package com.google.protobuf;

import com.google.protobuf.N;
import java.io.IOException;

/* renamed from: com.google.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2870a implements N {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0423a implements N.a {
        protected static h0 a(N n10) {
            return new h0(n10);
        }
    }

    private String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    abstract int getSerializedSize(c0 c0Var);

    h0 newUninitializedMessageException() {
        return new h0(this);
    }

    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            AbstractC2879j U10 = AbstractC2879j.U(bArr);
            writeTo(U10);
            U10.c();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(a("byte array"), e10);
        }
    }
}
