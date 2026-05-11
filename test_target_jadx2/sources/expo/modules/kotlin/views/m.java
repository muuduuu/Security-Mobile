package expo.modules.kotlin.views;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import ub.C4879b;
import vc.AbstractC5011a;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.d f32744a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.o f32745b;

    /* renamed from: c, reason: collision with root package name */
    private Map f32746c;

    /* renamed from: d, reason: collision with root package name */
    private Function1 f32747d;

    /* renamed from: e, reason: collision with root package name */
    private Function1 f32748e;

    /* renamed from: f, reason: collision with root package name */
    private b f32749f;

    /* renamed from: g, reason: collision with root package name */
    private Map f32750g;

    /* renamed from: h, reason: collision with root package name */
    private Map f32751h;

    static final class a extends xc.m implements Function2 {
        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(Context context, C3862a appContext) {
            Constructor constructor;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Constructor constructor2 = null;
            try {
                constructor = AbstractC5011a.b(m.this.h()).getConstructor(Context.class, C3862a.class);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
            if (constructor != null) {
                m mVar = m.this;
                try {
                    Object newInstance = constructor.newInstance(context, appContext);
                    Intrinsics.d(newInstance);
                    return (View) newInstance;
                } catch (Throwable th) {
                    return mVar.i(context, appContext, th);
                }
            }
            try {
                constructor2 = AbstractC5011a.b(m.this.h()).getConstructor(Context.class);
            } catch (NoSuchMethodException unused2) {
            }
            if (constructor2 == null) {
                throw new IllegalStateException("Didn't find a correct constructor for " + m.this.h());
            }
            m mVar2 = m.this;
            try {
                Object newInstance2 = constructor2.newInstance(context);
                Intrinsics.d(newInstance2);
                return (View) newInstance2;
            } catch (Throwable th2) {
                return mVar2.i(context, appContext, th2);
            }
        }
    }

    public m(kotlin.reflect.d viewClass, kotlin.reflect.o viewType) {
        Intrinsics.checkNotNullParameter(viewClass, "viewClass");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f32744a = viewClass;
        this.f32745b = viewType;
        this.f32746c = new LinkedHashMap();
        this.f32750g = new LinkedHashMap();
        this.f32751h = new LinkedHashMap();
    }

    private final Function2 e() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View i(Context context, C3862a c3862a, Throwable th) {
        Log.e("ExpoModulesCore", "Couldn't create view of type " + this.f32744a, th);
        C4879b m10 = c3862a.m();
        if (m10 != null) {
            m10.i(th instanceof CodedException ? (CodedException) th : new UnexpectedException(th));
        }
        return ViewGroup.class.isAssignableFrom(AbstractC5011a.b(this.f32744a)) ? new d(context) : new e(context);
    }

    public final void a(String... callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.f32749f = new b(callbacks);
    }

    public final void b(String[] callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.f32749f = new b(callbacks);
    }

    public final o d() {
        Map map = this.f32750g;
        Map map2 = this.f32751h;
        LinkedHashMap linkedHashMap = new LinkedHashMap(G.d(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((wb.d) entry.getValue()).a());
        }
        Map n10 = G.n(map, linkedHashMap);
        Iterator it = n10.entrySet().iterator();
        while (it.hasNext()) {
            wb.g gVar = (wb.g) ((Map.Entry) it.next()).getValue();
            gVar.m(wb.l.MAIN);
            gVar.k(this.f32745b);
            gVar.j(true);
        }
        return new o(e(), AbstractC5011a.b(this.f32744a), this.f32746c, this.f32747d, this.f32749f, null, this.f32748e, CollectionsKt.O0(n10.values()));
    }

    public final Map f() {
        return this.f32750g;
    }

    public final Map g() {
        return this.f32746c;
    }

    public final kotlin.reflect.d h() {
        return this.f32744a;
    }

    public final void j(Function1 function1) {
        this.f32747d = function1;
    }

    public final void k(Function1 function1) {
        this.f32748e = function1;
    }
}
