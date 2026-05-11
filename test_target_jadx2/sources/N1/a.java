package N1;

import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public String f6528a;

    /* renamed from: b, reason: collision with root package name */
    public String f6529b;

    /* renamed from: c, reason: collision with root package name */
    public String f6530c;

    public a(String str, String str2, String str3) {
        this.f6528a = str;
        this.f6529b = str3 == null ? BuildConfig.FLAVOR : str3;
        this.f6530c = str2;
    }

    public String a() {
        return this.f6529b + "/" + b.b(this.f6528a, this.f6530c);
    }
}
