package com.facebook.react.modules.network;

import Td.E;
import Td.z;
import java.io.OutputStream;
import pe.InterfaceC3878f;
import pe.M;
import pe.Z;

/* loaded from: classes.dex */
class k extends E {

    /* renamed from: a, reason: collision with root package name */
    private final E f21845a;

    /* renamed from: b, reason: collision with root package name */
    private final j f21846b;

    /* renamed from: c, reason: collision with root package name */
    private long f21847c = 0;

    public k(E e10, j jVar) {
        this.f21845a = e10;
        this.f21846b = jVar;
    }

    private Z b(InterfaceC3878f interfaceC3878f) {
        return M.g(new a(interfaceC3878f.X1()));
    }

    @Override // Td.E
    public long contentLength() {
        if (this.f21847c == 0) {
            this.f21847c = this.f21845a.contentLength();
        }
        return this.f21847c;
    }

    @Override // Td.E
    /* renamed from: contentType */
    public z getContentType() {
        return this.f21845a.getContentType();
    }

    @Override // Td.E
    public void writeTo(InterfaceC3878f interfaceC3878f) {
        InterfaceC3878f b10 = M.b(b(interfaceC3878f));
        contentLength();
        this.f21845a.writeTo(b10);
        b10.flush();
    }

    class a extends b {
        a(OutputStream outputStream) {
            super(outputStream);
        }

        private void b() {
            long a10 = a();
            long contentLength = k.this.contentLength();
            k.this.f21846b.a(a10, contentLength, a10 == contentLength);
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            super.write(bArr, i10, i11);
            b();
        }

        @Override // com.facebook.react.modules.network.b, java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) {
            super.write(i10);
            b();
        }
    }
}
