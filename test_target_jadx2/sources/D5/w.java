package D5;

import java.io.Serializable;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class w implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final w f1295d = new w(BuildConfig.FLAVOR, null);

    /* renamed from: e, reason: collision with root package name */
    public static final w f1296e = new w(new String(BuildConfig.FLAVOR), null);

    /* renamed from: a, reason: collision with root package name */
    protected final String f1297a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f1298b;

    /* renamed from: c, reason: collision with root package name */
    protected com.fasterxml.jackson.core.n f1299c;

    public w(String str) {
        this(str, null);
    }

    public static w a(String str) {
        return (str == null || str.isEmpty()) ? f1295d : new w(C5.f.f909b.a(str), null);
    }

    public static w b(String str, String str2) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return (str2 == null && str.isEmpty()) ? f1295d : new w(C5.f.f909b.a(str), str2);
    }

    public String c() {
        return this.f1297a;
    }

    public boolean d() {
        return this.f1298b != null;
    }

    public boolean e() {
        return !this.f1297a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        w wVar = (w) obj;
        String str = this.f1297a;
        if (str == null) {
            if (wVar.f1297a != null) {
                return false;
            }
        } else if (!str.equals(wVar.f1297a)) {
            return false;
        }
        String str2 = this.f1298b;
        return str2 == null ? wVar.f1298b == null : str2.equals(wVar.f1298b);
    }

    public boolean f(String str) {
        return this.f1297a.equals(str);
    }

    public boolean g() {
        return this.f1298b == null && this.f1297a.isEmpty();
    }

    public com.fasterxml.jackson.core.n h(F5.l lVar) {
        com.fasterxml.jackson.core.n nVar = this.f1299c;
        if (nVar == null) {
            nVar = lVar == null ? new y5.h(this.f1297a) : lVar.d(this.f1297a);
            this.f1299c = nVar;
        }
        return nVar;
    }

    public int hashCode() {
        String str = this.f1298b;
        return str == null ? this.f1297a.hashCode() : str.hashCode() ^ this.f1297a.hashCode();
    }

    public String toString() {
        if (this.f1298b == null) {
            return this.f1297a;
        }
        return "{" + this.f1298b + "}" + this.f1297a;
    }

    public w(String str, String str2) {
        this.f1297a = T5.f.R(str);
        this.f1298b = str2;
    }
}
