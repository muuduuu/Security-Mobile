package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.AbstractC1520t;
import androidx.lifecycle.Y;
import g.AbstractC3170a;

/* loaded from: classes.dex */
public abstract class s extends androidx.activity.j implements e {

    /* renamed from: d, reason: collision with root package name */
    private g f13272d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC1520t.a f13273e;

    public s(Context context, int i10) {
        super(context, f(context, i10));
        this.f13273e = new AbstractC1520t.a() { // from class: androidx.appcompat.app.r
            @Override // androidx.core.view.AbstractC1520t.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return s.this.g(keyEvent);
            }
        };
        g e10 = e();
        e10.Q(f(context, i10));
        e10.A(null);
    }

    private void c() {
        Y.b(getWindow().getDecorView(), this);
        k1.g.a(getWindow().getDecorView(), this);
        androidx.activity.t.a(getWindow().getDecorView(), this);
    }

    private static int f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC3170a.f33089x, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        e().B();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC1520t.e(this.f13273e, getWindow().getDecorView(), this, keyEvent);
    }

    public g e() {
        if (this.f13272d == null) {
            this.f13272d = g.k(this, this);
        }
        return this.f13272d;
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return e().l(i10);
    }

    boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean h(int i10) {
        return e().J(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        e().w();
    }

    @Override // androidx.activity.j, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        e().v();
        super.onCreate(bundle);
        e().A(bundle);
    }

    @Override // androidx.activity.j, android.app.Dialog
    protected void onStop() {
        super.onStop();
        e().G();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void setContentView(int i10) {
        c();
        e().K(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().R(charSequence);
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void setContentView(View view) {
        c();
        e().L(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        e().R(getContext().getString(i10));
    }

    @Override // androidx.activity.j, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        e().M(view, layoutParams);
    }
}
