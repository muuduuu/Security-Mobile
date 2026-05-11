package c3;

import android.util.Log;
import org.conscrypt.BuildConfig;

/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1722b implements InterfaceC1723c {

    /* renamed from: c, reason: collision with root package name */
    public static final C1722b f19364c = new C1722b();

    /* renamed from: a, reason: collision with root package name */
    private String f19365a = "unknown";

    /* renamed from: b, reason: collision with root package name */
    private int f19366b = 5;

    private C1722b() {
    }

    public static C1722b l() {
        return f19364c;
    }

    private static String m(String str, Throwable th) {
        return str + '\n' + n(th);
    }

    private static String n(Throwable th) {
        return th == null ? BuildConfig.FLAVOR : Log.getStackTraceString(th);
    }

    private String o(String str) {
        if (this.f19365a == null) {
            return str;
        }
        return this.f19365a + ":" + str;
    }

    private void p(int i10, String str, String str2) {
        Log.println(i10, o(str), str2);
    }

    private void q(int i10, String str, String str2, Throwable th) {
        Log.println(i10, o(str), m(str2, th));
    }

    @Override // c3.InterfaceC1723c
    public void a(String str, String str2, Throwable th) {
        q(6, str, str2, th);
    }

    @Override // c3.InterfaceC1723c
    public void b(String str, String str2) {
        p(5, str, str2);
    }

    @Override // c3.InterfaceC1723c
    public void c(String str, String str2, Throwable th) {
        q(5, str, str2, th);
    }

    @Override // c3.InterfaceC1723c
    public void d(String str, String str2) {
        p(6, str, str2);
    }

    @Override // c3.InterfaceC1723c
    public void e(String str, String str2) {
        p(2, str, str2);
    }

    @Override // c3.InterfaceC1723c
    public void f(String str, String str2) {
        p(6, str, str2);
    }

    @Override // c3.InterfaceC1723c
    public void g(String str, String str2, Throwable th) {
        q(6, str, str2, th);
    }

    @Override // c3.InterfaceC1723c
    public void h(String str, String str2) {
        p(3, str, str2);
    }

    @Override // c3.InterfaceC1723c
    public void i(String str, String str2, Throwable th) {
        q(3, str, str2, th);
    }

    @Override // c3.InterfaceC1723c
    public boolean j(int i10) {
        return this.f19366b <= i10;
    }

    @Override // c3.InterfaceC1723c
    public void k(String str, String str2) {
        p(4, str, str2);
    }
}
