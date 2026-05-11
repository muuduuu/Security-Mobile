package be;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f19058a = new f();

    private f() {
    }

    public static final boolean a(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.b(method, "POST") || Intrinsics.b(method, "PATCH") || Intrinsics.b(method, "PUT") || Intrinsics.b(method, "DELETE") || Intrinsics.b(method, "MOVE");
    }

    public static final boolean b(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.b(method, "GET") || Intrinsics.b(method, "HEAD")) ? false : true;
    }

    public static final boolean e(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.b(method, "POST") || Intrinsics.b(method, "PUT") || Intrinsics.b(method, "PATCH") || Intrinsics.b(method, "PROPPATCH") || Intrinsics.b(method, "REPORT");
    }

    public final boolean c(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.b(method, "PROPFIND");
    }

    public final boolean d(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.b(method, "PROPFIND");
    }
}
