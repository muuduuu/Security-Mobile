package expo.modules.kotlin.views;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import pb.AbstractC3864c;
import vc.AbstractC5011a;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private pb.j f32761a;

    public q(pb.j moduleHolder) {
        Intrinsics.checkNotNullParameter(moduleHolder, "moduleHolder");
        this.f32761a = moduleHolder;
    }

    private final o b() {
        o h10 = this.f32761a.e().h();
        if (h10 != null) {
            return h10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b().a(context, this.f32761a.g().a());
    }

    public final Map c() {
        String[] a10;
        Map c10 = G.c();
        b c11 = b().c();
        if (c11 != null && (a10 = c11.a()) != null) {
            for (String str : a10) {
                c10.put(vb.i.a(str), G.e(t.a("registrationName", str)));
            }
        }
        return G.b(c10);
    }

    public final pb.j d() {
        return this.f32761a;
    }

    public final String e() {
        return this.f32761a.h();
    }

    public final Map f() {
        return b().f();
    }

    public final n g() {
        b().h();
        return null;
    }

    public final void h(View view) {
        CodedException unexpectedException;
        CodedException codedException;
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            Function1 d10 = b().d();
            if (d10 != null) {
                d10.invoke(view);
            }
        } catch (Throwable th) {
            if (f.a(view)) {
                return;
            }
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else {
                if (th instanceof Da.a) {
                    String a10 = ((Da.a) th).a();
                    Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                    unexpectedException = new CodedException(a10, th.getMessage(), th.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
                codedException = unexpectedException;
            }
            AbstractC3864c.a().a("❌ '" + view + "' wasn't able to destroy itself", codedException);
            b().k(view, codedException);
        }
    }

    public final void i(View view) {
        CodedException unexpectedException;
        CodedException codedException;
        Intrinsics.checkNotNullParameter(view, "view");
        Function1 e10 = b().e();
        if (e10 != null) {
            try {
                e10.invoke(view);
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                try {
                    if (th instanceof CodedException) {
                        codedException = (CodedException) th;
                    } else if (th instanceof Da.a) {
                        String a10 = ((Da.a) th).a();
                        Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                        codedException = new CodedException(a10, th.getMessage(), th.getCause());
                    } else {
                        codedException = new UnexpectedException(th);
                    }
                    throw new x(AbstractC5011a.e(view.getClass()), codedException);
                } catch (Throwable th2) {
                    if (f.a(view)) {
                        return;
                    }
                    if (th2 instanceof CodedException) {
                        unexpectedException = (CodedException) th2;
                    } else if (th2 instanceof Da.a) {
                        String a11 = ((Da.a) th2).a();
                        Intrinsics.checkNotNullExpressionValue(a11, "getCode(...)");
                        unexpectedException = new CodedException(a11, th2.getMessage(), th2.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th2);
                    }
                    AbstractC3864c.a().a("❌ Error occurred when invoking 'onViewDidUpdateProps' on '" + view.getClass().getSimpleName() + "'", unexpectedException);
                    b().k(view, unexpectedException);
                }
            }
        }
    }

    public final void j(pb.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f32761a = jVar;
    }

    public final List k(View view, ReadableMap propsMap) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(propsMap, "propsMap");
        Map f10 = f();
        ArrayList arrayList = new ArrayList();
        ReadableMapKeySetIterator keySetIterator = propsMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            a aVar = (a) f10.get(nextKey);
            if (aVar != null) {
                try {
                    Dynamic dynamic = propsMap.getDynamic(nextKey);
                    pb.r e10 = this.f32761a.g().e();
                    aVar.c(dynamic, view, e10 != null ? e10.b() : null);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return arrayList;
    }
}
