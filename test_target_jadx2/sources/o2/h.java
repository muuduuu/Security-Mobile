package o2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes.dex */
public class h implements i2.f {

    /* renamed from: b, reason: collision with root package name */
    private final i f37838b;

    /* renamed from: c, reason: collision with root package name */
    private final URL f37839c;

    /* renamed from: d, reason: collision with root package name */
    private final String f37840d;

    /* renamed from: e, reason: collision with root package name */
    private String f37841e;

    /* renamed from: f, reason: collision with root package name */
    private URL f37842f;

    /* renamed from: g, reason: collision with root package name */
    private volatile byte[] f37843g;

    /* renamed from: h, reason: collision with root package name */
    private int f37844h;

    public h(URL url) {
        this(url, i.f37846b);
    }

    private byte[] d() {
        if (this.f37843g == null) {
            this.f37843g = c().getBytes(i2.f.f34129a);
        }
        return this.f37843g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f37841e)) {
            String str = this.f37840d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) D2.k.d(this.f37839c)).toString();
            }
            this.f37841e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f37841e;
    }

    private URL g() {
        if (this.f37842f == null) {
            this.f37842f = new URL(f());
        }
        return this.f37842f;
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f37840d;
        return str != null ? str : ((URL) D2.k.d(this.f37839c)).toString();
    }

    public Map e() {
        return this.f37838b.a();
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return c().equals(hVar.c()) && this.f37838b.equals(hVar.f37838b);
    }

    public String h() {
        return f();
    }

    @Override // i2.f
    public int hashCode() {
        if (this.f37844h == 0) {
            int hashCode = c().hashCode();
            this.f37844h = hashCode;
            this.f37844h = (hashCode * 31) + this.f37838b.hashCode();
        }
        return this.f37844h;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f37846b);
    }

    public h(URL url, i iVar) {
        this.f37839c = (URL) D2.k.d(url);
        this.f37840d = null;
        this.f37838b = (i) D2.k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f37839c = null;
        this.f37840d = D2.k.b(str);
        this.f37838b = (i) D2.k.d(iVar);
    }
}
