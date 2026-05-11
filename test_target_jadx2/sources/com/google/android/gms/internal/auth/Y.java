package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class Y implements Serializable, U {

    /* renamed from: a, reason: collision with root package name */
    final Object f23673a;

    Y(Object obj) {
        this.f23673a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        Object obj2 = this.f23673a;
        Object obj3 = ((Y) obj).f23673a;
        return obj2 == obj3 || obj2.equals(obj3);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23673a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f23673a.toString() + ")";
    }

    @Override // com.google.android.gms.internal.auth.U
    public final Object zza() {
        return this.f23673a;
    }
}
