package ob;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import pb.m;
import q1.AbstractC3901a;
import wb.h;
import wb.i;
import wb.j;
import wb.k;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lob/f;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "LFa/b;", "j", "()LFa/b;", "keepAwakeManager", "expo-keep-awake_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends AbstractC5139a {

    static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f38040a;

        a(m mVar) {
            this.f38040a = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f38040a.b(true);
        }
    }

    static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f38041a;

        b(m mVar) {
            this.f38041a = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f38041a.b(true);
        }
    }

    public static final class c extends xc.m implements Function1 {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(f.this.j().a());
        }
    }

    public static final class d extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f38043a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class e extends xc.m implements Function2 {
        public e() {
            super(2);
        }

        public final void a(Object[] objArr, m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            try {
                f.this.j().d((String) objArr[0], new a(promise));
            } catch (Da.c unused) {
                promise.h(new C3773a());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: ob.f$f, reason: collision with other inner class name */
    public static final class C0582f extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0582f f38045a = new C0582f();

        public C0582f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class g extends xc.m implements Function2 {
        public g() {
            super(2);
        }

        public final void a(Object[] objArr, m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            try {
                f.this.j().b((String) objArr[0], new b(promise));
            } catch (Da.c unused) {
                promise.h(new C3774b());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (m) obj2);
            return Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Fa.b j() {
        Object obj;
        try {
            obj = a().r().b(Fa.b.class);
        } catch (Exception unused) {
            obj = null;
        }
        Fa.b bVar = (Fa.b) obj;
        if (bVar != null) {
            return bVar;
        }
        throw new ob.g("KeepAwakeManager");
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoKeepAwake");
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(String.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(String.class), false, d.f38043a));
            }
            bVar.k().put("activate", new wb.f("activate", new C0792a[]{c0792a}, new e()));
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(String.class), false, C0582f.f38045a));
            }
            bVar.k().put("deactivate", new wb.f("deactivate", new C0792a[]{c0792a2}, new g()));
            C0792a[] c0792aArr = new C0792a[0];
            c cVar = new c();
            bVar.k().put("isActivated", Intrinsics.b(Boolean.class, Integer.TYPE) ? new k("isActivated", c0792aArr, cVar) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new h("isActivated", c0792aArr, cVar) : Intrinsics.b(Boolean.class, Double.TYPE) ? new i("isActivated", c0792aArr, cVar) : Intrinsics.b(Boolean.class, Float.TYPE) ? new j("isActivated", c0792aArr, cVar) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("isActivated", c0792aArr, cVar) : new wb.e("isActivated", c0792aArr, cVar));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
