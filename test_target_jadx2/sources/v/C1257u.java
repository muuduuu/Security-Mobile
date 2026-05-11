package V;

import android.content.Context;
import java.util.concurrent.Executor;
import y0.InterfaceC5159a;

/* renamed from: V.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257u {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10714a;

    /* renamed from: b, reason: collision with root package name */
    private final O f10715b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1255s f10716c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC5159a f10717d;

    /* renamed from: e, reason: collision with root package name */
    private Executor f10718e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10719f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10720g = false;

    C1257u(Context context, O o10, AbstractC1255s abstractC1255s) {
        this.f10714a = E.f.a(context);
        this.f10715b = o10;
        this.f10716c = abstractC1255s;
    }

    Context a() {
        return this.f10714a;
    }

    InterfaceC5159a b() {
        return this.f10717d;
    }

    Executor c() {
        return this.f10718e;
    }

    AbstractC1255s d() {
        return this.f10716c;
    }

    O e() {
        return this.f10715b;
    }

    boolean f() {
        return this.f10719f;
    }

    boolean g() {
        return this.f10720g;
    }

    public Y h(Executor executor, InterfaceC5159a interfaceC5159a) {
        y0.f.h(executor, "Listener Executor can't be null.");
        y0.f.h(interfaceC5159a, "Event listener can't be null");
        this.f10718e = executor;
        this.f10717d = interfaceC5159a;
        return this.f10715b.D0(this);
    }

    public C1257u i() {
        if (androidx.core.content.e.c(this.f10714a, "android.permission.RECORD_AUDIO") == -1) {
            throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
        }
        y0.f.j(this.f10715b.M(), "The Recorder this recording is associated to doesn't support audio.");
        this.f10719f = true;
        return this;
    }
}
