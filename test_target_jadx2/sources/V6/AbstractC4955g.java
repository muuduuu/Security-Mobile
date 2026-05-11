package v6;

/* renamed from: v6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4955g {

    /* renamed from: v6.g$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static AbstractC4955g a() {
        return new C4950b(a.FATAL_ERROR, -1L);
    }

    public static AbstractC4955g d() {
        return new C4950b(a.INVALID_PAYLOAD, -1L);
    }

    public static AbstractC4955g e(long j10) {
        return new C4950b(a.OK, j10);
    }

    public static AbstractC4955g f() {
        return new C4950b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
