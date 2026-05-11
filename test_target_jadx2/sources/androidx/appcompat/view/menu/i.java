package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.j;
import androidx.core.view.AbstractC1518s;
import g.AbstractC3173d;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13547a;

    /* renamed from: b, reason: collision with root package name */
    private final e f13548b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13549c;

    /* renamed from: d, reason: collision with root package name */
    private final int f13550d;

    /* renamed from: e, reason: collision with root package name */
    private final int f13551e;

    /* renamed from: f, reason: collision with root package name */
    private View f13552f;

    /* renamed from: g, reason: collision with root package name */
    private int f13553g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13554h;

    /* renamed from: i, reason: collision with root package name */
    private j.a f13555i;

    /* renamed from: j, reason: collision with root package name */
    private h f13556j;

    /* renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f13557k;

    /* renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f13558l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i.this.e();
        }
    }

    public i(Context context, e eVar, View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    private h a() {
        Display defaultDisplay = ((WindowManager) this.f13547a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        h bVar = Math.min(point.x, point.y) >= this.f13547a.getResources().getDimensionPixelSize(AbstractC3173d.f33101a) ? new b(this.f13547a, this.f13552f, this.f13550d, this.f13551e, this.f13549c) : new l(this.f13547a, this.f13548b, this.f13552f, this.f13550d, this.f13551e, this.f13549c);
        bVar.l(this.f13548b);
        bVar.u(this.f13558l);
        bVar.p(this.f13552f);
        bVar.h(this.f13555i);
        bVar.r(this.f13554h);
        bVar.s(this.f13553g);
        return bVar;
    }

    private void l(int i10, int i11, boolean z10, boolean z11) {
        h c10 = c();
        c10.v(z11);
        if (z10) {
            if ((AbstractC1518s.b(this.f13553g, this.f13552f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f13552f.getWidth();
            }
            c10.t(i10);
            c10.w(i11);
            int i12 = (int) ((this.f13547a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c10.q(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        c10.b();
    }

    public void b() {
        if (d()) {
            this.f13556j.dismiss();
        }
    }

    public h c() {
        if (this.f13556j == null) {
            this.f13556j = a();
        }
        return this.f13556j;
    }

    public boolean d() {
        h hVar = this.f13556j;
        return hVar != null && hVar.a();
    }

    protected void e() {
        this.f13556j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f13557k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f13552f = view;
    }

    public void g(boolean z10) {
        this.f13554h = z10;
        h hVar = this.f13556j;
        if (hVar != null) {
            hVar.r(z10);
        }
    }

    public void h(int i10) {
        this.f13553g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f13557k = onDismissListener;
    }

    public void j(j.a aVar) {
        this.f13555i = aVar;
        h hVar = this.f13556j;
        if (hVar != null) {
            hVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f13552f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f13552f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public i(Context context, e eVar, View view, boolean z10, int i10, int i11) {
        this.f13553g = 8388611;
        this.f13558l = new a();
        this.f13547a = context;
        this.f13548b = eVar;
        this.f13552f = view;
        this.f13549c = z10;
        this.f13550d = i10;
        this.f13551e = i11;
    }
}
