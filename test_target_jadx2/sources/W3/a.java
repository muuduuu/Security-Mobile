package W3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0208a f11355a = new C0208a(null);

    /* renamed from: W3.a$a, reason: collision with other inner class name */
    public static final class C0208a {
        public /* synthetic */ C0208a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0208a() {
        }
    }

    public final void a(int[] frameDurationMs) {
        Intrinsics.checkNotNullParameter(frameDurationMs, "frameDurationMs");
        int length = frameDurationMs.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (frameDurationMs[i10] < 11) {
                frameDurationMs[i10] = 100;
            }
        }
    }

    public final int[] b(int[] frameDurationsMs) {
        Intrinsics.checkNotNullParameter(frameDurationsMs, "frameDurationsMs");
        int[] iArr = new int[frameDurationsMs.length];
        int length = frameDurationsMs.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = i10;
            i10 += frameDurationsMs[i11];
        }
        return iArr;
    }

    public final int c(int[] frameDurationMs) {
        Intrinsics.checkNotNullParameter(frameDurationMs, "frameDurationMs");
        int i10 = 0;
        for (int i11 : frameDurationMs) {
            i10 += i11;
        }
        return i10;
    }
}
