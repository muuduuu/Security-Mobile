package com.bumptech.glide.integration.okhttp3;

import Td.B;
import Td.InterfaceC1229e;
import h2.C3227a;
import o2.h;
import o2.n;
import o2.o;
import o2.r;

/* loaded from: classes.dex */
public class a implements n {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1229e.a f20256a;

    /* renamed from: com.bumptech.glide.integration.okhttp3.a$a, reason: collision with other inner class name */
    public static class C0360a implements o {

        /* renamed from: b, reason: collision with root package name */
        private static volatile InterfaceC1229e.a f20257b;

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC1229e.a f20258a;

        public C0360a() {
            this(a());
        }

        private static InterfaceC1229e.a a() {
            if (f20257b == null) {
                synchronized (C0360a.class) {
                    try {
                        if (f20257b == null) {
                            f20257b = new B();
                        }
                    } finally {
                    }
                }
            }
            return f20257b;
        }

        @Override // o2.o
        public void d() {
        }

        @Override // o2.o
        public n e(r rVar) {
            return new a(this.f20258a);
        }

        public C0360a(InterfaceC1229e.a aVar) {
            this.f20258a = aVar;
        }
    }

    public a(InterfaceC1229e.a aVar) {
        this.f20256a = aVar;
    }

    @Override // o2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a b(h hVar, int i10, int i11, i2.h hVar2) {
        return new n.a(hVar, new C3227a(this.f20256a, hVar));
    }

    @Override // o2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(h hVar) {
        return true;
    }
}
