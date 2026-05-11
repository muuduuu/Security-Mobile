package r7;

import java.io.Serializable;

/* renamed from: r7.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4100h0 extends L implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f40036a;

    /* renamed from: b, reason: collision with root package name */
    final Object f40037b;

    C4100h0(Object obj, Object obj2) {
        this.f40036a = obj;
        this.f40037b = obj2;
    }

    @Override // r7.L, java.util.Map.Entry
    public final Object getKey() {
        return this.f40036a;
    }

    @Override // r7.L, java.util.Map.Entry
    public final Object getValue() {
        return this.f40037b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
