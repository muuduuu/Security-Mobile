package androidx.core.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1485b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16107a;

    /* renamed from: b, reason: collision with root package name */
    private a f16108b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0274b f16109c;

    /* renamed from: androidx.core.view.b$a */
    public interface a {
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0274b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC1485b(Context context) {
        this.f16107a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f16109c = null;
        this.f16108b = null;
    }

    public void h(a aVar) {
        this.f16108b = aVar;
    }

    public abstract void i(InterfaceC0274b interfaceC0274b);
}
