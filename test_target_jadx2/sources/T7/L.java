package t7;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class L extends r implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Object f42572a;

    /* renamed from: b, reason: collision with root package name */
    final Object f42573b;

    L(Object obj, Object obj2) {
        this.f42572a = obj;
        this.f42573b = obj2;
    }

    @Override // t7.r, java.util.Map.Entry
    public final Object getKey() {
        return this.f42572a;
    }

    @Override // t7.r, java.util.Map.Entry
    public final Object getValue() {
        return this.f42573b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
