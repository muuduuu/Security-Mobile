package Sa;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f8933a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f8934b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f8935c;

    public e(long[] timings, int[] amplitudes, long[] oldSDKPattern) {
        Intrinsics.checkNotNullParameter(timings, "timings");
        Intrinsics.checkNotNullParameter(amplitudes, "amplitudes");
        Intrinsics.checkNotNullParameter(oldSDKPattern, "oldSDKPattern");
        this.f8933a = timings;
        this.f8934b = amplitudes;
        this.f8935c = oldSDKPattern;
    }

    public final int[] a() {
        return this.f8934b;
    }

    public final long[] b() {
        return this.f8935c;
    }

    public final long[] c() {
        return this.f8933a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.b(e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.e(obj, "null cannot be cast to non-null type expo.modules.haptics.arguments.HapticsVibrationType");
        e eVar = (e) obj;
        return Arrays.equals(this.f8933a, eVar.f8933a) && Arrays.equals(this.f8934b, eVar.f8934b) && Arrays.equals(this.f8935c, eVar.f8935c);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.f8933a) * 31) + Arrays.hashCode(this.f8934b)) * 31) + Arrays.hashCode(this.f8935c);
    }

    public String toString() {
        return "HapticsVibrationType(timings=" + Arrays.toString(this.f8933a) + ", amplitudes=" + Arrays.toString(this.f8934b) + ", oldSDKPattern=" + Arrays.toString(this.f8935c) + ")";
    }
}
