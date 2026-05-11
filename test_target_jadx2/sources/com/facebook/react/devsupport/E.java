package com.facebook.react.devsupport;

import C4.e;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import c3.AbstractC1721a;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.AbstractC1902q;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.devsupport.C1865a;
import com.facebook.react.devsupport.C1874j;
import com.facebook.react.devsupport.E;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC1873i;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;
import r4.AbstractC4012a;
import v4.C4927c;
import v4.C4930f;

/* loaded from: classes.dex */
public abstract class E implements C4.e {

    /* renamed from: B, reason: collision with root package name */
    private final C4.b f21467B;

    /* renamed from: C, reason: collision with root package name */
    private List f21468C;

    /* renamed from: D, reason: collision with root package name */
    private final Map f21469D;

    /* renamed from: E, reason: collision with root package name */
    private final v4.j f21470E;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21471a;

    /* renamed from: b, reason: collision with root package name */
    private final C4930f f21472b;

    /* renamed from: c, reason: collision with root package name */
    private final BroadcastReceiver f21473c;

    /* renamed from: d, reason: collision with root package name */
    private final C1874j f21474d;

    /* renamed from: f, reason: collision with root package name */
    private final d0 f21476f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21477g;

    /* renamed from: h, reason: collision with root package name */
    private final File f21478h;

    /* renamed from: i, reason: collision with root package name */
    private final File f21479i;

    /* renamed from: j, reason: collision with root package name */
    private final DefaultJSExceptionHandler f21480j;

    /* renamed from: k, reason: collision with root package name */
    private final C4.c f21481k;

    /* renamed from: l, reason: collision with root package name */
    private final C4.h f21482l;

    /* renamed from: m, reason: collision with root package name */
    private v4.i f21483m;

    /* renamed from: n, reason: collision with root package name */
    private AlertDialog f21484n;

    /* renamed from: o, reason: collision with root package name */
    private C1867c f21485o;

    /* renamed from: r, reason: collision with root package name */
    private ReactContext f21488r;

    /* renamed from: s, reason: collision with root package name */
    private final P4.a f21489s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f21493w;

    /* renamed from: x, reason: collision with root package name */
    private String f21494x;

    /* renamed from: y, reason: collision with root package name */
    private C4.j[] f21495y;

    /* renamed from: z, reason: collision with root package name */
    private C4.f f21496z;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f21475e = new LinkedHashMap();

    /* renamed from: p, reason: collision with root package name */
    private boolean f21486p = false;

    /* renamed from: q, reason: collision with root package name */
    private int f21487q = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21490t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21491u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f21492v = false;

    /* renamed from: A, reason: collision with root package name */
    private int f21466A = 0;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (E.o0(context).equals(intent.getAction())) {
                if (intent.getBooleanExtra("jsproxy", false)) {
                    E.this.f21489s.g(true);
                    E.this.f21474d.x();
                } else {
                    E.this.f21489s.g(false);
                }
                E.this.q();
            }
        }
    }

    class b implements C4.d {
        b() {
        }

        @Override // C4.d
        public void a() {
            if (!E.this.f21489s.h() && E.this.f21489s.i()) {
                Toast.makeText(E.this.f21471a, E.this.f21471a.getString(AbstractC1902q.f21933h), 1).show();
                E.this.f21489s.c(false);
            }
            E.this.q();
        }
    }

    class c implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EditText f21499a;

        c(EditText editText) {
            this.f21499a = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            E.this.f21489s.j().d(this.f21499a.getText().toString());
            E.this.q();
        }
    }

    class d implements C4.d {
        d() {
        }

        @Override // C4.d
        public void a() {
            E.this.f21489s.b(!E.this.f21489s.a());
            E.this.f21476f.i();
        }
    }

    class e extends ArrayAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Set f21502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i10, String[] strArr, Set set) {
            super(context, i10, strArr);
            this.f21502a = set;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            view2.setEnabled(isEnabled(i10));
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return !this.f21502a.contains(getItem(i10));
        }
    }

    class f implements JSCHeapCapture.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ V4.h f21504a;

        f(V4.h hVar) {
            this.f21504a = hVar;
        }

        @Override // com.facebook.react.devsupport.JSCHeapCapture.a
        public void a(File file) {
            this.f21504a.a(file.toString());
        }

        @Override // com.facebook.react.devsupport.JSCHeapCapture.a
        public void b(JSCHeapCapture.b bVar) {
            this.f21504a.b(bVar.toString());
        }
    }

    class g implements C4.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1865a.c f21506a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4.a f21507b;

        g(C1865a.c cVar, C4.a aVar) {
            this.f21506a = cVar;
            this.f21507b = aVar;
        }

        @Override // C4.b
        public void b(Exception exc) {
            E.this.r0();
            if (E.this.f21467B != null) {
                E.this.f21467B.b(exc);
            }
            AbstractC1721a.n("ReactNative", "Unable to download JS bundle", exc);
            E.this.N0(exc);
            this.f21507b.onError(exc);
        }

        @Override // C4.b
        public void c(String str, Integer num, Integer num2) {
            E.this.f21481k.d(str, num, num2);
            if (E.this.f21467B != null) {
                E.this.f21467B.c(str, num, num2);
            }
        }

        @Override // C4.b
        public void onSuccess() {
            E.this.r0();
            if (E.this.f21467B != null) {
                E.this.f21467B.onSuccess();
            }
            ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, this.f21506a.c());
            this.f21507b.onSuccess();
        }
    }

    class h implements C1874j.h {
        h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(V4.h hVar) {
            E.this.q0(hVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k() {
            E.this.C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            E.this.q();
        }

        @Override // com.facebook.react.devsupport.C1874j.h
        public void a() {
            E.this.f21493w = true;
        }

        @Override // com.facebook.react.devsupport.C1874j.h
        public void b() {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.H
                @Override // java.lang.Runnable
                public final void run() {
                    E.h.this.k();
                }
            });
        }

        @Override // com.facebook.react.devsupport.C1874j.h
        public void c() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                E.this.f21474d.n();
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.G
                @Override // java.lang.Runnable
                public final void run() {
                    E.h.this.l();
                }
            });
        }

        @Override // com.facebook.react.devsupport.C1874j.h
        public void d() {
            E.this.f21493w = false;
        }

        @Override // com.facebook.react.devsupport.C1874j.h
        public void e(final V4.h hVar) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.F
                @Override // java.lang.Runnable
                public final void run() {
                    E.h.this.j(hVar);
                }
            });
        }

        @Override // com.facebook.react.devsupport.C1874j.h
        public Map f() {
            return E.this.f21469D;
        }
    }

    public E(Context context, d0 d0Var, String str, boolean z10, C4.i iVar, C4.b bVar, int i10, Map map, v4.j jVar, C4.c cVar, C4.h hVar) {
        this.f21476f = d0Var;
        this.f21471a = context;
        this.f21477g = str;
        SharedPreferencesOnSharedPreferenceChangeListenerC1873i sharedPreferencesOnSharedPreferenceChangeListenerC1873i = new SharedPreferencesOnSharedPreferenceChangeListenerC1873i(context, new SharedPreferencesOnSharedPreferenceChangeListenerC1873i.b() { // from class: com.facebook.react.devsupport.o
            @Override // com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC1873i.b
            public final void a() {
                E.this.M0();
            }
        });
        this.f21489s = sharedPreferencesOnSharedPreferenceChangeListenerC1873i;
        this.f21474d = new C1874j(sharedPreferencesOnSharedPreferenceChangeListenerC1873i, context, sharedPreferencesOnSharedPreferenceChangeListenerC1873i.j());
        this.f21467B = bVar;
        this.f21472b = new C4930f(new C4930f.a() { // from class: com.facebook.react.devsupport.p
            @Override // v4.C4930f.a
            public final void a() {
                E.this.C();
            }
        }, i10);
        this.f21469D = map;
        this.f21473c = new a();
        String p02 = p0();
        this.f21478h = new File(context.getFilesDir(), p02 + "ReactNativeDevBundle.js");
        this.f21479i = context.getDir(p02.toLowerCase(Locale.ROOT) + "_dev_js_split_bundles", 0);
        this.f21480j = new DefaultJSExceptionHandler();
        t(z10);
        this.f21481k = cVar == null ? new C1871g(d0Var) : cVar;
        this.f21470E = jVar;
        this.f21482l = hVar == null ? new b0(new y0.h() { // from class: com.facebook.react.devsupport.q
            @Override // y0.h
            public final Object get() {
                Context u02;
                u02 = E.this.u0();
                return u02;
            }
        }) : hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        Activity a10 = this.f21476f.a();
        if (a10 == null || a10.isFinishing()) {
            AbstractC1721a.m("ReactNative", "Unable to launch change bundle location because react activity is not available");
            return;
        }
        EditText editText = new EditText(a10);
        editText.setHint("localhost:8081");
        new AlertDialog.Builder(a10).setTitle(this.f21471a.getString(AbstractC1902q.f21927b)).setView(editText).setPositiveButton(R.string.ok, new c(editText)).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0() {
        boolean i10 = this.f21489s.i();
        this.f21489s.c(!i10);
        ReactContext reactContext = this.f21488r;
        if (reactContext != null) {
            if (i10) {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).disable();
            } else {
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).enable();
            }
        }
        if (i10 || this.f21489s.h()) {
            return;
        }
        Context context = this.f21471a;
        Toast.makeText(context, context.getString(AbstractC1902q.f21934i), 1).show();
        this.f21489s.l(true);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0() {
        if (!this.f21489s.e()) {
            Activity a10 = this.f21476f.a();
            if (a10 == null) {
                AbstractC1721a.m("ReactNative", "Unable to get reference to react activity");
            } else {
                C1867c.h(a10);
            }
        }
        this.f21489s.f(!r0.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0() {
        Intent intent = new Intent(this.f21471a, (Class<?>) AbstractC1875k.class);
        intent.setFlags(268435456);
        this.f21471a.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(C4.d[] dVarArr, DialogInterface dialogInterface, int i10) {
        dVarArr[i10].a();
        this.f21484n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(DialogInterface dialogInterface) {
        this.f21484n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(String str, C4.j[] jVarArr, int i10, C4.f fVar) {
        S0(str, jVarArr, i10, fVar);
        if (this.f21483m == null) {
            v4.i d10 = d(NativeRedBoxSpec.NAME);
            if (d10 != null) {
                this.f21483m = d10;
            } else {
                this.f21483m = new i0(this);
            }
            this.f21483m.f(NativeRedBoxSpec.NAME);
        }
        if (this.f21483m.a()) {
            return;
        }
        this.f21483m.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0() {
        this.f21489s.b(!r0.a());
        this.f21476f.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(int i10, String str, ReadableArray readableArray) {
        v4.i iVar = this.f21483m;
        if ((iVar == null || iVar.a()) && i10 == this.f21466A) {
            S0(str, l0.b(readableArray), i10, C4.f.JS);
            this.f21483m.b();
        }
    }

    private void J0(Exception exc) {
        StringBuilder sb2 = new StringBuilder(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append("\n\n");
            sb2.append(cause.getMessage());
        }
        if (!(exc instanceof JavascriptException)) {
            R0(sb2.toString(), exc);
        } else {
            AbstractC1721a.n("ReactNative", "Exception in native call from JS", exc);
            Q0(exc.getMessage().toString(), new C4.j[0], -1, C4.f.JS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        UiThreadUtil.assertOnUiThread();
        if (!this.f21492v) {
            C1867c c1867c = this.f21485o;
            if (c1867c != null) {
                c1867c.i(false);
            }
            if (this.f21491u) {
                this.f21472b.f();
                this.f21491u = false;
            }
            if (this.f21490t) {
                this.f21471a.unregisterReceiver(this.f21473c);
                this.f21490t = false;
            }
            o();
            s0();
            this.f21481k.c();
            this.f21474d.i();
            return;
        }
        C1867c c1867c2 = this.f21485o;
        if (c1867c2 != null) {
            c1867c2.i(this.f21489s.e());
        }
        if (!this.f21491u) {
            this.f21472b.e((SensorManager) this.f21471a.getSystemService("sensor"));
            this.f21491u = true;
        }
        if (!this.f21490t) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(o0(this.f21471a));
            i0(this.f21471a, this.f21473c, intentFilter, true);
            this.f21490t = true;
        }
        if (this.f21486p) {
            this.f21481k.showMessage("Reloading...");
        }
        this.f21474d.A(getClass().getSimpleName(), new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(final Exception exc) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.u
            @Override // java.lang.Runnable
            public final void run() {
                E.this.v0(exc);
            }
        });
    }

    private void O0(ReactContext reactContext) {
        if (this.f21488r == reactContext) {
            return;
        }
        this.f21488r = reactContext;
        C1867c c1867c = this.f21485o;
        if (c1867c != null) {
            c1867c.i(false);
        }
        if (reactContext != null) {
            this.f21485o = new C1867c(reactContext);
        }
        if (this.f21488r != null) {
            try {
                URL url = new URL(v());
                ((HMRClient) this.f21488r.getJSModule(HMRClient.class)).setup("android", url.getPath().substring(1), url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.f21489s.i(), url.getProtocol());
            } catch (MalformedURLException e10) {
                R0(e10.getMessage(), e10);
            }
        }
        M0();
    }

    private void P0(String str) {
        if (this.f21471a == null) {
            return;
        }
        try {
            URL url = new URL(str);
            int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
            this.f21481k.showMessage(this.f21471a.getString(AbstractC1902q.f21937l, url.getHost() + ":" + port));
            this.f21486p = true;
        } catch (MalformedURLException e10) {
            AbstractC1721a.m("ReactNative", "Bundle url format is invalid. \n\n" + e10.toString());
        }
    }

    private void Q0(final String str, final C4.j[] jVarArr, final int i10, final C4.f fVar) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.v
            @Override // java.lang.Runnable
            public final void run() {
                E.this.G0(str, jVarArr, i10, fVar);
            }
        });
    }

    private void S0(String str, C4.j[] jVarArr, int i10, C4.f fVar) {
        this.f21494x = str;
        this.f21495y = jVarArr;
        this.f21466A = i10;
        this.f21496z = fVar;
    }

    private void i0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z10) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, z10 ? 2 : 4);
        }
    }

    private String m0() {
        try {
            return n0().c().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String o0(Context context) {
        return context.getPackageName() + ".RELOAD_APP_ACTION";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(V4.h hVar) {
        JSCHeapCapture jSCHeapCapture;
        ReactContext reactContext = this.f21488r;
        if (reactContext == null || (jSCHeapCapture = (JSCHeapCapture) reactContext.getNativeModule(JSCHeapCapture.class)) == null) {
            return;
        }
        jSCHeapCapture.captureHeap(this.f21471a.getCacheDir().getPath(), new f(hVar));
    }

    private void s0() {
        AlertDialog alertDialog = this.f21484n;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.f21484n = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(C4.g gVar) {
        this.f21474d.w(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Context u0() {
        Activity a10 = this.f21476f.a();
        if (a10 == null || a10.isFinishing()) {
            return null;
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(Exception exc) {
        if (exc instanceof C4927c) {
            R0(((C4927c) exc).getMessage(), exc);
        } else {
            R0(this.f21471a.getString(AbstractC1902q.f21942q), exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(boolean z10) {
        this.f21489s.f(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(boolean z10) {
        this.f21489s.c(z10);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(boolean z10) {
        this.f21489s.g(z10);
        q();
    }

    @Override // C4.e
    public boolean A() {
        if (this.f21492v && this.f21478h.exists()) {
            try {
                String packageName = this.f21471a.getPackageName();
                if (this.f21478h.lastModified() > this.f21471a.getPackageManager().getPackageInfo(packageName, 0).lastUpdateTime) {
                    File file = new File(String.format(Locale.US, "/data/local/tmp/exopackage/%s//secondary-dex", packageName));
                    if (file.exists()) {
                        return this.f21478h.lastModified() > file.lastModified();
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC1721a.m("ReactNative", "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    @Override // C4.e
    public C4.j[] B() {
        return this.f21495y;
    }

    @Override // C4.e
    public void C() {
        if (this.f21484n == null && this.f21492v && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            linkedHashMap.put(this.f21471a.getString(AbstractC1902q.f21941p), new b());
            if (this.f21489s.m()) {
                this.f21489s.g(false);
                q();
            }
            if (this.f21489s.k() && !this.f21489s.m()) {
                boolean z10 = this.f21493w;
                String string = this.f21471a.getString(z10 ? AbstractC1902q.f21928c : AbstractC1902q.f21929d);
                if (!z10) {
                    hashSet.add(string);
                }
                linkedHashMap.put(string, new C4.d() { // from class: com.facebook.react.devsupport.y
                    @Override // C4.d
                    public final void a() {
                        E.this.z0();
                    }
                });
            }
            linkedHashMap.put(this.f21471a.getString(AbstractC1902q.f21927b), new C4.d() { // from class: com.facebook.react.devsupport.z
                @Override // C4.d
                public final void a() {
                    E.this.A0();
                }
            });
            linkedHashMap.put(this.f21471a.getString(AbstractC1902q.f21936k), new d());
            linkedHashMap.put(this.f21489s.i() ? this.f21471a.getString(AbstractC1902q.f21935j) : this.f21471a.getString(AbstractC1902q.f21932g), new C4.d() { // from class: com.facebook.react.devsupport.A
                @Override // C4.d
                public final void a() {
                    E.this.B0();
                }
            });
            linkedHashMap.put(this.f21489s.e() ? this.f21471a.getString(AbstractC1902q.f21940o) : this.f21471a.getString(AbstractC1902q.f21939n), new C4.d() { // from class: com.facebook.react.devsupport.B
                @Override // C4.d
                public final void a() {
                    E.this.C0();
                }
            });
            linkedHashMap.put(this.f21471a.getString(AbstractC1902q.f21943r), new C4.d() { // from class: com.facebook.react.devsupport.C
                @Override // C4.d
                public final void a() {
                    E.this.D0();
                }
            });
            if (this.f21475e.size() > 0) {
                linkedHashMap.putAll(this.f21475e);
            }
            final C4.d[] dVarArr = (C4.d[]) linkedHashMap.values().toArray(new C4.d[0]);
            Activity a10 = this.f21476f.a();
            if (a10 == null || a10.isFinishing()) {
                AbstractC1721a.m("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(a10);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(a10);
            textView.setText(a10.getString(AbstractC1902q.f21930e, p0()));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            String m02 = m0();
            if (m02 != null) {
                TextView textView2 = new TextView(a10);
                textView2.setText(a10.getString(AbstractC1902q.f21931f, m02));
                textView2.setPadding(0, 20, 0, 0);
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                linearLayout.addView(textView2);
            }
            AlertDialog create = new AlertDialog.Builder(a10).setCustomTitle(linearLayout).setAdapter(new e(a10, R.layout.simple_list_item_1, (String[]) linkedHashMap.keySet().toArray(new String[0]), hashSet), new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.D
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    E.this.E0(dVarArr, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.m
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    E.this.F0(dialogInterface);
                }
            }).create();
            this.f21484n = create;
            create.show();
            ReactContext reactContext = this.f21488r;
            if (reactContext != null) {
                ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit("RCTDevMenuShown", null);
            }
        }
    }

    @Override // C4.e
    public void D(ReactContext reactContext) {
        if (reactContext == this.f21488r) {
            O0(null);
        }
    }

    @Override // C4.e
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z0() {
        this.f21474d.y(this.f21488r, this.f21471a.getString(AbstractC1902q.f21938m));
    }

    @Override // C4.e
    public void F(final String str, final ReadableArray readableArray, final int i10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.w
            @Override // java.lang.Runnable
            public final void run() {
                E.this.I0(i10, str, readableArray);
            }
        });
    }

    public void L0(String str, C4.a aVar) {
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        P0(str);
        C1865a.c cVar = new C1865a.c();
        this.f21474d.o(new g(cVar, aVar), this.f21478h, str, cVar);
    }

    public void M0() {
        if (UiThreadUtil.isOnUiThread()) {
            K0();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.l
                @Override // java.lang.Runnable
                public final void run() {
                    E.this.K0();
                }
            });
        }
    }

    public void R0(String str, Throwable th) {
        AbstractC1721a.n("ReactNative", "Exception in native call", th);
        Q0(str, l0.a(th), -1, C4.f.NATIVE);
    }

    @Override // C4.e
    public Activity a() {
        return this.f21476f.a();
    }

    @Override // C4.e
    public View b(String str) {
        return this.f21476f.b(str);
    }

    @Override // C4.e
    public void c(final boolean z10) {
        if (this.f21492v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.s
                @Override // java.lang.Runnable
                public final void run() {
                    E.this.x0(z10);
                }
            });
        }
    }

    @Override // C4.e
    public v4.i d(String str) {
        v4.j jVar = this.f21470E;
        if (jVar == null) {
            return null;
        }
        return jVar.d(str);
    }

    @Override // C4.e
    public void e(View view) {
        this.f21476f.e(view);
    }

    @Override // C4.e
    public void f(final boolean z10) {
        if (this.f21492v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.n
                @Override // java.lang.Runnable
                public final void run() {
                    E.this.w0(z10);
                }
            });
        }
    }

    @Override // C4.e
    public void g(final boolean z10) {
        if (this.f21492v && this.f21489s.m() != z10) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.x
                @Override // java.lang.Runnable
                public final void run() {
                    E.this.y0(z10);
                }
            });
        }
    }

    @Override // C4.e
    public void h() {
        this.f21482l.h();
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception exc) {
        if (this.f21492v) {
            J0(exc);
        } else {
            this.f21480j.handleException(exc);
        }
    }

    @Override // C4.e
    public void i() {
        if (this.f21492v) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.t
                @Override // java.lang.Runnable
                public final void run() {
                    E.this.H0();
                }
            });
        }
    }

    @Override // C4.e
    public void j(String str, e.a aVar) {
        this.f21482l.j(str, aVar);
    }

    public C4.c j0() {
        return this.f21481k;
    }

    @Override // C4.e
    public String k() {
        return this.f21478h.getAbsolutePath();
    }

    public C1874j k0() {
        return this.f21474d;
    }

    @Override // C4.e
    public String l() {
        return this.f21494x;
    }

    public String l0() {
        return this.f21477g;
    }

    @Override // C4.e
    public void m() {
        this.f21474d.h();
    }

    @Override // C4.e
    public boolean n() {
        return this.f21492v;
    }

    public d0 n0() {
        return this.f21476f;
    }

    @Override // C4.e
    public void o() {
        v4.i iVar = this.f21483m;
        if (iVar == null) {
            return;
        }
        iVar.c();
    }

    @Override // C4.e
    public void p(ReactContext reactContext) {
        O0(reactContext);
    }

    protected abstract String p0();

    @Override // C4.e
    public void r(String str, C4.d dVar) {
        this.f21475e.put(str, dVar);
    }

    protected void r0() {
        this.f21481k.c();
        this.f21486p = false;
    }

    @Override // C4.e
    public Pair s(Pair pair) {
        List list = this.f21468C;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                throw null;
            }
        }
        return pair;
    }

    @Override // C4.e
    public void t(boolean z10) {
        this.f21492v = z10;
        M0();
    }

    @Override // C4.e
    public C4.f u() {
        return this.f21496z;
    }

    @Override // C4.e
    public String v() {
        String str = this.f21477g;
        return str == null ? BuildConfig.FLAVOR : this.f21474d.v((String) AbstractC4012a.c(str));
    }

    @Override // C4.e
    public P4.a w() {
        return this.f21489s;
    }

    @Override // C4.e
    public void x(final C4.g gVar) {
        new Runnable() { // from class: com.facebook.react.devsupport.r
            @Override // java.lang.Runnable
            public final void run() {
                E.this.t0(gVar);
            }
        }.run();
    }

    @Override // C4.e
    public C4.i y() {
        return null;
    }

    @Override // C4.e
    public void z() {
        if (this.f21492v) {
            this.f21474d.z();
        }
    }
}
