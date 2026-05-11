package expo.modules.kotlin.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import expo.modules.adapters.react.NativeModulesProxy;
import expo.modules.kotlin.exception.CodedException;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import ub.C4879b;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f32753a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f32754b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f32755c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f32756d;

    /* renamed from: e, reason: collision with root package name */
    private final b f32757e;

    /* renamed from: f, reason: collision with root package name */
    private final Function1 f32758f;

    /* renamed from: g, reason: collision with root package name */
    private final List f32759g;

    /* renamed from: h, reason: collision with root package name */
    private final List f32760h;

    public o(Function2 viewFactory, Class viewType, Map props, Function1 function1, b bVar, n nVar, Function1 function12, List asyncFunctions) {
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(asyncFunctions, "asyncFunctions");
        this.f32753a = viewFactory;
        this.f32754b = viewType;
        this.f32755c = props;
        this.f32756d = function1;
        this.f32757e = bVar;
        this.f32758f = function12;
        this.f32759g = asyncFunctions;
        this.f32760h = CollectionsKt.O0(props.keySet());
    }

    public final View a(Context context, C3862a appContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return (View) this.f32753a.invoke(context, appContext);
    }

    public final List b() {
        return this.f32759g;
    }

    public final b c() {
        return this.f32757e;
    }

    public final Function1 d() {
        return this.f32756d;
    }

    public final Function1 e() {
        return this.f32758f;
    }

    public final Map f() {
        return this.f32755c;
    }

    public final List g() {
        return this.f32760h;
    }

    public final n h() {
        return null;
    }

    public final p i() {
        return ViewGroup.class.isAssignableFrom(this.f32754b) ? p.GROUP : p.SIMPLE;
    }

    public final Class j() {
        return this.f32754b;
    }

    public final void k(View view, CodedException exception) {
        NativeModulesProxy a10;
        C4879b m10;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Context context = view.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        if (reactContext == null || (a10 = pb.o.a(reactContext)) == null || (m10 = a10.getKotlinInteropModuleRegistry().f().m()) == null) {
            return;
        }
        m10.i(exception);
    }
}
