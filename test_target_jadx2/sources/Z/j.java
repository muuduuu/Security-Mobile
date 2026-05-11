package z;

import A.C;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.B0;
import androidx.camera.core.impl.G0;
import androidx.camera.core.impl.Q0;
import androidx.camera.core.impl.V;
import z.j;

/* loaded from: classes.dex */
public class j implements Q0 {

    /* renamed from: I, reason: collision with root package name */
    private final V f45595I;

    public static final class a implements C {

        /* renamed from: a, reason: collision with root package name */
        private final B0 f45596a = B0.d0();

        public static a e(final V v10) {
            final a aVar = new a();
            v10.c("camera2.captureRequest.option.", new V.b() { // from class: z.i
                @Override // androidx.camera.core.impl.V.b
                public final boolean a(V.a aVar2) {
                    boolean f10;
                    f10 = j.a.f(j.a.this, v10, aVar2);
                    return f10;
                }
            });
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean f(a aVar, V v10, V.a aVar2) {
            aVar.b().r(aVar2, v10.g(aVar2), v10.a(aVar2));
            return true;
        }

        @Override // A.C
        public A0 b() {
            return this.f45596a;
        }

        public j d() {
            return new j(G0.b0(this.f45596a));
        }
    }

    public j(V v10) {
        this.f45595I = v10;
    }

    @Override // androidx.camera.core.impl.Q0
    public V n() {
        return this.f45595I;
    }
}
