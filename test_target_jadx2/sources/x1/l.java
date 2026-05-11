package x1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f44701a;

    static {
        String i10 = n.i("InputMerger");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"InputMerger\")");
        f44701a = i10;
    }

    public static final j a(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        try {
            Object newInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
            Intrinsics.e(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (j) newInstance;
        } catch (Exception e10) {
            n.e().d(f44701a, "Trouble instantiating " + className, e10);
            return null;
        }
    }
}
