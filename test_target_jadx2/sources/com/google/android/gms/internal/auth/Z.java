package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class Z {
    public static U a(U u10) {
        return ((u10 instanceof X) || (u10 instanceof V)) ? u10 : u10 instanceof Serializable ? new V(u10) : new X(u10);
    }

    public static U b(Object obj) {
        return new Y(obj);
    }
}
