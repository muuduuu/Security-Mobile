package id;

import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    private static final f f34181e = f.r("<root>");

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f34182f = Pattern.compile("\\.");

    /* renamed from: g, reason: collision with root package name */
    private static final Function1 f34183g = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f34184a;

    /* renamed from: b, reason: collision with root package name */
    private transient c f34185b;

    /* renamed from: c, reason: collision with root package name */
    private transient d f34186c;

    /* renamed from: d, reason: collision with root package name */
    private transient f f34187d;

    static class a implements Function1 {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f invoke(String str) {
            return f.n(str);
        }
    }

    d(String str, c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f34184a = str;
        this.f34185b = cVar;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case 18:
                i11 = 2;
                break;
            case 9:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case RequestError.EVENT_TIMEOUT /* 10 */:
                case 11:
                case 12:
                case 13:
                case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case HVError.SSL_CONNECT_ERROR /* 15 */:
                    objArr[0] = "segment";
                    break;
                case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                    objArr[0] = "other";
                    break;
                case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[2] = "startsWith";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case 18:
                throw new IllegalStateException(format);
            case 9:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private void d() {
        int lastIndexOf = this.f34184a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f34187d = f.n(this.f34184a.substring(lastIndexOf + 1));
            this.f34186c = new d(this.f34184a.substring(0, lastIndexOf));
        } else {
            this.f34187d = f.n(this.f34184a);
            this.f34186c = c.f34178c.j();
        }
    }

    public static d m(f fVar) {
        if (fVar == null) {
            a(17);
        }
        return new d(fVar.c(), c.f34178c.j(), fVar);
    }

    public String b() {
        String str = this.f34184a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public d c(f fVar) {
        String str;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            str = fVar.c();
        } else {
            str = this.f34184a + "." + fVar.c();
        }
        return new d(str, this, fVar);
    }

    public boolean e() {
        return this.f34184a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f34184a.equals(((d) obj).f34184a);
    }

    public boolean f() {
        return this.f34185b != null || b().indexOf(60) < 0;
    }

    public d g() {
        d dVar = this.f34186c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        d dVar2 = this.f34186c;
        if (dVar2 == null) {
            a(8);
        }
        return dVar2;
    }

    public List h() {
        List emptyList = e() ? Collections.emptyList() : AbstractC3574i.V(f34182f.split(this.f34184a), f34183g);
        if (emptyList == null) {
            a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f34184a.hashCode();
    }

    public f i() {
        f fVar = this.f34187d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        d();
        f fVar2 = this.f34187d;
        if (fVar2 == null) {
            a(11);
        }
        return fVar2;
    }

    public f j() {
        if (e()) {
            f fVar = f34181e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f i10 = i();
        if (i10 == null) {
            a(13);
        }
        return i10;
    }

    public boolean k(f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int indexOf = this.f34184a.indexOf(46);
        String c10 = fVar.c();
        String str = this.f34184a;
        if (indexOf == -1) {
            indexOf = Math.max(str.length(), c10.length());
        }
        return str.regionMatches(0, c10, 0, indexOf);
    }

    public c l() {
        c cVar = this.f34185b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f34185b = cVar2;
        return cVar2;
    }

    public String toString() {
        String c10 = e() ? f34181e.c() : this.f34184a;
        if (c10 == null) {
            a(18);
        }
        return c10;
    }

    public d(String str) {
        if (str == null) {
            a(2);
        }
        this.f34184a = str;
    }

    private d(String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f34184a = str;
        this.f34186c = dVar;
        this.f34187d = fVar;
    }
}
