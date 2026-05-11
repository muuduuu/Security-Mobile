package H3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f3088a;

    public c(int i10) {
        this.f3088a = i10;
    }

    public final Map a(int i10, int i11, int i12) {
        float c10 = d.c(d.h(d.d(i12, 1), this.f3088a) * b(i10), 0.0f);
        float f10 = i11;
        float g10 = f10 / d.g(c10, f10);
        int i13 = 0;
        IntRange p10 = d.p(0, i11);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d.d(G.d(CollectionsKt.u(p10, 10)), 16));
        for (Object obj : p10) {
            int intValue = ((Number) obj).intValue();
            if (((int) (intValue % g10)) == 0) {
                i13 = intValue;
            }
            linkedHashMap.put(obj, Integer.valueOf(i13));
        }
        return linkedHashMap;
    }

    public final float b(int i10) {
        return i10 / 1000.0f;
    }
}
