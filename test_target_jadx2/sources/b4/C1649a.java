package b4;

import android.util.Log;
import c3.AbstractC1721a;
import d4.InterfaceC2978a;
import f3.AbstractC3142a;
import java.io.Closeable;
import org.conscrypt.BuildConfig;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1649a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3142a.c f18553a;

    /* renamed from: b4.a$a, reason: collision with other inner class name */
    class C0324a implements AbstractC3142a.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2978a f18554a;

        C0324a(InterfaceC2978a interfaceC2978a) {
            this.f18554a = interfaceC2978a;
        }

        @Override // f3.AbstractC3142a.c
        public void a(f3.i iVar, Throwable th) {
            this.f18554a.b(iVar, th);
            Object f10 = iVar.f();
            AbstractC1721a.L("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), f10 != null ? f10.getClass().getName() : "<value is null>", C1649a.d(th));
        }

        @Override // f3.AbstractC3142a.c
        public boolean b() {
            return this.f18554a.a();
        }
    }

    public C1649a(InterfaceC2978a interfaceC2978a) {
        this.f18553a = new C0324a(interfaceC2978a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(Throwable th) {
        return th == null ? BuildConfig.FLAVOR : Log.getStackTraceString(th);
    }

    public AbstractC3142a b(Closeable closeable) {
        return AbstractC3142a.z(closeable, this.f18553a);
    }

    public AbstractC3142a c(Object obj, f3.h hVar) {
        return AbstractC3142a.H(obj, hVar, this.f18553a);
    }
}
