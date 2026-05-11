package nc;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
final class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final e f37625a = new e();

    private e() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        return a10.compareTo(b10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return f.f37626a;
    }
}
