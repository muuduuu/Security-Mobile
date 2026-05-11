package R5;

import java.net.InetAddress;
import v5.InterfaceC4942i;

/* loaded from: classes2.dex */
public class p extends G implements P5.i {

    /* renamed from: c, reason: collision with root package name */
    protected final boolean f8506c;

    public p() {
        this(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[RETURN] */
    @Override // P5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public D5.o a(D5.B b10, D5.d dVar) {
        boolean z10;
        InterfaceC4942i.d p10 = p(b10, dVar, c());
        if (p10 != null) {
            InterfaceC4942i.c h10 = p10.h();
            if (h10.isNumeric() || h10 == InterfaceC4942i.c.ARRAY) {
                z10 = true;
                return z10 == this.f8506c ? new p(z10) : this;
            }
        }
        z10 = false;
        if (z10 == this.f8506c) {
        }
    }

    @Override // R5.H, D5.o
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void f(InetAddress inetAddress, com.fasterxml.jackson.core.f fVar, D5.B b10) {
        String trim;
        if (this.f8506c) {
            trim = inetAddress.getHostAddress();
        } else {
            trim = inetAddress.toString().trim();
            int indexOf = trim.indexOf(47);
            if (indexOf >= 0) {
                trim = indexOf == 0 ? trim.substring(1) : trim.substring(0, indexOf);
            }
        }
        fVar.h2(trim);
    }

    @Override // R5.G, D5.o
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void g(InetAddress inetAddress, com.fasterxml.jackson.core.f fVar, D5.B b10, M5.g gVar) {
        B5.b g10 = gVar.g(fVar, gVar.f(inetAddress, InetAddress.class, com.fasterxml.jackson.core.k.VALUE_STRING));
        f(inetAddress, fVar, b10);
        gVar.h(fVar, g10);
    }

    public p(boolean z10) {
        super(InetAddress.class);
        this.f8506c = z10;
    }
}
