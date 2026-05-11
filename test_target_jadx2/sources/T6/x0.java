package T6;

import S6.h;
import V6.AbstractC1287s;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.C2010b;
import com.google.android.gms.common.C2017i;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes2.dex */
public final class x0 extends B0 {

    /* renamed from: f, reason: collision with root package name */
    private final SparseArray f9491f;

    private x0(InterfaceC1179j interfaceC1179j) {
        super(interfaceC1179j, C2017i.q());
        this.f9491f = new SparseArray();
        this.f9437a.t("AutoManageHelper", this);
    }

    public static x0 t(C1175h c1175h) {
        InterfaceC1179j c10 = AbstractC1177i.c(c1175h);
        x0 x0Var = (x0) c10.h("AutoManageHelper", x0.class);
        return x0Var != null ? x0Var : new x0(c10);
    }

    private final w0 w(int i10) {
        if (this.f9491f.size() <= i10) {
            return null;
        }
        SparseArray sparseArray = this.f9491f;
        return (w0) sparseArray.get(sparseArray.keyAt(i10));
    }

    @Override // T6.AbstractC1177i
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i10 = 0; i10 < this.f9491f.size(); i10++) {
            w0 w10 = w(i10);
            if (w10 != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(w10.f9486f);
                printWriter.println(":");
                w10.f9487g.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // T6.B0, T6.AbstractC1177i
    public final void j() {
        super.j();
        SparseArray sparseArray = this.f9491f;
        Log.d("AutoManageHelper", "onStart " + this.f9335b + " " + String.valueOf(sparseArray));
        if (this.f9336c.get() == null) {
            for (int i10 = 0; i10 < this.f9491f.size(); i10++) {
                w0 w10 = w(i10);
                if (w10 != null) {
                    w10.f9487g.d();
                }
            }
        }
    }

    @Override // T6.B0, T6.AbstractC1177i
    public final void k() {
        super.k();
        for (int i10 = 0; i10 < this.f9491f.size(); i10++) {
            w0 w10 = w(i10);
            if (w10 != null) {
                w10.f9487g.e();
            }
        }
    }

    @Override // T6.B0
    protected final void m(C2010b c2010b, int i10) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i10 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        w0 w0Var = (w0) this.f9491f.get(i10);
        if (w0Var != null) {
            v(i10);
            h.c cVar = w0Var.f9488h;
            if (cVar != null) {
                cVar.onConnectionFailed(c2010b);
            }
        }
    }

    @Override // T6.B0
    protected final void n() {
        for (int i10 = 0; i10 < this.f9491f.size(); i10++) {
            w0 w10 = w(i10);
            if (w10 != null) {
                w10.f9487g.d();
            }
        }
    }

    public final void u(int i10, S6.h hVar, h.c cVar) {
        AbstractC1287s.n(hVar, "GoogleApiClient instance cannot be null");
        AbstractC1287s.q(this.f9491f.indexOfKey(i10) < 0, "Already managing a GoogleApiClient with id " + i10);
        y0 y0Var = (y0) this.f9336c.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i10 + " " + this.f9335b + " " + String.valueOf(y0Var));
        w0 w0Var = new w0(this, i10, hVar, cVar);
        hVar.o(w0Var);
        this.f9491f.put(i10, w0Var);
        if (this.f9335b && y0Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(hVar.toString()));
            hVar.d();
        }
    }

    public final void v(int i10) {
        w0 w0Var = (w0) this.f9491f.get(i10);
        this.f9491f.remove(i10);
        if (w0Var != null) {
            w0Var.f9487g.p(w0Var);
            w0Var.f9487g.e();
        }
    }
}
