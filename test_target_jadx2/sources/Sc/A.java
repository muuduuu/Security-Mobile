package Sc;

import id.C3367b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f8938a = new A();

    /* renamed from: b, reason: collision with root package name */
    public static final id.c f8939b;

    /* renamed from: c, reason: collision with root package name */
    public static final C3367b f8940c;

    /* renamed from: d, reason: collision with root package name */
    private static final C3367b f8941d;

    /* renamed from: e, reason: collision with root package name */
    private static final C3367b f8942e;

    static {
        id.c cVar = new id.c("kotlin.jvm.JvmField");
        f8939b = cVar;
        C3367b m10 = C3367b.m(cVar);
        Intrinsics.checkNotNullExpressionValue(m10, "topLevel(...)");
        f8940c = m10;
        C3367b m11 = C3367b.m(new id.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        Intrinsics.checkNotNullExpressionValue(m11, "topLevel(...)");
        f8941d = m11;
        C3367b e10 = C3367b.e("kotlin/jvm/internal/RepeatableContainer");
        Intrinsics.checkNotNullExpressionValue(e10, "fromString(...)");
        f8942e = e10;
    }

    private A() {
    }

    public static final String b(String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (f(propertyName)) {
            return propertyName;
        }
        return "get" + Ed.a.a(propertyName);
    }

    public static final boolean c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.F(name, "get", false, 2, null) || StringsKt.F(name, "is", false, 2, null);
    }

    public static final boolean d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.F(name, "set", false, 2, null);
    }

    public static final String e(String propertyName) {
        String a10;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set");
        if (f(propertyName)) {
            a10 = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(a10, "substring(...)");
        } else {
            a10 = Ed.a.a(propertyName);
        }
        sb2.append(a10);
        return sb2.toString();
    }

    public static final boolean f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!StringsKt.F(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char charAt = name.charAt(2);
        return Intrinsics.g(97, charAt) > 0 || Intrinsics.g(charAt, 122) > 0;
    }

    public final C3367b a() {
        return f8942e;
    }
}
