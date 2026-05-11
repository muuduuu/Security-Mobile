package com.facebook.imagepipeline.memory;

import b3.l;
import f3.AbstractC3142a;
import j4.C3492F;
import j4.G;
import j4.z;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final f3.h f20710a;

    /* renamed from: b, reason: collision with root package name */
    final b f20711b;

    class a implements f3.h {
        a() {
        }

        @Override // f3.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr) {
            d.this.b(bArr);
        }
    }

    static class b extends e {
        public b(e3.d dVar, C3492F c3492f, G g10) {
            super(dVar, c3492f, g10);
        }

        @Override // com.facebook.imagepipeline.memory.a
        com.facebook.imagepipeline.memory.b y(int i10) {
            return new h(q(i10), this.f20695c.f35795g, 0);
        }
    }

    public d(e3.d dVar, C3492F c3492f) {
        l.b(Boolean.valueOf(c3492f.f35795g > 0));
        this.f20711b = new b(dVar, c3492f, z.h());
        this.f20710a = new a();
    }

    public AbstractC3142a a(int i10) {
        return AbstractC3142a.C((byte[]) this.f20711b.get(i10), this.f20710a);
    }

    public void b(byte[] bArr) {
        this.f20711b.a(bArr);
    }
}
