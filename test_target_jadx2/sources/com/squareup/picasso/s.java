package com.squareup.picasso;

import Td.C1228d;
import Td.D;
import android.net.NetworkInfo;
import com.squareup.picasso.u;
import com.squareup.picasso.z;
import java.io.IOException;

/* loaded from: classes2.dex */
class s extends z {

    /* renamed from: a, reason: collision with root package name */
    private final j f29616a;

    /* renamed from: b, reason: collision with root package name */
    private final B f29617b;

    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        final int f29618a;

        /* renamed from: b, reason: collision with root package name */
        final int f29619b;

        b(int i10, int i11) {
            super("HTTP " + i10);
            this.f29618a = i10;
            this.f29619b = i11;
        }
    }

    s(j jVar, B b10) {
        this.f29616a = jVar;
        this.f29617b = b10;
    }

    private static Td.D j(x xVar, int i10) {
        C1228d c1228d;
        if (i10 == 0) {
            c1228d = null;
        } else if (r.isOfflineOnly(i10)) {
            c1228d = C1228d.f9976p;
        } else {
            C1228d.a aVar = new C1228d.a();
            if (!r.shouldReadFromDiskCache(i10)) {
                aVar.l();
            }
            if (!r.shouldWriteToDiskCache(i10)) {
                aVar.m();
            }
            c1228d = aVar.a();
        }
        D.a x10 = new D.a().x(xVar.f29666d.toString());
        if (c1228d != null) {
            x10.c(c1228d);
        }
        return x10.b();
    }

    @Override // com.squareup.picasso.z
    public boolean c(x xVar) {
        String scheme = xVar.f29666d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.z
    int e() {
        return 2;
    }

    @Override // com.squareup.picasso.z
    public z.a f(x xVar, int i10) {
        Td.F a10 = this.f29616a.a(j(xVar, i10));
        Td.G b10 = a10.b();
        if (!a10.isSuccessful()) {
            b10.close();
            throw new b(a10.f(), xVar.f29665c);
        }
        u.e eVar = a10.d() == null ? u.e.NETWORK : u.e.DISK;
        if (eVar == u.e.DISK && b10.e() == 0) {
            b10.close();
            throw new a("Received response with 0 content-length header.");
        }
        if (eVar == u.e.NETWORK && b10.e() > 0) {
            this.f29617b.f(b10.e());
        }
        return new z.a(b10.j(), eVar);
    }

    @Override // com.squareup.picasso.z
    boolean h(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.z
    boolean i() {
        return true;
    }
}
