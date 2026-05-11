package Od;

/* renamed from: Od.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1084l {
    public static final void a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    public static final Jd.J b(Jd.J j10, String str) {
        return str != null ? new v(j10, str) : j10;
    }
}
