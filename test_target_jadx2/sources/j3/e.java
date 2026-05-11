package j3;

/* loaded from: classes.dex */
public enum e {
    YES,
    NO,
    UNSET;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35752a;

        static {
            int[] iArr = new int[e.values().length];
            f35752a = iArr;
            try {
                iArr[e.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35752a[e.NO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35752a[e.UNSET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static e fromDbValue(int i10) {
        return i10 != 1 ? i10 != 2 ? UNSET : NO : YES;
    }

    public boolean asBoolean() {
        int i10 = a.f35752a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            throw new IllegalStateException("No boolean equivalent for UNSET");
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public Boolean asBooleanObject() {
        int i10 = a.f35752a[ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 == 2) {
            return Boolean.FALSE;
        }
        if (i10 == 3) {
            return null;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }

    public int getDbValue() {
        int i10 = a.f35752a[ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    public boolean isSet() {
        return this != UNSET;
    }

    public static e valueOf(boolean z10) {
        return z10 ? YES : NO;
    }

    public static e valueOf(Boolean bool) {
        return bool != null ? valueOf(bool.booleanValue()) : UNSET;
    }

    public boolean asBoolean(boolean z10) {
        int i10 = a.f35752a[ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new IllegalStateException("Unrecognized TriState value: " + this);
    }
}
