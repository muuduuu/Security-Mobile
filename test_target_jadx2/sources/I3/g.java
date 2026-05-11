package I3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.D;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f4293a;

    public g(int i10) {
        this.f4293a = i10;
    }

    public final int a(int i10) {
        int i11 = i10 % this.f4293a;
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : i11 + this.f4293a;
    }

    public final int b() {
        return this.f4293a;
    }

    public final boolean c(int i10, int i11, int i12) {
        int a10 = a(i12 + i10);
        if (i10 < a10) {
            if (i10 <= i11 && i11 <= a10) {
                return true;
            }
        } else {
            if (i10 <= i11 && i11 <= this.f4293a) {
                return true;
            }
            if (i11 >= 0 && i11 <= a10) {
                return true;
            }
        }
        return false;
    }

    public final List d(int i10, int i11) {
        IntRange p10 = kotlin.ranges.d.p(0, i11);
        ArrayList arrayList = new ArrayList(CollectionsKt.u(p10, 10));
        Iterator it = p10.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(a(((D) it).a() + i10)));
        }
        return arrayList;
    }
}
