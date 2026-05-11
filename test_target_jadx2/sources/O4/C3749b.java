package o4;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import xc.C5146G;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3749b {

    /* renamed from: a, reason: collision with root package name */
    private final int f37922a;

    public C3749b(int i10) {
        this.f37922a = i10;
    }

    public final int a() {
        return this.f37922a;
    }

    public String toString() {
        C5146G c5146g = C5146G.f44966a;
        String format = String.format(null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f37922a)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }
}
