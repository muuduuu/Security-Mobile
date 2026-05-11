package pd;

import id.C3367b;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f38600a;

    /* renamed from: b, reason: collision with root package name */
    private id.c f38601b;

    private d(String str) {
        if (str == null) {
            a(5);
        }
        this.f38600a = str;
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i10 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i10 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static d b(C3367b c3367b) {
        if (c3367b == null) {
            a(1);
        }
        id.c h10 = c3367b.h();
        String replace = c3367b.i().b().replace('.', '$');
        if (h10.d()) {
            return new d(replace);
        }
        return new d(h10.b().replace('.', '/') + "/" + replace);
    }

    public static d c(id.c cVar) {
        if (cVar == null) {
            a(2);
        }
        d dVar = new d(cVar.b().replace('.', '/'));
        dVar.f38601b = cVar;
        return dVar;
    }

    public static d d(String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    public id.c e() {
        return new id.c(this.f38600a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f38600a.equals(((d) obj).f38600a);
    }

    public String f() {
        String str = this.f38600a;
        if (str == null) {
            a(8);
        }
        return str;
    }

    public id.c g() {
        int lastIndexOf = this.f38600a.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new id.c(this.f38600a.substring(0, lastIndexOf).replace('/', '.'));
        }
        id.c cVar = id.c.f34178c;
        if (cVar == null) {
            a(7);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f38600a.hashCode();
    }

    public String toString() {
        return this.f38600a;
    }
}
