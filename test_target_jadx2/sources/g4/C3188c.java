package g4;

/* renamed from: g4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3188c extends g {

    /* renamed from: d, reason: collision with root package name */
    private T3.e f33531d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33532e;

    public C3188c(T3.e eVar, boolean z10) {
        this.f33531d = eVar;
        this.f33532e = z10;
    }

    @Override // g4.InterfaceC3190e
    public synchronized int M() {
        T3.e eVar;
        eVar = this.f33531d;
        return eVar == null ? 0 : eVar.d().M();
    }

    @Override // g4.AbstractC3186a, g4.InterfaceC3190e
    public boolean Y1() {
        return this.f33532e;
    }

    @Override // g4.InterfaceC3190e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                T3.e eVar = this.f33531d;
                if (eVar == null) {
                    return;
                }
                this.f33531d = null;
                eVar.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g4.InterfaceC3190e, g4.k
    public synchronized int getHeight() {
        T3.e eVar;
        eVar = this.f33531d;
        return eVar == null ? 0 : eVar.d().getHeight();
    }

    @Override // g4.InterfaceC3190e, g4.k
    public synchronized int getWidth() {
        T3.e eVar;
        eVar = this.f33531d;
        return eVar == null ? 0 : eVar.d().getWidth();
    }

    @Override // g4.InterfaceC3190e
    public synchronized boolean isClosed() {
        return this.f33531d == null;
    }

    public synchronized T3.c s() {
        T3.e eVar;
        eVar = this.f33531d;
        return eVar == null ? null : eVar.d();
    }

    public synchronized T3.e t() {
        return this.f33531d;
    }
}
