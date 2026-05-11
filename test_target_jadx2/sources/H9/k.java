package h9;

import X8.C1303i;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import g9.C3205e;
import java.util.concurrent.atomic.AtomicReference;
import t7.C4;
import t7.C4735n4;
import t7.EnumC4707j4;
import t7.EnumC4721l4;
import t7.EnumC4728m4;
import t7.K5;
import t7.M5;
import t7.P3;
import t7.Q3;
import t7.Q5;
import t7.R3;
import t7.S3;
import t7.T3;
import t7.V3;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    static final AtomicReference f34014a = new AtomicReference();

    public static V3 a(C3205e c3205e) {
        P3 p32 = new P3();
        int d10 = c3205e.d();
        p32.d(d10 != 1 ? d10 != 2 ? S3.UNKNOWN_LANDMARKS : S3.ALL_LANDMARKS : S3.NO_LANDMARKS);
        int b10 = c3205e.b();
        p32.a(b10 != 1 ? b10 != 2 ? Q3.UNKNOWN_CLASSIFICATIONS : Q3.ALL_CLASSIFICATIONS : Q3.NO_CLASSIFICATIONS);
        int e10 = c3205e.e();
        p32.f(e10 != 1 ? e10 != 2 ? T3.UNKNOWN_PERFORMANCE : T3.ACCURATE : T3.FAST);
        int c10 = c3205e.c();
        p32.b(c10 != 1 ? c10 != 2 ? R3.UNKNOWN_CONTOURS : R3.ALL_CONTOURS : R3.NO_CONTOURS);
        p32.c(Boolean.valueOf(c3205e.g()));
        p32.e(Float.valueOf(c3205e.a()));
        return p32.k();
    }

    public static String b() {
        return true != d() ? "play-services-mlkit-face-detection" : AppConstants.FACE_DETECTION_FEATURE;
    }

    public static void c(M5 m52, final boolean z10, final EnumC4721l4 enumC4721l4) {
        m52.c(new K5() { // from class: h9.j
            @Override // t7.K5
            public final Q5 zza() {
                boolean z11 = z10;
                EnumC4721l4 enumC4721l42 = enumC4721l4;
                C4735n4 c4735n4 = new C4735n4();
                c4735n4.e(z11 ? EnumC4707j4.TYPE_THICK : EnumC4707j4.TYPE_THIN);
                C4 c42 = new C4();
                c42.b(enumC4721l42);
                c4735n4.h(c42.c());
                return Q5.d(c4735n4);
            }
        }, EnumC4728m4.ON_DEVICE_FACE_LOAD);
    }

    static boolean d() {
        AtomicReference atomicReference = f34014a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean a10 = C3300b.a(C1303i.c().b());
        atomicReference.set(Boolean.valueOf(a10));
        return a10;
    }
}
