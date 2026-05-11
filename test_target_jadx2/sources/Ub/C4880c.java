package ub;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.UnexpectedException;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import pb.n;
import q1.AbstractC3901a;
import wb.f;
import xb.AbstractC5139a;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lub/c;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ub.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4880c extends AbstractC5139a {

    /* renamed from: ub.c$a */
    static final class a extends m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            NativeModulesProxy nativeModulesProxy;
            WeakReference s10 = C4880c.this.a().s();
            Map<String, Object> constants = (s10 == null || (nativeModulesProxy = (NativeModulesProxy) s10.get()) == null) ? null : nativeModulesProxy.getConstants();
            return constants == null ? G.h() : constants;
        }
    }

    /* renamed from: ub.c$b */
    public static final class b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43612a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: ub.c$c, reason: collision with other inner class name */
    public static final class C0626c extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0626c f43613a = new C0626c();

        public C0626c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: ub.c$d */
    public static final class d extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f43614a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(ReadableArray.class);
        }
    }

    /* renamed from: ub.c$e */
    public static final class e extends m implements Function2 {
        public e() {
            super(2);
        }

        public final void a(Object[] objArr, pb.m promise) {
            NativeModulesProxy nativeModulesProxy;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            ReadableArray readableArray = (ReadableArray) objArr[2];
            String str = (String) obj2;
            String str2 = (String) obj;
            Promise a10 = n.a(promise);
            WeakReference s10 = C4880c.this.a().s();
            if (s10 == null || (nativeModulesProxy = (NativeModulesProxy) s10.get()) == null) {
                throw new UnexpectedException("The legacy modules proxy holder has been lost");
            }
            Intrinsics.d(nativeModulesProxy);
            nativeModulesProxy.callMethod(str2, str, readableArray, a10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("NativeModulesProxy");
            bVar.b(new a());
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(String.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(String.class), false, b.f43612a));
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(String.class), false, C0626c.f43613a));
            }
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(ReadableArray.class), bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new M(C5142C.b(ReadableArray.class), false, d.f43614a));
            }
            bVar.k().put("callMethod", new f("callMethod", new C0792a[]{c0792a, c0792a2, c0792a3}, new e()));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
