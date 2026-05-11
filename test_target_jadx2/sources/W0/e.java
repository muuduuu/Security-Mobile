package w0;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f44235a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44236b;

    /* renamed from: c, reason: collision with root package name */
    private final String f44237c;

    /* renamed from: d, reason: collision with root package name */
    private final List f44238d;

    /* renamed from: e, reason: collision with root package name */
    private final int f44239e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final String f44240f;

    public e(String str, String str2, String str3, List list) {
        this.f44235a = (String) y0.f.g(str);
        this.f44236b = (String) y0.f.g(str2);
        this.f44237c = (String) y0.f.g(str3);
        this.f44238d = (List) y0.f.g(list);
        this.f44240f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f44238d;
    }

    public int c() {
        return this.f44239e;
    }

    String d() {
        return this.f44240f;
    }

    public String e() {
        return this.f44235a;
    }

    public String f() {
        return this.f44236b;
    }

    public String g() {
        return this.f44237c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f44235a + ", mProviderPackage: " + this.f44236b + ", mQuery: " + this.f44237c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f44238d.size(); i10++) {
            sb2.append(" [");
            List list = (List) this.f44238d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString((byte[]) list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f44239e);
        return sb2.toString();
    }
}
