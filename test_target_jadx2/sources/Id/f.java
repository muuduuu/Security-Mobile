package id;

/* loaded from: classes3.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final String f34189a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34190b;

    private f(String str, boolean z10) {
        if (str == null) {
            b(0);
        }
        this.f34189a = str;
        this.f34190b = z10;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static f n(String str) {
        if (str == null) {
            b(9);
        }
        return str.startsWith("<") ? r(str) : o(str);
    }

    public static f o(String str) {
        if (str == null) {
            b(5);
        }
        return new f(str, false);
    }

    public static boolean q(String str) {
        if (str == null) {
            b(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f r(String str) {
        if (str == null) {
            b(8);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String c() {
        String str = this.f34189a;
        if (str == null) {
            b(1);
        }
        return str;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f34189a.compareTo(fVar.f34189a);
    }

    public String e() {
        if (this.f34190b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String c10 = c();
        if (c10 == null) {
            b(2);
        }
        return c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f34190b == fVar.f34190b && this.f34189a.equals(fVar.f34189a);
    }

    public int hashCode() {
        return (this.f34189a.hashCode() * 31) + (this.f34190b ? 1 : 0);
    }

    public boolean p() {
        return this.f34190b;
    }

    public String toString() {
        return this.f34189a;
    }
}
