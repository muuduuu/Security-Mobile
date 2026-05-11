package k0;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3528c {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f35963a;

    public C3528c(int i10, float f10) {
        this.f35963a = new LinkedHashMap(i10, f10, true);
    }

    public final Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f35963a.get(key);
    }

    public final Set b() {
        Set entrySet = this.f35963a.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "map.entries");
        return entrySet;
    }

    public final boolean c() {
        return this.f35963a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f35963a.put(key, value);
    }

    public final Object e(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f35963a.remove(key);
    }
}
