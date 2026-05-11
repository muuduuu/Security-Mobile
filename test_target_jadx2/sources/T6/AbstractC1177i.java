package T6;

import V6.AbstractC1287s;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: T6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1177i {

    /* renamed from: a, reason: collision with root package name */
    protected final InterfaceC1179j f9437a;

    protected AbstractC1177i(InterfaceC1179j interfaceC1179j) {
        this.f9437a = interfaceC1179j;
    }

    protected static InterfaceC1179j c(C1175h c1175h) {
        if (c1175h.a()) {
            return J0.E(c1175h.d());
        }
        if (c1175h.b()) {
            return G0.a(c1175h.c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static InterfaceC1179j d(Activity activity) {
        return c(new C1175h(activity));
    }

    public Activity b() {
        Activity j10 = this.f9437a.j();
        AbstractC1287s.m(j10);
        return j10;
    }

    public abstract void e(int i10, int i11, Intent intent);

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
