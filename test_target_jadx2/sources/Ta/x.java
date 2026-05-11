package Ta;

import android.os.Build;
import expo.modules.image.records.DecodeFormat;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r2.n;

/* loaded from: classes2.dex */
public final class x extends AbstractC1198c {

    /* renamed from: j, reason: collision with root package name */
    private final DecodeFormat f9657j;

    /* renamed from: k, reason: collision with root package name */
    private final Lazy f9658k;

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9659a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            int i10 = -1;
            if (Build.VERSION.SDK_INT < 29) {
                return -1;
            }
            try {
                Method method = Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE);
                method.setAccessible(true);
                Object invoke = method.invoke(null, "ro.hwui.max_texture_allocation_size", 104857600);
                Intrinsics.e(invoke, "null cannot be cast to non-null type kotlin.Int");
                i10 = kotlin.ranges.d.d(((Integer) invoke).intValue(), 104857600);
            } catch (Throwable unused) {
            }
            return Integer.valueOf(i10);
        }
    }

    public x(DecodeFormat decodeFormat) {
        Intrinsics.checkNotNullParameter(decodeFormat, "decodeFormat");
        this.f9657j = decodeFormat;
        this.f9658k = lc.i.a(a.f9659a);
    }

    private final int c() {
        return ((Number) this.f9658k.getValue()).intValue();
    }

    @Override // r2.n
    public n.g a(int i10, int i11, int i12, int i13) {
        return n.g.MEMORY;
    }

    @Override // r2.n
    public float b(int i10, int i11, int i12, int i13) {
        if (c() <= 0 || i10 * i11 * this.f9657j.toBytes() <= c()) {
            return 1.0f;
        }
        return (float) (((int) Math.floor(Math.sqrt((c() / this.f9657j.toBytes()) / (Math.min(i10, i11) / Math.max(i10, i11))))) / Math.max(i10, i11));
    }

    @Override // Ta.AbstractC1198c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f9657j == ((x) obj).f9657j;
    }

    @Override // Ta.AbstractC1198c
    public int hashCode() {
        return (super.hashCode() * 31) + this.f9657j.hashCode();
    }
}
