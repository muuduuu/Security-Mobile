package pa;

import Ea.h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.A;
import com.facebook.react.AbstractActivityC1928s;
import com.facebook.react.B;
import com.facebook.react.C1982v;
import com.facebook.react.C1997z;
import com.facebook.react.J;
import com.facebook.react.O;
import com.facebook.react.Z;
import com.facebook.react.bridge.ReactContext;
import j0.C3476a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.j;
import lc.i;
import u5.C4870a;
import xc.m;

/* renamed from: pa.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3859e extends C1982v {

    /* renamed from: f, reason: collision with root package name */
    private final AbstractActivityC1928s f38507f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f38508g;

    /* renamed from: h, reason: collision with root package name */
    private C1982v f38509h;

    /* renamed from: i, reason: collision with root package name */
    private final List f38510i;

    /* renamed from: j, reason: collision with root package name */
    private final List f38511j;

    /* renamed from: k, reason: collision with root package name */
    private final C3476a f38512k;

    /* renamed from: l, reason: collision with root package name */
    private final Lazy f38513l;

    /* renamed from: m, reason: collision with root package name */
    private final Lazy f38514m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f38515n;

    /* renamed from: pa.e$a */
    static final class a extends m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A invoke() {
            return C3859e.this.f38509h.getReactHost();
        }
    }

    /* renamed from: pa.e$b */
    static final class b extends m implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke() {
            return (O) C3859e.this.h("getReactNativeHost");
        }
    }

    /* renamed from: pa.e$c */
    static final class c extends m implements Function1 {
        c() {
            super(1);
        }

        public final h.a a(h hVar) {
            hVar.c(C3859e.this.f38507f, C3859e.this.getReactNativeHost());
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            a(null);
            return null;
        }
    }

    /* renamed from: pa.e$d */
    static final class d extends m implements Function1 {
        d() {
            super(1);
        }

        public final ViewGroup a(h hVar) {
            return hVar.b(C3859e.this.f38507f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    /* renamed from: pa.e$e, reason: collision with other inner class name */
    public static final class C0594e implements B {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38521b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f38522c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Intent f38523d;

        C0594e(int i10, int i11, Intent intent) {
            this.f38521b = i10;
            this.f38522c = i11;
            this.f38523d = intent;
        }

        @Override // com.facebook.react.B
        public void a(ReactContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C3859e.this.f38509h.getReactInstanceManager().r0(this);
            C3859e.this.f38509h.onActivityResult(this.f38521b, this.f38522c, this.f38523d);
        }
    }

    /* renamed from: pa.e$f */
    public static final class f extends C1997z {

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C3859e f38524j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Bundle bundle, C3859e c3859e, Activity activity, O o10, String str) {
            super(activity, o10, str, bundle);
            this.f38524j = c3859e;
        }

        @Override // com.facebook.react.C1997z
        protected Z b() {
            Z createRootView = this.f38524j.createRootView();
            if (createRootView != null) {
                return createRootView;
            }
            Z b10 = super.b();
            Intrinsics.checkNotNullExpressionValue(b10, "createRootView(...)");
            return b10;
        }
    }

    /* renamed from: pa.e$g */
    static final class g extends m implements Function1 {
        g() {
            super(1);
        }

        public final C1982v a(h hVar) {
            return hVar.a(C3859e.this.f38507f, C3859e.this);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            return a(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3859e(AbstractActivityC1928s activity, boolean z10, C1982v delegate) {
        super(activity, (String) null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f38507f = activity;
        this.f38508g = z10;
        this.f38509h = delegate;
        List a10 = C3856b.f38491b.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = a10.iterator();
        while (it.hasNext()) {
            List b10 = ((Ea.g) it.next()).b(this.f38507f);
            Intrinsics.checkNotNullExpressionValue(b10, "createReactActivityLifecycleListeners(...)");
            CollectionsKt.z(arrayList, b10);
        }
        this.f38510i = arrayList;
        List a11 = C3856b.f38491b.a();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = a11.iterator();
        while (it2.hasNext()) {
            List e10 = ((Ea.g) it2.next()).e(this.f38507f);
            Intrinsics.checkNotNullExpressionValue(e10, "createReactActivityHandlers(...)");
            CollectionsKt.z(arrayList2, e10);
        }
        this.f38511j = arrayList2;
        this.f38512k = new C3476a();
        this.f38513l = i.a(new b());
        this.f38514m = i.a(new a());
    }

    private final A f() {
        return (A) this.f38514m.getValue();
    }

    private final O g() {
        return (O) this.f38513l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(String str) {
        Method method = (Method) this.f38512k.get(str);
        if (method == null) {
            method = C1982v.class.getDeclaredMethod(str, null);
            method.setAccessible(true);
            this.f38512k.put(str, method);
        }
        Intrinsics.d(method);
        return method.invoke(this.f38509h, null);
    }

    private final Object i(String str, Class[] clsArr, Object[] objArr) {
        Method method = (Method) this.f38512k.get(str);
        if (method == null) {
            method = C1982v.class.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            method.setAccessible(true);
            this.f38512k.put(str, method);
        }
        Intrinsics.d(method);
        return method.invoke(this.f38509h, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.facebook.react.C1982v
    protected Bundle composeLaunchOptions() {
        return (Bundle) h("composeLaunchOptions");
    }

    @Override // com.facebook.react.C1982v
    protected Z createRootView() {
        return (Z) h("createRootView");
    }

    @Override // com.facebook.react.C1982v
    protected Context getContext() {
        return (Context) h("getContext");
    }

    @Override // com.facebook.react.C1982v
    protected Bundle getLaunchOptions() {
        return (Bundle) h("getLaunchOptions");
    }

    @Override // com.facebook.react.C1982v
    public String getMainComponentName() {
        return this.f38509h.getMainComponentName();
    }

    @Override // com.facebook.react.C1982v
    protected Activity getPlainActivity() {
        return (Activity) h("getPlainActivity");
    }

    @Override // com.facebook.react.C1982v
    protected C1997z getReactDelegate() {
        return (C1997z) h("getReactDelegate");
    }

    @Override // com.facebook.react.C1982v
    public A getReactHost() {
        return f();
    }

    @Override // com.facebook.react.C1982v
    public J getReactInstanceManager() {
        J reactInstanceManager = this.f38509h.getReactInstanceManager();
        Intrinsics.checkNotNullExpressionValue(reactInstanceManager, "getReactInstanceManager(...)");
        return reactInstanceManager;
    }

    @Override // com.facebook.react.C1982v
    protected O getReactNativeHost() {
        return g();
    }

    @Override // com.facebook.react.C1982v
    protected boolean isFabricEnabled() {
        return ((Boolean) h("isFabricEnabled")).booleanValue();
    }

    @Override // com.facebook.react.C1982v
    protected void loadApp(String str) {
        ViewGroup viewGroup = (ViewGroup) j.q(j.x(CollectionsKt.T(this.f38511j), new d()));
        if (viewGroup == null) {
            android.support.v4.media.session.b.a(j.q(j.x(CollectionsKt.T(this.f38511j), new c())));
            i("loadApp", new Class[]{String.class}, new String[]{str});
            Iterator it = this.f38510i.iterator();
            while (it.hasNext()) {
                ((Ea.i) it.next()).f(this.f38507f);
            }
            return;
        }
        Field declaredField = C1982v.class.getDeclaredField("e");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this.f38509h);
        Intrinsics.e(obj, "null cannot be cast to non-null type com.facebook.react.ReactDelegate");
        C1997z c1997z = (C1997z) obj;
        c1997z.i(str);
        Z f10 = c1997z.f();
        ViewParent parent = f10 != null ? f10.getParent() : null;
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(f10);
        }
        viewGroup.addView(f10, -1);
        this.f38507f.setContentView(viewGroup);
        Iterator it2 = this.f38510i.iterator();
        while (it2.hasNext()) {
            ((Ea.i) it2.next()).f(this.f38507f);
        }
    }

    @Override // com.facebook.react.C1982v
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (Sb.b.f8936a.a() || this.f38509h.getReactInstanceManager().D() != null) {
            this.f38509h.onActivityResult(i10, i11, intent);
        } else {
            this.f38509h.getReactInstanceManager().s(new C0594e(i10, i11, intent));
        }
    }

    @Override // com.facebook.react.C1982v
    public boolean onBackPressed() {
        boolean z10;
        List list = this.f38510i;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((Ea.i) it.next()).a()));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || booleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f38509h.onBackPressed();
    }

    @Override // com.facebook.react.C1982v
    public void onConfigurationChanged(Configuration configuration) {
        this.f38509h.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.react.C1982v
    public void onCreate(Bundle bundle) {
        C1982v c1982v = (C1982v) j.q(j.x(CollectionsKt.T(this.f38511j), new g()));
        if (c1982v == null || Intrinsics.b(c1982v, this)) {
            Bundle composeLaunchOptions = composeLaunchOptions();
            Object c1997z = Sb.b.f8936a.a() ? new C1997z(getPlainActivity(), getReactHost(), getMainComponentName(), composeLaunchOptions) : new f(composeLaunchOptions, this, getPlainActivity(), getReactNativeHost(), getMainComponentName());
            Field declaredField = C1982v.class.getDeclaredField("e");
            declaredField.setAccessible(true);
            declaredField.set(this.f38509h, c1997z);
            if (getMainComponentName() != null) {
                loadApp(getMainComponentName());
            }
        } else {
            Field declaredField2 = AbstractActivityC1928s.class.getDeclaredField(C4870a.f43493a);
            declaredField2.setAccessible(true);
            Field declaredField3 = Field.class.getDeclaredField("accessFlags");
            declaredField3.setAccessible(true);
            declaredField3.setInt(declaredField2, declaredField2.getModifiers() & (-17));
            declaredField2.set(this.f38507f, c1982v);
            this.f38509h = c1982v;
            i("onCreate", new Class[]{Bundle.class}, new Bundle[]{bundle});
        }
        Iterator it = this.f38510i.iterator();
        while (it.hasNext()) {
            ((Ea.i) it.next()).b(this.f38507f, bundle);
        }
    }

    @Override // com.facebook.react.C1982v
    public void onDestroy() {
        if (this.f38515n) {
            this.f38515n = false;
            return;
        }
        Iterator it = this.f38510i.iterator();
        while (it.hasNext()) {
            ((Ea.i) it.next()).c(this.f38507f);
        }
        h("onDestroy");
    }

    @Override // com.facebook.react.C1982v
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        List list = this.f38511j;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Iterator it2 = arrayList.iterator();
        loop0: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || booleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f38509h.onKeyDown(i10, keyEvent);
    }

    @Override // com.facebook.react.C1982v
    public boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        boolean z10;
        List list = this.f38511j;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Iterator it2 = arrayList.iterator();
        loop0: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || booleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f38509h.onKeyLongPress(i10, keyEvent);
    }

    @Override // com.facebook.react.C1982v
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z10;
        List list = this.f38511j;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        Iterator it2 = arrayList.iterator();
        loop0: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || booleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f38509h.onKeyUp(i10, keyEvent);
    }

    @Override // com.facebook.react.C1982v
    public boolean onNewIntent(Intent intent) {
        boolean z10;
        List list = this.f38510i;
        ArrayList arrayList = new ArrayList(CollectionsKt.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((Ea.i) it.next()).onNewIntent(intent)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean booleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || booleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f38509h.onNewIntent(intent);
    }

    @Override // com.facebook.react.C1982v
    public void onPause() {
        if (this.f38515n) {
            this.f38515n = false;
            return;
        }
        Iterator it = this.f38510i.iterator();
        while (it.hasNext()) {
            ((Ea.i) it.next()).e(this.f38507f);
        }
        h("onPause");
    }

    @Override // com.facebook.react.C1982v
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f38509h.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // com.facebook.react.C1982v
    public void onResume() {
        if (this.f38515n) {
            return;
        }
        h("onResume");
        Iterator it = this.f38510i.iterator();
        while (it.hasNext()) {
            ((Ea.i) it.next()).d(this.f38507f);
        }
    }

    @Override // com.facebook.react.C1982v
    public void onUserLeaveHint() {
        Iterator it = this.f38510i.iterator();
        while (it.hasNext()) {
            ((Ea.i) it.next()).onUserLeaveHint(this.f38507f);
        }
        h("onUserLeaveHint");
    }

    @Override // com.facebook.react.C1982v
    public void onWindowFocusChanged(boolean z10) {
        this.f38509h.onWindowFocusChanged(z10);
    }

    @Override // com.facebook.react.C1982v
    public void requestPermissions(String[] strArr, int i10, O4.h hVar) {
        this.f38509h.requestPermissions(strArr, i10, hVar);
    }
}
