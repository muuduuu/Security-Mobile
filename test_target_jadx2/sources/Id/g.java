package id;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f34191a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final Regex f34192b = new Regex("[^\\p{L}\\p{Digit}]");

    /* renamed from: c, reason: collision with root package name */
    private static final String f34193c = "$context_receiver";

    private g() {
    }

    public static final f a(int i10) {
        f o10 = f.o(f34193c + '_' + i10);
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        return o10;
    }

    public static final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f34192b.replace(name, "_");
    }
}
