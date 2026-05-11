package t7;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class S implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient T f42703a;

    /* renamed from: b, reason: collision with root package name */
    private transient T f42704b;

    /* renamed from: c, reason: collision with root package name */
    private transient K f42705c;

    S() {
    }

    public static S c(Object obj, Object obj2) {
        AbstractC4785v.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C4710k0.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract K a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final K values() {
        K k10 = this.f42705c;
        if (k10 != null) {
            return k10;
        }
        K a10 = a();
        this.f42705c = a10;
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

    abstract T d();

    abstract T e();

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
    public final T entrySet() {
        T t10 = this.f42703a;
        if (t10 != null) {
            return t10;
        }
        T d10 = d();
        this.f42703a = d10;
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
        return AbstractC4724m0.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        T t10 = this.f42704b;
        if (t10 != null) {
            return t10;
        }
        T e10 = e();
        this.f42704b = e10;
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
        AbstractC4785v.a(size, "size");
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
