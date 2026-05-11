package d3;

import java.util.Locale;
import java.util.Map;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.t;

/* renamed from: d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2976a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2976a f31199a = new C2976a();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f31200b = G.k(t.a("mkv", "video/x-matroska"), t.a("glb", "model/gltf-binary"));

    private C2976a() {
    }

    private final String a(String str) {
        int c02 = StringsKt.c0(str, '.', 0, false, 6, null);
        if (c02 < 0 || c02 == str.length() - 1) {
            return null;
        }
        String substring = str.substring(c02 + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String b(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        String a10 = f31199a.a(path);
        if (a10 == null) {
            return null;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = a10.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (lowerCase == null) {
            return null;
        }
        String a11 = AbstractC2977b.a(lowerCase);
        return a11 == null ? (String) f31200b.get(lowerCase) : a11;
    }

    public static final boolean c(String str) {
        if (str != null) {
            return StringsKt.F(str, "video/", false, 2, null);
        }
        return false;
    }
}
