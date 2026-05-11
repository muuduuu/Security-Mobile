package l3;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3605b implements e {
    @Override // l3.e
    public void b(InterfaceC3606c interfaceC3606c) {
        boolean a10 = interfaceC3606c.a();
        try {
            f(interfaceC3606c);
        } finally {
            if (a10) {
                interfaceC3606c.close();
            }
        }
    }

    @Override // l3.e
    public void c(InterfaceC3606c interfaceC3606c) {
        try {
            e(interfaceC3606c);
        } finally {
            interfaceC3606c.close();
        }
    }

    protected abstract void e(InterfaceC3606c interfaceC3606c);

    protected abstract void f(InterfaceC3606c interfaceC3606c);

    @Override // l3.e
    public void a(InterfaceC3606c interfaceC3606c) {
    }

    @Override // l3.e
    public void d(InterfaceC3606c interfaceC3606c) {
    }
}
