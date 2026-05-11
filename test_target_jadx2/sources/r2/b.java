package R2;

import Jd.AbstractC0891k;
import Jd.N;
import O2.e;
import Q2.w;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1604v;
import androidx.lifecycle.C1607y;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lc.p;
import o.InterfaceC3735a;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

/* loaded from: classes.dex */
public final class b extends S {

    /* renamed from: b, reason: collision with root package name */
    private final C1607y f8446b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC1604v f8447c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1604v f8448d;

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f8449a;

        a(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f8449a;
            if (i10 == 0) {
                p.b(obj);
                O2.d b10 = e.f7006a.b();
                this.f8449a = 1;
                if (b10.d(this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    /* renamed from: R2.b$b, reason: collision with other inner class name */
    static final class C0163b extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f8450a;

        C0163b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new C0163b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d dVar) {
            return ((C0163b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f8450a;
            if (i10 == 0) {
                p.b(obj);
                O2.b c10 = e.f7006a.c();
                this.f8450a = 1;
                if (c10.f(this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p.b(obj);
            }
            return Unit.f36324a;
        }
    }

    public static final class c implements InterfaceC3735a {
        @Override // o.InterfaceC3735a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC1604v apply(Object obj) {
            String searchQuery = (String) obj;
            O2.b c10 = e.f7006a.c();
            if (searchQuery == null || StringsKt.Z(searchQuery)) {
                return c10.a();
            }
            if (TextUtils.isDigitsOnly(searchQuery)) {
                Intrinsics.checkNotNullExpressionValue(searchQuery, "searchQuery");
                return c10.g(searchQuery, BuildConfig.FLAVOR);
            }
            Intrinsics.checkNotNullExpressionValue(searchQuery, "searchQuery");
            return c10.g(BuildConfig.FLAVOR, searchQuery);
        }
    }

    public b() {
        C1607y c1607y = new C1607y(BuildConfig.FLAVOR);
        this.f8446b = c1607y;
        AbstractC1604v b10 = Q.b(c1607y, new c());
        Intrinsics.checkNotNullExpressionValue(b10, "Transformations.switchMap(this) { transform(it) }");
        this.f8447c = b10;
        this.f8448d = e.f7006a.b().a();
    }

    public final void e() {
        AbstractC0891k.d(T.a(this), null, null, new a(null), 3, null);
    }

    public final void f() {
        AbstractC0891k.d(T.a(this), null, null, new C0163b(null), 3, null);
        w.f8125e.a();
    }

    public final Object g(d dVar) {
        return e.f7006a.c().d(dVar);
    }

    public final AbstractC1604v h() {
        return this.f8448d;
    }

    public final AbstractC1604v i() {
        return this.f8447c;
    }

    public final void j(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f8446b.o(searchQuery);
    }
}
