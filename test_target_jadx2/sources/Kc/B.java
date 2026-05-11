package Kc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class B {

    /* renamed from: a, reason: collision with root package name */
    private static final F f5530a = new F("InvalidModuleNotifier");

    public static final void a(G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        android.support.v4.media.session.b.a(g10.E0(f5530a));
        throw new A("Accessing invalid module descriptor " + g10);
    }
}
