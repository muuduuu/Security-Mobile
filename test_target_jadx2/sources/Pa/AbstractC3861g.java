package pa;

import Ea.j;
import android.app.Application;
import com.facebook.react.B;
import com.facebook.react.J;
import com.facebook.react.O;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactContext;
import j0.C3476a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xc.m;

/* renamed from: pa.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3861g extends com.facebook.react.defaults.b {

    /* renamed from: c, reason: collision with root package name */
    private final O f38528c;

    /* renamed from: d, reason: collision with root package name */
    private final List f38529d;

    /* renamed from: e, reason: collision with root package name */
    private final C3476a f38530e;

    /* renamed from: pa.g$a */
    public static final class a implements B {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f38532b;

        a(boolean z10) {
            this.f38532b = z10;
        }

        @Override // com.facebook.react.B
        public void a(ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Iterator it = AbstractC3861g.this.n().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
    }

    /* renamed from: pa.g$b */
    static final class b extends m implements Function1 {
        b() {
            super(1);
        }

        public final String a(j jVar) {
            return jVar.e(AbstractC3861g.this.f());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    /* renamed from: pa.g$c */
    static final class c extends m implements Function1 {
        c() {
            super(1);
        }

        public final String a(j jVar) {
            return jVar.f(AbstractC3861g.this.f());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    /* renamed from: pa.g$d */
    static final class d extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final d f38535a = new d();

        d() {
            super(1);
        }

        public final JavaScriptExecutorFactory a(j jVar) {
            return jVar.c();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    /* renamed from: pa.g$e */
    static final class e extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f38536a = new e();

        e() {
            super(1);
        }

        public final Boolean a(j jVar) {
            return jVar.d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3861g(Application application, O host) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(host, "host");
        this.f38528c = host;
        List a10 = C3856b.f38491b.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            List a11 = ((Ea.g) it.next()).a(application);
            Intrinsics.checkNotNullExpressionValue(a11, "createReactNativeHostHandlers(...)");
            CollectionsKt.z(arrayList, a11);
        }
        this.f38529d = arrayList;
        this.f38530e = new C3476a();
    }

    private final void o(J j10) {
        Field declaredField = O.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this.f38528c, j10);
    }

    @Override // com.facebook.react.O
    protected J createReactInstanceManager() {
        boolean f10 = f();
        Iterator it = this.f38529d.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        J createReactInstanceManager = super.createReactInstanceManager();
        Iterator it2 = this.f38529d.iterator();
        if (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            createReactInstanceManager.E();
            throw null;
        }
        createReactInstanceManager.s(new a(f10));
        Intrinsics.d(createReactInstanceManager);
        o(createReactInstanceManager);
        return createReactInstanceManager;
    }

    @Override // com.facebook.react.O
    public boolean f() {
        Boolean bool = (Boolean) kotlin.sequences.j.q(kotlin.sequences.j.x(CollectionsKt.T(this.f38529d), e.f38536a));
        return bool == null ? this.f38528c.f() : bool.booleanValue();
    }

    @Override // com.facebook.react.O
    public String getBundleAssetName() {
        String str = (String) kotlin.sequences.j.q(kotlin.sequences.j.x(CollectionsKt.T(this.f38529d), new b()));
        return str == null ? (String) p("getBundleAssetName") : str;
    }

    @Override // com.facebook.react.O
    public String getJSBundleFile() {
        String str = (String) kotlin.sequences.j.q(kotlin.sequences.j.x(CollectionsKt.T(this.f38529d), new c()));
        return str == null ? (String) p("getJSBundleFile") : str;
    }

    @Override // com.facebook.react.O
    public String getJSMainModuleName() {
        return (String) p("getJSMainModuleName");
    }

    @Override // com.facebook.react.O
    protected JavaScriptExecutorFactory getJavaScriptExecutorFactory() {
        JavaScriptExecutorFactory javaScriptExecutorFactory = (JavaScriptExecutorFactory) kotlin.sequences.j.q(kotlin.sequences.j.x(CollectionsKt.T(this.f38529d), d.f38535a));
        return javaScriptExecutorFactory == null ? (JavaScriptExecutorFactory) p("getJavaScriptExecutorFactory") : javaScriptExecutorFactory;
    }

    @Override // com.facebook.react.O
    public List getPackages() {
        return (List) p("getPackages");
    }

    protected final O m() {
        return this.f38528c;
    }

    public final List n() {
        return this.f38529d;
    }

    public final Object p(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Method method = (Method) this.f38530e.get(name);
        if (method == null) {
            method = O.class.getDeclaredMethod(name, null);
            method.setAccessible(true);
            this.f38530e.put(name, method);
        }
        Intrinsics.d(method);
        return method.invoke(this.f38528c, null);
    }
}
