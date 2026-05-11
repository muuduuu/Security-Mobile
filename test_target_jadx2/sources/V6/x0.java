package V6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
final class x0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y0 f11035a;

    /* synthetic */ x0(y0 y0Var, byte[] bArr) {
        Objects.requireNonNull(y0Var);
        this.f11035a = y0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            y0 y0Var = this.f11035a;
            synchronized (y0Var.h()) {
                try {
                    v0 v0Var = (v0) message.obj;
                    w0 w0Var = (w0) y0Var.h().get(v0Var);
                    if (w0Var != null && w0Var.g()) {
                        if (w0Var.d()) {
                            w0Var.a("GmsClientSupervisor");
                        }
                        y0Var.h().remove(v0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        y0 y0Var2 = this.f11035a;
        synchronized (y0Var2.h()) {
            try {
                v0 v0Var2 = (v0) message.obj;
                w0 w0Var2 = (w0) y0Var2.h().get(v0Var2);
                if (w0Var2 != null && w0Var2.e() == 3) {
                    String valueOf = String.valueOf(v0Var2);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                    sb2.append("Timeout waiting for ServiceConnection callback ");
                    sb2.append(valueOf);
                    Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                    ComponentName i11 = w0Var2.i();
                    if (i11 == null) {
                        i11 = v0Var2.c();
                    }
                    if (i11 == null) {
                        String b10 = v0Var2.b();
                        AbstractC1287s.m(b10);
                        i11 = new ComponentName(b10, "unknown");
                    }
                    w0Var2.onServiceDisconnected(i11);
                }
            } finally {
            }
        }
        return true;
    }
}
