package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.core.view.C1504k0;

/* loaded from: classes.dex */
public interface J {
    void a(Menu menu, j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    void i(a0 a0Var);

    boolean j();

    void k(int i10);

    Menu l();

    void m(int i10);

    int n();

    C1504k0 o(int i10, long j10);

    void p(j.a aVar, e.a aVar2);

    void q(int i10);

    ViewGroup r();

    void s(boolean z10);

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    int t();

    void u();

    void v();

    void w(Drawable drawable);

    void x(boolean z10);
}
