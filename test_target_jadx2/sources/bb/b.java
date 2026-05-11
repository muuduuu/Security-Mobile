package Bb;

import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptWeakObject;
import expo.modules.kotlin.sharedobjects.SharedObject;
import kotlin.jvm.internal.Intrinsics;
import pb.r;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f559a;

    private /* synthetic */ b(int i10) {
        this.f559a = i10;
    }

    public static final /* synthetic */ b a(int i10) {
        return new b(i10);
    }

    public static boolean c(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).j();
    }

    public static int d(int i10) {
        return Integer.hashCode(i10);
    }

    public static final JavaScriptObject e(int i10, r runtimeContext) {
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        SharedObject g10 = g(i10, runtimeContext);
        if (g10 == null) {
            return null;
        }
        return runtimeContext.i().e(g10);
    }

    public static final SharedObject f(int i10, r runtimeContext) {
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        return runtimeContext.i().f(i10);
    }

    public static final SharedObject g(int i10, r runtimeContext) {
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        return runtimeContext.i().g(i10);
    }

    public static String h(int i10) {
        return "SharedObjectId(value=" + i10 + ")";
    }

    public static final JavaScriptWeakObject i(int i10, r runtimeContext) {
        Intrinsics.checkNotNullParameter(runtimeContext, "runtimeContext");
        SharedObject g10 = g(i10, runtimeContext);
        if (g10 == null) {
            return null;
        }
        return runtimeContext.i().h(g10);
    }

    public boolean equals(Object obj) {
        return c(this.f559a, obj);
    }

    public int hashCode() {
        return d(this.f559a);
    }

    public final /* synthetic */ int j() {
        return this.f559a;
    }

    public String toString() {
        return h(this.f559a);
    }

    public static int b(int i10) {
        return i10;
    }
}
