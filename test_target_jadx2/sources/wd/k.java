package Wd;

import Td.G;
import Td.z;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import lc.AbstractC3622a;
import pe.C3877e;
import pe.InterfaceC3879g;

/* loaded from: classes3.dex */
public abstract class k {

    public static final class a extends G {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z f11586c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f11587d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC3879g f11588e;

        a(z zVar, long j10, InterfaceC3879g interfaceC3879g) {
            this.f11586c = zVar;
            this.f11587d = j10;
            this.f11588e = interfaceC3879g;
        }

        @Override // Td.G
        public long e() {
            return this.f11587d;
        }

        @Override // Td.G
        public z f() {
            return this.f11586c;
        }

        @Override // Td.G
        public InterfaceC3879g j() {
            return this.f11588e;
        }
    }

    public static final G a(InterfaceC3879g interfaceC3879g, z zVar, long j10) {
        Intrinsics.checkNotNullParameter(interfaceC3879g, "<this>");
        return new a(zVar, j10, interfaceC3879g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final byte[] b(G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        long e10 = g10.e();
        if (e10 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + e10);
        }
        InterfaceC3879g j10 = g10.j();
        byte[] th = null;
        try {
            byte[] n02 = j10.n0();
            if (j10 != null) {
                try {
                    j10.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = n02;
        } catch (Throwable th3) {
            th = th3;
            if (j10 != null) {
                try {
                    j10.close();
                } catch (Throwable th4) {
                    AbstractC3622a.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (e10 == -1 || e10 == length) {
            return th;
        }
        throw new IOException("Content-Length (" + e10 + ") and stream length (" + length + ") disagree");
    }

    public static final void c(G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        m.f(g10.j());
    }

    public static final G d(byte[] bArr, z zVar) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return G.f9918b.d(new C3877e().G1(bArr), zVar, bArr.length);
    }
}
