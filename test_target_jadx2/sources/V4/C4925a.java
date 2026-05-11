package v4;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4925a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4925a f43918a = new C4925a();

    private C4925a() {
    }

    public static final boolean a() {
        return false;
    }

    public static final Class b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        if (a()) {
            return Class.forName(className);
        }
        return null;
    }
}
