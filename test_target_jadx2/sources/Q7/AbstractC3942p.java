package q7;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: q7.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3942p implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC3943q f38815a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC3943q f38816b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC3936j f38817c;

    AbstractC3942p() {
    }

    public static AbstractC3942p c(Object obj, Object obj2) {
        AbstractC3932f.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C3949x.g(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract AbstractC3936j a();

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC3936j values() {
        AbstractC3936j abstractC3936j = this.f38817c;
        if (abstractC3936j != null) {
            return abstractC3936j;
        }
        AbstractC3936j a10 = a();
        this.f38817c = a10;
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

    abstract AbstractC3943q d();

    abstract AbstractC3943q e();

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
    public final AbstractC3943q entrySet() {
        AbstractC3943q abstractC3943q = this.f38815a;
        if (abstractC3943q != null) {
            return abstractC3943q;
        }
        AbstractC3943q d10 = d();
        this.f38815a = d10;
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
        return AbstractC3950y.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC3943q abstractC3943q = this.f38816b;
        if (abstractC3943q != null) {
            return abstractC3943q;
        }
        AbstractC3943q e10 = e();
        this.f38816b = e10;
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
