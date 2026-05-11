package Q7;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final View f8279a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8280b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f8281c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f8279a = (View) aVar;
    }

    private void a() {
        ViewParent parent = this.f8279a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).g(this.f8279a);
        }
    }

    public int b() {
        return this.f8281c;
    }

    public boolean c() {
        return this.f8280b;
    }

    public void d(Bundle bundle) {
        this.f8280b = bundle.getBoolean("expanded", false);
        this.f8281c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f8280b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f8280b);
        bundle.putInt("expandedComponentIdHint", this.f8281c);
        return bundle;
    }

    public void f(int i10) {
        this.f8281c = i10;
    }
}
