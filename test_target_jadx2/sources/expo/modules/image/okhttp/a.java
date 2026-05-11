package expo.modules.image.okhttp;

import Td.B;
import Td.F;
import Td.x;
import Za.b;
import com.facebook.react.modules.network.j;
import com.facebook.react.modules.network.l;
import i2.h;
import kotlin.jvm.internal.Intrinsics;
import o2.n;
import o2.o;
import o2.r;

/* loaded from: classes2.dex */
public final class a implements n {

    /* renamed from: a, reason: collision with root package name */
    private final B f32668a;

    /* renamed from: expo.modules.image.okhttp.a$a, reason: collision with other inner class name */
    public static final class C0474a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final B f32669a;

        public C0474a(B commonClient) {
            Intrinsics.checkNotNullParameter(commonClient, "commonClient");
            this.f32669a = commonClient;
        }

        @Override // o2.o
        public void d() {
        }

        @Override // o2.o
        public n e(r multiFactory) {
            Intrinsics.checkNotNullParameter(multiFactory, "multiFactory");
            return new a(this.f32669a);
        }
    }

    public a(B commonClient) {
        Intrinsics.checkNotNullParameter(commonClient, "commonClient");
        this.f32668a = commonClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F f(final b model, x.a chain) {
        Intrinsics.checkNotNullParameter(model, "$model");
        Intrinsics.checkNotNullParameter(chain, "chain");
        F a10 = chain.a(chain.t());
        return a10.t().b(new l(a10.b(), new j() { // from class: Za.d
            @Override // com.facebook.react.modules.network.j
            public final void a(long j10, long j11, boolean z10) {
                expo.modules.image.okhttp.a.g(b.this, j10, j11, z10);
            }
        })).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(b model, long j10, long j11, boolean z10) {
        Intrinsics.checkNotNullParameter(model, "$model");
        Ya.b b10 = model.b();
        if (b10 != null) {
            b10.a(j10, j11, z10);
        }
    }

    @Override // o2.n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public n.a b(final b model, int i10, int i11, h options) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(options, "options");
        return new com.bumptech.glide.integration.okhttp3.a(this.f32668a.A().a(new x() { // from class: Za.c
            @Override // Td.x
            public final F intercept(x.a aVar) {
                F f10;
                f10 = expo.modules.image.okhttp.a.f(b.this, aVar);
                return f10;
            }
        }).c()).b(model.a(), i10, i11, options);
    }

    @Override // o2.n
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return true;
    }
}
