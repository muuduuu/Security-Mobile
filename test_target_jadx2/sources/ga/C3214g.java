package ga;

/* renamed from: ga.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3214g {

    /* renamed from: a, reason: collision with root package name */
    public static final C3214g f33640a = new C3214g();

    private C3214g() {
    }

    public final int a(int i10, int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return 0;
                    }
                    if (i10 != 5) {
                        throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
                    }
                }
                return 1;
            }
            if (i11 != 3) {
                throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
            }
            if (i10 == 3) {
                return 2;
            }
            if (i10 == 4) {
                return 0;
            }
            if (i10 != 5) {
                if (i10 != 6) {
                    throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
                }
                return 1;
            }
        } else {
            if (i10 == 3) {
                return 0;
            }
            if (i10 != 5) {
                throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
            }
        }
        return -1;
    }

    public final boolean b(int i10) {
        return i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6;
    }

    public final int c(int i10, int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                if (i10 == -1) {
                    return 5;
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
                    }
                }
                return 4;
            }
            if (i11 != 3) {
                throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
            }
            if (i10 == -1) {
                return 5;
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    return 6;
                }
                if (i10 != 2) {
                    throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
                }
            }
            return 4;
        }
        if (i10 == -1) {
            return 5;
        }
        if (i10 != 0) {
            throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
        }
        return 3;
    }
}
