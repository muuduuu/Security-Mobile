package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f13323c;

    /* renamed from: d, reason: collision with root package name */
    private ActionBarContextView f13324d;

    /* renamed from: e, reason: collision with root package name */
    private b.a f13325e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference f13326f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13327g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13328h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f13329i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f13323c = context;
        this.f13324d = actionBarContextView;
        this.f13325e = aVar;
        androidx.appcompat.view.menu.e T10 = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f13329i = T10;
        T10.S(this);
        this.f13328h = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f13325e.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f13324d.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f13327g) {
            return;
        }
        this.f13327g = true;
        this.f13325e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f13326f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f13329i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f13324d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f13324d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f13324d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f13325e.c(this, this.f13329i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f13324d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f13324d.setCustomView(view);
        this.f13326f = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f13323c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f13324d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f13323c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f13324d.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f13324d.setTitleOptional(z10);
    }
}
