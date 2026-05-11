package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.r0;
import androidx.core.app.AbstractC1480b;
import androidx.core.app.D;
import androidx.fragment.app.AbstractActivityC1577t;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import d.InterfaceC2969b;
import k1.d;

/* loaded from: classes.dex */
public abstract class d extends AbstractActivityC1577t implements e, D.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    class a implements d.c {
        a() {
        }

        @Override // k1.d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            d.this.getDelegate().E(bundle);
            return bundle;
        }
    }

    class b implements InterfaceC2969b {
        b() {
        }

        @Override // d.InterfaceC2969b
        public void a(Context context) {
            g delegate = d.this.getDelegate();
            delegate.v();
            delegate.A(d.this.getSavedStateRegistry().b(d.DELEGATE_TAG));
        }
    }

    public d() {
        z();
    }

    private boolean A(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    private void k() {
        Y.b(getWindow().getDecorView(), this);
        Z.a(getWindow().getDecorView(), this);
        k1.g.a(getWindow().getDecorView(), this);
        androidx.activity.t.a(getWindow().getDecorView(), this);
    }

    private void z() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    @Override // androidx.activity.f, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC1397a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1397a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().l(i10);
    }

    public g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = g.j(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC1398b getDrawerToggleDelegate() {
        return getDelegate().p();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().s();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && r0.c()) {
            this.mResources = new r0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC1397a getSupportActionBar() {
        return getDelegate().u();
    }

    @Override // androidx.core.app.D.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.q.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().w();
    }

    @Override // androidx.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().z(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(D d10) {
        d10.e(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().B();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (A(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    protected void onLocalesChanged(androidx.core.os.i iVar) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC1397a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.j() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    protected void onNightModeChanged(int i10) {
    }

    @Override // androidx.activity.f, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().C(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().D();
    }

    public void onPrepareSupportNavigateUpTaskStack(D d10) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().F();
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().G();
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        D j10 = D.j(this);
        onCreateSupportNavigateUpTaskStack(j10);
        onPrepareSupportNavigateUpTaskStack(j10);
        j10.k();
        try {
            AbstractC1480b.q(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().R(charSequence);
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC1397a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.f, android.app.Activity
    public void setContentView(int i10) {
        k();
        getDelegate().K(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().P(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().Q(i10);
    }

    public androidx.appcompat.view.b startSupportActionMode(b.a aVar) {
        return getDelegate().S(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().w();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.q.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().J(i10);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.q.f(this, intent);
    }

    @Override // androidx.activity.f, android.app.Activity
    public void setContentView(View view) {
        k();
        getDelegate().L(view);
    }

    @Override // androidx.activity.f, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k();
        getDelegate().M(view, layoutParams);
    }
}
