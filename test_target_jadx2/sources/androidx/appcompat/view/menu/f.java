package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.c;
import androidx.appcompat.view.menu.j;
import co.hyperverge.hypersnapsdk.utils.AppConstants;
import g.AbstractC3176g;

/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: a, reason: collision with root package name */
    private e f13510a;

    /* renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.c f13511b;

    /* renamed from: c, reason: collision with root package name */
    c f13512c;

    /* renamed from: d, reason: collision with root package name */
    private j.a f13513d;

    public f(e eVar) {
        this.f13510a = eVar;
    }

    public void a() {
        androidx.appcompat.app.c cVar = this.f13511b;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f13510a;
        c.a aVar = new c.a(eVar.u());
        c cVar = new c(aVar.b(), AbstractC3176g.f33211j);
        this.f13512c = cVar;
        cVar.h(this);
        this.f13510a.b(this.f13512c);
        aVar.c(this.f13512c.a(), this);
        View y10 = eVar.y();
        if (y10 != null) {
            aVar.e(y10);
        } else {
            aVar.f(eVar.w()).o(eVar.x());
        }
        aVar.k(this);
        androidx.appcompat.app.c a10 = aVar.a();
        this.f13511b = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f13511b.getWindow().getAttributes();
        attributes.type = AppConstants.PERMISSION_CANCELLED;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f13511b.show();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(e eVar, boolean z10) {
        if (z10 || eVar == this.f13510a) {
            a();
        }
        j.a aVar = this.f13513d;
        if (aVar != null) {
            aVar.c(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d(e eVar) {
        j.a aVar = this.f13513d;
        if (aVar != null) {
            return aVar.d(eVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f13510a.M((g) this.f13512c.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f13512c.c(this.f13510a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f13511b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f13511b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f13510a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f13510a.performShortcut(i10, keyEvent, 0);
    }
}
