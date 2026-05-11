package id;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import org.conscrypt.BuildConfig;

/* renamed from: id.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3367b {

    /* renamed from: a, reason: collision with root package name */
    private final c f34175a;

    /* renamed from: b, reason: collision with root package name */
    private final c f34176b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34177c;

    public C3367b(c cVar, c cVar2, boolean z10) {
        if (cVar == null) {
            a(1);
        }
        if (cVar2 == null) {
            a(2);
        }
        this.f34175a = cVar;
        this.f34176b = cVar2;
        this.f34177c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
                switch (i10) {
                    case 13:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        break;
                    default:
                        i11 = 3;
                        break;
                }
                Object[] objArr = new Object[i11];
                switch (i10) {
                    case 1:
                    case 3:
                        objArr[0] = "packageFqName";
                        break;
                    case 2:
                        objArr[0] = "relativeClassName";
                        break;
                    case 4:
                        objArr[0] = "topLevelName";
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                        break;
                    case 8:
                        objArr[0] = "name";
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        objArr[0] = "segment";
                        break;
                    case 11:
                    case 12:
                        objArr[0] = "string";
                        break;
                    default:
                        objArr[0] = "topLevelFqName";
                        break;
                }
                if (i10 != 5) {
                    objArr[1] = "getPackageFqName";
                } else if (i10 == 6) {
                    objArr[1] = "getRelativeClassName";
                } else if (i10 == 7) {
                    objArr[1] = "getShortClassName";
                } else if (i10 != 9) {
                    switch (i10) {
                        case 13:
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                            objArr[1] = "asString";
                            break;
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            objArr[1] = "asFqNameString";
                            break;
                        default:
                            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                            break;
                    }
                } else {
                    objArr[1] = "asSingleFqName";
                }
                switch (i10) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[2] = "<init>";
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 9:
                    case 13:
                    case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                    case HVError.SSL_CONNECT_ERROR /* 15 */:
                    case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                        break;
                    case 8:
                        objArr[2] = "createNestedClassId";
                        break;
                    case RequestError.EVENT_TIMEOUT /* 10 */:
                        objArr[2] = "startsWith";
                        break;
                    case 11:
                    case 12:
                        objArr[2] = "fromString";
                        break;
                    default:
                        objArr[2] = "topLevel";
                        break;
                }
                String format = String.format(str, objArr);
                if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
                    switch (i10) {
                        case 13:
                        case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                        case HVError.SSL_CONNECT_ERROR /* 15 */:
                        case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i11 = 2;
            Object[] objArr2 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 5) {
            }
            switch (i10) {
            }
            String format2 = String.format(str, objArr2);
            if (i10 != 5) {
                switch (i10) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i10 != 5) {
            switch (i10) {
            }
            Object[] objArr22 = new Object[i11];
            switch (i10) {
            }
            if (i10 != 5) {
            }
            switch (i10) {
            }
            String format22 = String.format(str, objArr22);
            if (i10 != 5) {
            }
            throw new IllegalStateException(format22);
        }
        i11 = 2;
        Object[] objArr222 = new Object[i11];
        switch (i10) {
        }
        if (i10 != 5) {
        }
        switch (i10) {
        }
        String format222 = String.format(str, objArr222);
        if (i10 != 5) {
        }
        throw new IllegalStateException(format222);
    }

    public static C3367b e(String str) {
        if (str == null) {
            a(11);
        }
        return f(str, false);
    }

    public static C3367b f(String str, boolean z10) {
        String str2;
        if (str == null) {
            a(12);
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            str2 = BuildConfig.FLAVOR;
        } else {
            String replace = str.substring(0, lastIndexOf).replace('/', '.');
            str = str.substring(lastIndexOf + 1);
            str2 = replace;
        }
        return new C3367b(new c(str2), new c(str), z10);
    }

    public static C3367b m(c cVar) {
        if (cVar == null) {
            a(0);
        }
        return new C3367b(cVar.e(), cVar.g());
    }

    public c b() {
        if (this.f34175a.d()) {
            c cVar = this.f34176b;
            if (cVar == null) {
                a(9);
            }
            return cVar;
        }
        return new c(this.f34175a.b() + "." + this.f34176b.b());
    }

    public String c() {
        if (this.f34175a.d()) {
            String b10 = this.f34176b.b();
            if (b10 == null) {
                a(13);
            }
            return b10;
        }
        String str = this.f34175a.b().replace('.', '/') + "/" + this.f34176b.b();
        if (str == null) {
            a(14);
        }
        return str;
    }

    public C3367b d(f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new C3367b(h(), this.f34176b.c(fVar), this.f34177c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3367b.class != obj.getClass()) {
            return false;
        }
        C3367b c3367b = (C3367b) obj;
        return this.f34175a.equals(c3367b.f34175a) && this.f34176b.equals(c3367b.f34176b) && this.f34177c == c3367b.f34177c;
    }

    public C3367b g() {
        c e10 = this.f34176b.e();
        if (e10.d()) {
            return null;
        }
        return new C3367b(h(), e10, this.f34177c);
    }

    public c h() {
        c cVar = this.f34175a;
        if (cVar == null) {
            a(5);
        }
        return cVar;
    }

    public int hashCode() {
        return (((this.f34175a.hashCode() * 31) + this.f34176b.hashCode()) * 31) + Boolean.valueOf(this.f34177c).hashCode();
    }

    public c i() {
        c cVar = this.f34176b;
        if (cVar == null) {
            a(6);
        }
        return cVar;
    }

    public f j() {
        f g10 = this.f34176b.g();
        if (g10 == null) {
            a(7);
        }
        return g10;
    }

    public boolean k() {
        return this.f34177c;
    }

    public boolean l() {
        return !this.f34176b.e().d();
    }

    public String toString() {
        if (!this.f34175a.d()) {
            return c();
        }
        return "/" + c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3367b(c cVar, f fVar) {
        this(cVar, c.k(fVar), false);
        if (cVar == null) {
            a(3);
        }
        if (fVar == null) {
            a(4);
        }
    }
}
