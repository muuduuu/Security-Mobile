package Lb;

import Db.C0792a;
import Db.T;
import Db.U;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import org.conscrypt.BuildConfig;
import q1.AbstractC3901a;
import u5.C4870a;
import wb.q;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"LLb/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Lkotlin/Function1;", "Landroid/net/Uri;", BuildConfig.FLAVOR, "d", "Lkotlin/jvm/functions/Function1;", "onURLReceivedObserver", "e", C4870a.f43493a, "expo-linking_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends AbstractC5139a {

    /* renamed from: f, reason: collision with root package name */
    private static Uri f5741f;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function1 onURLReceivedObserver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static Set f5742g = new LinkedHashSet();

    /* renamed from: Lb.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set a() {
            return a.f5742g;
        }

        public final void b(Uri uri) {
            a.f5741f = uri;
        }

        private Companion() {
        }
    }

    static final class b extends m implements Function0 {

        /* renamed from: Lb.a$b$a, reason: collision with other inner class name */
        static final class C0115a extends m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WeakReference f5745a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0115a(WeakReference weakReference) {
                super(1);
                this.f5745a = weakReference;
            }

            public final void a(Uri uri) {
                a aVar = (a) this.f5745a.get();
                if (aVar != null) {
                    aVar.f("onURLReceived", androidx.core.os.c.b(t.a("url", uri != null ? uri.toString() : null)));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Uri) obj);
                return Unit.f36324a;
            }
        }

        b() {
            super(0);
        }

        public final void a() {
            C0115a c0115a = new C0115a(new WeakReference(a.this));
            a.INSTANCE.a().add(c0115a);
            a.this.onURLReceivedObserver = c0115a;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    static final class c extends m implements Function0 {
        c() {
            super(0);
        }

        public final void a() {
            Set a10 = a.INSTANCE.a();
            kotlin.jvm.internal.a.a(a10).remove(a.this.onURLReceivedObserver);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    public static final class d extends m implements Function1 {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Uri uri = a.f5741f;
            if (uri != null) {
                return uri.toString();
            }
            return null;
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoLinking");
            bVar.d("onURLReceived");
            C0792a[] c0792aArr = new C0792a[0];
            U u10 = U.f1425a;
            T t10 = (T) u10.a().get(C5142C.b(Object.class));
            if (t10 == null) {
                t10 = new T(C5142C.b(Object.class));
                u10.a().put(C5142C.b(Object.class), t10);
            }
            bVar.n().put("getLinkingURL", new q("getLinkingURL", c0792aArr, t10, new d()));
            bVar.e("onURLReceived", new b());
            bVar.g("onURLReceived", new c());
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
