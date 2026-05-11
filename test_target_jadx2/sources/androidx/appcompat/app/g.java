package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.g;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import j0.C3477b;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    static c f13155a = new c(new d());

    /* renamed from: b, reason: collision with root package name */
    private static int f13156b = -100;

    /* renamed from: c, reason: collision with root package name */
    private static androidx.core.os.i f13157c = null;

    /* renamed from: d, reason: collision with root package name */
    private static androidx.core.os.i f13158d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f13159e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f13160f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final C3477b f13161g = new C3477b();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f13162h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f13163i = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Object f13164a = new Object();

        /* renamed from: b, reason: collision with root package name */
        final Queue f13165b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        final Executor f13166c;

        /* renamed from: d, reason: collision with root package name */
        Runnable f13167d;

        c(Executor executor) {
            this.f13166c = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        protected void c() {
            synchronized (this.f13164a) {
                try {
                    Runnable runnable = (Runnable) this.f13165b.poll();
                    this.f13167d = runnable;
                    if (runnable != null) {
                        this.f13166c.execute(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f13164a) {
                try {
                    this.f13165b.add(new Runnable() { // from class: androidx.appcompat.app.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.c.this.b(runnable);
                        }
                    });
                    if (this.f13167d == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    g() {
    }

    static void H(g gVar) {
        synchronized (f13162h) {
            I(gVar);
        }
    }

    private static void I(g gVar) {
        synchronized (f13162h) {
            try {
                Iterator it = f13161g.iterator();
                while (it.hasNext()) {
                    g gVar2 = (g) ((WeakReference) it.next()).get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void N(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f13156b != i10) {
            f13156b = i10;
            g();
        }
    }

    static void T(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().e()) {
                    String b10 = androidx.core.app.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(b10));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void U(final Context context) {
        if (x(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f13160f) {
                    return;
                }
                f13155a.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.y(context);
                    }
                });
                return;
            }
            synchronized (f13163i) {
                try {
                    androidx.core.os.i iVar = f13157c;
                    if (iVar == null) {
                        if (f13158d == null) {
                            f13158d = androidx.core.os.i.b(androidx.core.app.e.b(context));
                        }
                        if (f13158d.e()) {
                        } else {
                            f13157c = f13158d;
                        }
                    } else if (!iVar.equals(f13158d)) {
                        androidx.core.os.i iVar2 = f13157c;
                        f13158d = iVar2;
                        androidx.core.app.e.a(context, iVar2.g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static void d(g gVar) {
        synchronized (f13162h) {
            I(gVar);
            f13161g.add(new WeakReference(gVar));
        }
    }

    private static void g() {
        synchronized (f13162h) {
            try {
                Iterator it = f13161g.iterator();
                while (it.hasNext()) {
                    g gVar = (g) ((WeakReference) it.next()).get();
                    if (gVar != null) {
                        gVar.f();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g j(Activity activity, e eVar) {
        return new i(activity, eVar);
    }

    public static g k(Dialog dialog, e eVar) {
        return new i(dialog, eVar);
    }

    public static androidx.core.os.i m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object r10 = r();
            if (r10 != null) {
                return androidx.core.os.i.i(b.a(r10));
            }
        } else {
            androidx.core.os.i iVar = f13157c;
            if (iVar != null) {
                return iVar;
            }
        }
        return androidx.core.os.i.d();
    }

    public static int o() {
        return f13156b;
    }

    static Object r() {
        Context n10;
        Iterator it = f13161g.iterator();
        while (it.hasNext()) {
            g gVar = (g) ((WeakReference) it.next()).get();
            if (gVar != null && (n10 = gVar.n()) != null) {
                return n10.getSystemService("locale");
            }
        }
        return null;
    }

    static androidx.core.os.i t() {
        return f13157c;
    }

    static boolean x(Context context) {
        if (f13159e == null) {
            try {
                Bundle bundle = u.a(context).metaData;
                if (bundle != null) {
                    f13159e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f13159e = Boolean.FALSE;
            }
        }
        return f13159e.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(Context context) {
        T(context);
        f13160f = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E(Bundle bundle);

    public abstract void F();

    public abstract void G();

    public abstract boolean J(int i10);

    public abstract void K(int i10);

    public abstract void L(View view);

    public abstract void M(View view, ViewGroup.LayoutParams layoutParams);

    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void P(Toolbar toolbar);

    public abstract void Q(int i10);

    public abstract void R(CharSequence charSequence);

    public abstract androidx.appcompat.view.b S(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    public void h(Context context) {
    }

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i10);

    public abstract Context n();

    public abstract InterfaceC1398b p();

    public abstract int q();

    public abstract MenuInflater s();

    public abstract AbstractC1397a u();

    public abstract void v();

    public abstract void w();

    public abstract void z(Configuration configuration);
}
