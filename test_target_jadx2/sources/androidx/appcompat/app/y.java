package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.i;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.J;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l0;
import androidx.core.view.AbstractC1484a0;
import java.util.ArrayList;

/* loaded from: classes.dex */
class y extends AbstractC1397a {

    /* renamed from: a, reason: collision with root package name */
    final J f13295a;

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f13296b;

    /* renamed from: c, reason: collision with root package name */
    final i.g f13297c;

    /* renamed from: d, reason: collision with root package name */
    boolean f13298d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13299e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13300f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f13301g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f13302h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final Toolbar.h f13303i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y.this.z();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return y.this.f13296b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements j.a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f13306a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (this.f13306a) {
                return;
            }
            this.f13306a = true;
            y.this.f13295a.h();
            y.this.f13296b.onPanelClosed(108, eVar);
            this.f13306a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            y.this.f13296b.onMenuOpened(108, eVar);
            return true;
        }
    }

    private final class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (y.this.f13295a.b()) {
                y.this.f13296b.onPanelClosed(108, eVar);
            } else if (y.this.f13296b.onPreparePanel(0, null, eVar)) {
                y.this.f13296b.onMenuOpened(108, eVar);
            }
        }
    }

    private class e implements i.g {
        e() {
        }

        @Override // androidx.appcompat.app.i.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            y yVar = y.this;
            if (yVar.f13298d) {
                return false;
            }
            yVar.f13295a.c();
            y.this.f13298d = true;
            return false;
        }

        @Override // androidx.appcompat.app.i.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(y.this.f13295a.getContext());
            }
            return null;
        }
    }

    y(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f13303i = bVar;
        y0.f.g(toolbar);
        l0 l0Var = new l0(toolbar, false);
        this.f13295a = l0Var;
        this.f13296b = (Window.Callback) y0.f.g(callback);
        l0Var.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        l0Var.setWindowTitle(charSequence);
        this.f13297c = new e();
    }

    private Menu y() {
        if (!this.f13299e) {
            this.f13295a.p(new c(), new d());
            this.f13299e = true;
        }
        return this.f13295a.l();
    }

    public void A(int i10, int i11) {
        this.f13295a.k((i10 & i11) | ((~i11) & this.f13295a.t()));
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public boolean g() {
        return this.f13295a.f();
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public boolean h() {
        if (!this.f13295a.j()) {
            return false;
        }
        this.f13295a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void i(boolean z10) {
        if (z10 == this.f13300f) {
            return;
        }
        this.f13300f = z10;
        if (this.f13301g.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f13301g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public int j() {
        return this.f13295a.t();
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public Context k() {
        return this.f13295a.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public boolean l() {
        this.f13295a.r().removeCallbacks(this.f13302h);
        AbstractC1484a0.i0(this.f13295a.r(), this.f13302h);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    void n() {
        this.f13295a.r().removeCallbacks(this.f13302h);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu y10 = y();
        if (y10 == null) {
            return false;
        }
        y10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return y10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public boolean q() {
        return this.f13295a.g();
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void r(boolean z10) {
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void s(boolean z10) {
        A(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void t(Drawable drawable) {
        this.f13295a.w(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void u(boolean z10) {
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void v(CharSequence charSequence) {
        this.f13295a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1397a
    public void w(CharSequence charSequence) {
        this.f13295a.setWindowTitle(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void z() {
        Menu y10 = y();
        androidx.appcompat.view.menu.e eVar = y10 instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) y10 : null;
        if (eVar != null) {
            eVar.e0();
        }
        try {
            y10.clear();
            if (this.f13296b.onCreatePanelMenu(0, y10)) {
                if (!this.f13296b.onPreparePanel(0, null, y10)) {
                }
                if (eVar == null) {
                    eVar.d0();
                    return;
                }
                return;
            }
            y10.clear();
            if (eVar == null) {
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.d0();
            }
            throw th;
        }
    }
}
