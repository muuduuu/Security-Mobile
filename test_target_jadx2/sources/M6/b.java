package m6;

import d6.C2994b;
import d6.d;
import g6.C3194a;
import i2.h;
import i2.j;
import java.nio.ByteBuffer;
import k2.v;
import k6.g;
import n6.AbstractC3709a;
import p6.l;
import p6.m;

/* loaded from: classes2.dex */
public class b implements j {

    class a extends AbstractC3709a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f37393a;

        a(ByteBuffer byteBuffer) {
            this.f37393a = byteBuffer;
        }

        @Override // n6.AbstractC3709a
        public ByteBuffer b() {
            this.f37393a.position(0);
            return this.f37393a;
        }
    }

    /* renamed from: m6.b$b, reason: collision with other inner class name */
    private static class C0558b implements v {

        /* renamed from: a, reason: collision with root package name */
        private final com.github.penfeizhou.animation.decode.b f37395a;

        /* renamed from: b, reason: collision with root package name */
        private final int f37396b;

        C0558b(com.github.penfeizhou.animation.decode.b bVar, int i10) {
            this.f37395a = bVar;
            this.f37396b = i10;
        }

        @Override // k2.v
        public Class a() {
            return com.github.penfeizhou.animation.decode.b.class;
        }

        @Override // k2.v
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.github.penfeizhou.animation.decode.b get() {
            return this.f37395a;
        }

        @Override // k2.v
        public int k() {
            return this.f37396b;
        }

        @Override // k2.v
        public void recycle() {
            this.f37395a.R();
        }
    }

    @Override // i2.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public v b(ByteBuffer byteBuffer, int i10, int i11, h hVar) {
        com.github.penfeizhou.animation.decode.b c3194a;
        a aVar = new a(byteBuffer);
        if (m.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            c3194a = new l(aVar, null);
        } else if (d.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            c3194a = new C2994b(aVar, null);
        } else if (k6.h.b(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
            c3194a = new g(aVar, null);
        } else {
            if (!g6.c.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) {
                return null;
            }
            c3194a = new C3194a(aVar, null);
        }
        return new C0558b(c3194a, byteBuffer.limit());
    }

    @Override // i2.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, h hVar) {
        return (!((Boolean) hVar.c(AbstractC3655a.f37389b)).booleanValue() && m.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) || (!((Boolean) hVar.c(AbstractC3655a.f37390c)).booleanValue() && d.a(new com.github.penfeizhou.animation.io.a(byteBuffer))) || ((!((Boolean) hVar.c(AbstractC3655a.f37388a)).booleanValue() && k6.h.b(new com.github.penfeizhou.animation.io.a(byteBuffer))) || (!((Boolean) hVar.c(AbstractC3655a.f37392e)).booleanValue() && g6.c.a(new com.github.penfeizhou.animation.io.a(byteBuffer))));
    }
}
