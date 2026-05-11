package T6;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2017i;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class B0 extends AbstractC1177i implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    protected volatile boolean f9335b;

    /* renamed from: c, reason: collision with root package name */
    protected final AtomicReference f9336c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f9337d;

    /* renamed from: e, reason: collision with root package name */
    protected final C2017i f9338e;

    B0(InterfaceC1179j interfaceC1179j, C2017i c2017i) {
        super(interfaceC1179j);
        this.f9336c = new AtomicReference(null);
        this.f9337d = new l7.l(Looper.getMainLooper());
        this.f9338e = c2017i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C2010b c2010b, int i10) {
        this.f9336c.set(null);
        m(c2010b, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f9336c.set(null);
        n();
    }

    private static final int p(y0 y0Var) {
        if (y0Var == null) {
            return -1;
        }
        return y0Var.a();
    }

    @Override // T6.AbstractC1177i
    public final void e(int i10, int i11, Intent intent) {
        y0 y0Var = (y0) this.f9336c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int i12 = this.f9338e.i(b());
                if (i12 == 0) {
                    o();
                    return;
                } else {
                    if (y0Var == null) {
                        return;
                    }
                    if (y0Var.b().u() == 18 && i12 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (y0Var != null) {
                l(new C2010b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, y0Var.b().toString()), p(y0Var));
                return;
            }
            return;
        }
        if (y0Var != null) {
            l(y0Var.b(), y0Var.a());
        }
    }

    @Override // T6.AbstractC1177i
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f9336c.set(bundle.getBoolean("resolving_error", false) ? new y0(new C2010b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // T6.AbstractC1177i
    public final void i(Bundle bundle) {
        super.i(bundle);
        y0 y0Var = (y0) this.f9336c.get();
        if (y0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", y0Var.a());
        bundle.putInt("failed_status", y0Var.b().u());
        bundle.putParcelable("failed_resolution", y0Var.b().I());
    }

    @Override // T6.AbstractC1177i
    public void j() {
        super.j();
        this.f9335b = true;
    }

    @Override // T6.AbstractC1177i
    public void k() {
        super.k();
        this.f9335b = false;
    }

    protected abstract void m(C2010b c2010b, int i10);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new C2010b(13, null), p((y0) this.f9336c.get()));
    }

    public final void s(C2010b c2010b, int i10) {
        AtomicReference atomicReference;
        y0 y0Var = new y0(c2010b, i10);
        do {
            atomicReference = this.f9336c;
            if (androidx.camera.view.i.a(atomicReference, null, y0Var)) {
                this.f9337d.post(new A0(this, y0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
