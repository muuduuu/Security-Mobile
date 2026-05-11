package O1;

/* loaded from: classes.dex */
public enum H {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6926a;

        static {
            int[] iArr = new int[H.values().length];
            f6926a = iArr;
            try {
                iArr[H.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6926a[H.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6926a[H.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i10, boolean z10, int i11) {
        int i12 = a.f6926a[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 != 2) {
            return (z10 && i10 < 28) || i11 > 4 || i10 <= 25;
        }
        return true;
    }
}
