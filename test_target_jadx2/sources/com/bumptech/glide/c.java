package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.bumptech.glide.module.AppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l2.InterfaceC3600b;
import l2.InterfaceC3602d;
import m2.InterfaceC3646h;
import x2.o;
import y2.C5166c;
import y2.InterfaceC5164a;

/* loaded from: classes.dex */
public class c implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    private static volatile c f20203k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile boolean f20204l;

    /* renamed from: a, reason: collision with root package name */
    private final k2.k f20205a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3602d f20206b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3646h f20207c;

    /* renamed from: d, reason: collision with root package name */
    private final e f20208d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3600b f20209e;

    /* renamed from: f, reason: collision with root package name */
    private final o f20210f;

    /* renamed from: g, reason: collision with root package name */
    private final x2.c f20211g;

    /* renamed from: i, reason: collision with root package name */
    private final a f20213i;

    /* renamed from: h, reason: collision with root package name */
    private final List f20212h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private g f20214j = g.NORMAL;

    public interface a {
        com.bumptech.glide.request.h c();
    }

    c(Context context, k2.k kVar, InterfaceC3646h interfaceC3646h, InterfaceC3602d interfaceC3602d, InterfaceC3600b interfaceC3600b, o oVar, x2.c cVar, int i10, a aVar, Map map, List list, List list2, AppGlideModule appGlideModule, f fVar) {
        this.f20205a = kVar;
        this.f20206b = interfaceC3602d;
        this.f20209e = interfaceC3600b;
        this.f20207c = interfaceC3646h;
        this.f20210f = oVar;
        this.f20211g = cVar;
        this.f20213i = aVar;
        this.f20208d = new e(context, interfaceC3600b, j.d(this, list2, appGlideModule), new A2.b(), aVar, map, list, kVar, fVar, i10);
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f20204l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f20204l = true;
        try {
            n(context, generatedAppGlideModule);
        } finally {
            f20204l = false;
        }
    }

    public static c d(Context context) {
        if (f20203k == null) {
            GeneratedAppGlideModule e10 = e(context.getApplicationContext());
            synchronized (c.class) {
                try {
                    if (f20203k == null) {
                        a(context, e10);
                    }
                } finally {
                }
            }
        }
        return f20203k;
    }

    private static GeneratedAppGlideModule e(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e10) {
            r(e10);
            return null;
        } catch (InstantiationException e11) {
            r(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            r(e12);
            return null;
        } catch (InvocationTargetException e13) {
            r(e13);
            return null;
        }
    }

    private static o m(Context context) {
        D2.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return d(context).l();
    }

    private static void n(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        o(context, new d(), generatedAppGlideModule);
    }

    private static void o(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            emptyList = new C5166c(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set d10 = generatedAppGlideModule.d();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                InterfaceC5164a interfaceC5164a = (InterfaceC5164a) it.next();
                if (d10.contains(interfaceC5164a.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + interfaceC5164a);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((InterfaceC5164a) it2.next()).getClass());
            }
        }
        dVar.c(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = emptyList.iterator();
        while (it3.hasNext()) {
            ((InterfaceC5164a) it3.next()).a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, dVar);
        }
        c a10 = dVar.a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(a10);
        f20203k = a10;
    }

    private static void r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static l u(Activity activity) {
        return v(activity.getApplicationContext());
    }

    public static l v(Context context) {
        return m(context).d(context);
    }

    public void b() {
        D2.l.a();
        this.f20205a.e();
    }

    public void c() {
        D2.l.b();
        this.f20207c.b();
        this.f20206b.b();
        this.f20209e.b();
    }

    public InterfaceC3600b f() {
        return this.f20209e;
    }

    public InterfaceC3602d g() {
        return this.f20206b;
    }

    x2.c h() {
        return this.f20211g;
    }

    public Context i() {
        return this.f20208d.getBaseContext();
    }

    e j() {
        return this.f20208d;
    }

    public i k() {
        return this.f20208d.h();
    }

    public o l() {
        return this.f20210f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        s(i10);
    }

    void p(l lVar) {
        synchronized (this.f20212h) {
            try {
                if (this.f20212h.contains(lVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f20212h.add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q(A2.d dVar) {
        synchronized (this.f20212h) {
            try {
                Iterator it = this.f20212h.iterator();
                while (it.hasNext()) {
                    if (((l) it.next()).B(dVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(int i10) {
        D2.l.b();
        synchronized (this.f20212h) {
            try {
                Iterator it = this.f20212h.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).onTrimMemory(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20207c.a(i10);
        this.f20206b.a(i10);
        this.f20209e.a(i10);
    }

    void t(l lVar) {
        synchronized (this.f20212h) {
            try {
                if (!this.f20212h.contains(lVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f20212h.remove(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
