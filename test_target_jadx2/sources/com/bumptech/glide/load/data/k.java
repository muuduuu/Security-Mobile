package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.InputStream;
import l2.InterfaceC3600b;
import r2.C;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final C f20333a;

    public static final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC3600b f20334a;

        public a(InterfaceC3600b interfaceC3600b) {
            this.f20334a = interfaceC3600b;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f20334a);
        }
    }

    public k(InputStream inputStream, InterfaceC3600b interfaceC3600b) {
        C c10 = new C(inputStream, interfaceC3600b);
        this.f20333a = c10;
        c10.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f20333a.c();
    }

    public void c() {
        this.f20333a.b();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f20333a.reset();
        return this.f20333a;
    }
}
