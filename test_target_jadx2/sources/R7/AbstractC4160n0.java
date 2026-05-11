package r7;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: r7.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4160n0 implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC4170o0 f40148a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC4170o0 f40149b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC4090g0 f40150c;

    AbstractC4160n0() {
    }

    public static AbstractC4160n0 c(Object obj, Object obj2) {
        Q.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return F0.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract AbstractC4090g0 a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC4090g0 values() {
        AbstractC4090g0 abstractC4090g0 = this.f40150c;
        if (abstractC4090g0 != null) {
            return abstractC4090g0;
        }
        AbstractC4090g0 a10 = a();
        this.f40150c = a10;
        return a10;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC4170o0 d();

    abstract AbstractC4170o0 e();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC4170o0 entrySet() {
        AbstractC4170o0 abstractC4170o0 = this.f40148a;
        if (abstractC4170o0 != null) {
            return abstractC4170o0;
        }
        AbstractC4170o0 d10 = d();
        this.f40148a = d10;
        return d10;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return H0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC4170o0 abstractC4170o0 = this.f40149b;
        if (abstractC4170o0 != null) {
            return abstractC4170o0;
        }
        AbstractC4170o0 e10 = e();
        this.f40149b = e10;
        return e10;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        Q.a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
