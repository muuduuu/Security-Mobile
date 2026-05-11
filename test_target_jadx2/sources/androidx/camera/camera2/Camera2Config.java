package androidx.camera.camera2;

import A.C0696f0;
import A.C0716t;
import A.C0721y;
import A.r;
import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.m1;
import java.util.Set;
import t.C4590w;
import t.F0;
import t.I0;

/* loaded from: classes.dex */
public abstract class Camera2Config {

    public static final class DefaultProvider implements C0721y.b {
        @Override // A.C0721y.b
        public C0721y getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static C0721y c() {
        F.a aVar = new F.a() { // from class: r.a
            @Override // androidx.camera.core.impl.F.a
            public final F a(Context context, P p10, r rVar, long j10) {
                return new C4590w(context, p10, rVar, j10);
            }
        };
        E.a aVar2 = new E.a() { // from class: r.b
            @Override // androidx.camera.core.impl.E.a
            public final E a(Context context, Object obj, Set set) {
                E d10;
                d10 = Camera2Config.d(context, obj, set);
                return d10;
            }
        };
        return new C0721y.a().c(aVar).d(aVar2).g(new m1.c() { // from class: r.c
            @Override // androidx.camera.core.impl.m1.c
            public final m1 a(Context context) {
                m1 e10;
                e10 = Camera2Config.e(context);
                return e10;
            }
        }).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ E d(Context context, Object obj, Set set) {
        try {
            return new F0(context, obj, set);
        } catch (C0716t e10) {
            throw new C0696f0(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m1 e(Context context) {
        return new I0(context);
    }
}
