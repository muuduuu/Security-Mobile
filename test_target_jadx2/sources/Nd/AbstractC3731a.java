package nd;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3731a implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3731a other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int compareTo = c().compareTo(other.c());
        if (compareTo == 0 && !d() && other.d()) {
            return 1;
        }
        return compareTo;
    }

    public abstract EnumC3732b c();

    public abstract boolean d();
}
