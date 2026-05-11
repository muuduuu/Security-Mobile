package id;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.List;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f34178c = new c(BuildConfig.FLAVOR);

    /* renamed from: a, reason: collision with root package name */
    private final d f34179a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f34180b;

    public c(String str) {
        if (str == null) {
            a(1);
        }
        this.f34179a = new d(str, this);
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                i11 = 2;
                break;
            case 8:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static c k(f fVar) {
        if (fVar == null) {
            a(14);
        }
        return new c(d.m(fVar));
    }

    public String b() {
        String b10 = this.f34179a.b();
        if (b10 == null) {
            a(4);
        }
        return b10;
    }

    public c c(f fVar) {
        if (fVar == null) {
            a(8);
        }
        return new c(this.f34179a.c(fVar), this);
    }

    public boolean d() {
        return this.f34179a.e();
    }

    public c e() {
        c cVar = this.f34180b;
        if (cVar != null) {
            if (cVar == null) {
                a(6);
            }
            return cVar;
        }
        if (d()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(this.f34179a.g());
        this.f34180b = cVar2;
        return cVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f34179a.equals(((c) obj).f34179a);
    }

    public List f() {
        List h10 = this.f34179a.h();
        if (h10 == null) {
            a(11);
        }
        return h10;
    }

    public f g() {
        f i10 = this.f34179a.i();
        if (i10 == null) {
            a(9);
        }
        return i10;
    }

    public f h() {
        f j10 = this.f34179a.j();
        if (j10 == null) {
            a(10);
        }
        return j10;
    }

    public int hashCode() {
        return this.f34179a.hashCode();
    }

    public boolean i(f fVar) {
        if (fVar == null) {
            a(12);
        }
        return this.f34179a.k(fVar);
    }

    public d j() {
        d dVar = this.f34179a;
        if (dVar == null) {
            a(5);
        }
        return dVar;
    }

    public String toString() {
        return this.f34179a.toString();
    }

    public c(d dVar) {
        if (dVar == null) {
            a(2);
        }
        this.f34179a = dVar;
    }

    private c(d dVar, c cVar) {
        if (dVar == null) {
            a(3);
        }
        this.f34179a = dVar;
        this.f34180b = cVar;
    }
}
