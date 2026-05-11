package s7;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class P5 implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient Q5 f41015a;

    /* renamed from: b, reason: collision with root package name */
    private transient Q5 f41016b;

    /* renamed from: c, reason: collision with root package name */
    private transient M4 f41017c;

    P5() {
    }

    public static P5 c(Object obj, Object obj2) {
        AbstractC4393j3.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return X5.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract M4 a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final M4 values() {
        M4 m42 = this.f41017c;
        if (m42 != null) {
            return m42;
        }
        M4 a10 = a();
        this.f41017c = a10;
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

    abstract Q5 d();

    abstract Q5 e();

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
    public final Q5 entrySet() {
        Q5 q52 = this.f41015a;
        if (q52 != null) {
            return q52;
        }
        Q5 d10 = d();
        this.f41015a = d10;
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
        return AbstractC4333b.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        Q5 q52 = this.f41016b;
        if (q52 != null) {
            return q52;
        }
        Q5 e10 = e();
        this.f41016b = e10;
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
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
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
