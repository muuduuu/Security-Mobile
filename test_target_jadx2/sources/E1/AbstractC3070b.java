package e1;

import Jd.V;
import androidx.concurrent.futures.c;
import h8.d;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3070b {

    /* renamed from: e1.b$a */
    static final class a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f32139a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ V f32140b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, V v10) {
            super(1);
            this.f32139a = aVar;
            this.f32140b = v10;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.f32139a.c(this.f32140b.g());
            } else if (th instanceof CancellationException) {
                this.f32139a.d();
            } else {
                this.f32139a.f(th);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f36324a;
        }
    }

    public static final d b(final V v10, final Object obj) {
        Intrinsics.checkNotNullParameter(v10, "<this>");
        d a10 = c.a(new c.InterfaceC0253c() { // from class: e1.a
            @Override // androidx.concurrent.futures.c.InterfaceC0253c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = AbstractC3070b.d(V.this, obj, aVar);
                return d10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(a10, "getFuture { completer ->…      }\n        tag\n    }");
        return a10;
    }

    public static /* synthetic */ d c(V v10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(v10, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(V this_asListenableFuture, Object obj, c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.z(new a(completer, this_asListenableFuture));
        return obj;
    }
}
