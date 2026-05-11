package Kd;

import Jd.C0874b0;
import Jd.X;
import Jd.z0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends d implements X {

    /* renamed from: c, reason: collision with root package name */
    private final Handler f5607c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5608d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5609e;

    /* renamed from: f, reason: collision with root package name */
    private final c f5610f;

    private c(Handler handler, String str, boolean z10) {
        super(null);
        this.f5607c = handler;
        this.f5608d = str;
        this.f5609e = z10;
        this.f5610f = z10 ? this : new c(handler, str, true);
    }

    private final void A0(CoroutineContext coroutineContext, Runnable runnable) {
        z0.c(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C0874b0.b().s(coroutineContext, runnable);
    }

    @Override // Jd.G0
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public c y0() {
        return this.f5610f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f5607c == this.f5607c && cVar.f5609e == this.f5609e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f5607c) ^ (this.f5609e ? 1231 : 1237);
    }

    @Override // Jd.J
    public void s(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f5607c.post(runnable)) {
            return;
        }
        A0(coroutineContext, runnable);
    }

    @Override // Jd.J
    public String toString() {
        String z02 = z0();
        if (z02 != null) {
            return z02;
        }
        String str = this.f5608d;
        if (str == null) {
            str = this.f5607c.toString();
        }
        if (!this.f5609e) {
            return str;
        }
        return str + ".immediate";
    }

    @Override // Jd.J
    public boolean y(CoroutineContext coroutineContext) {
        return (this.f5609e && Intrinsics.b(Looper.myLooper(), this.f5607c.getLooper())) ? false : true;
    }

    public /* synthetic */ c(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}
