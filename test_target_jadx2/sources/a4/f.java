package a4;

import j3.AbstractC3486b;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.C5146G;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f12598e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f12599a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12600b;

    /* renamed from: c, reason: collision with root package name */
    public final float f12601c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12602d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(int i10, int i11, float f10, float f11) {
        this.f12599a = i10;
        this.f12600b = i11;
        this.f12601c = f10;
        this.f12602d = f11;
        if (i10 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i11 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f12599a == fVar.f12599a && this.f12600b == fVar.f12600b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3486b.a(this.f12599a, this.f12600b);
    }

    public String toString() {
        C5146G c5146g = C5146G.f44966a;
        String format = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f12599a), Integer.valueOf(this.f12600b)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }

    public /* synthetic */ f(int i10, int i11, float f10, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? 2048.0f : f10, (i12 & 8) != 0 ? 0.6666667f : f11);
    }
}
