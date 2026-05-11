package V6;

import android.util.Log;

/* renamed from: V6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1279j {

    /* renamed from: a, reason: collision with root package name */
    private final String f10978a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10979b;

    public C1279j(String str) {
        this(str, null);
    }

    private final String g(String str) {
        String str2 = this.f10979b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f10978a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, g(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, g(str2), th);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, g(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            Log.w(str, g(str2));
        }
    }

    public C1279j(String str, String str2) {
        AbstractC1287s.n(str, "log tag cannot be null");
        AbstractC1287s.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f10978a = str;
        this.f10979b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
