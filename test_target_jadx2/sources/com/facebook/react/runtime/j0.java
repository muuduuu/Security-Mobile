package com.facebook.react.runtime;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class j0 implements E4.a {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f22094a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f22095b;

    /* renamed from: c, reason: collision with root package name */
    private final E4.b f22096c;

    /* renamed from: d, reason: collision with root package name */
    private Context f22097d;

    public j0(Context context, String str, Bundle bundle) {
        this(new SurfaceHandlerBinding(str), context);
        this.f22096c.setProps(bundle == null ? new WritableNativeMap() : (NativeMap) Arguments.fromBundle(bundle));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f22096c.setLayoutConstraints(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE), 0, 0, g(context), p(context), k(context));
    }

    public static j0 f(Context context, String str, Bundle bundle) {
        j0 j0Var = new j0(context, str, bundle);
        j0Var.d(new k0(context, j0Var));
        return j0Var;
    }

    private static boolean g(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().d(context);
    }

    private static float k(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static boolean p(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        k0 k0Var = (k0) a();
        if (k0Var != null) {
            k0Var.removeAllViews();
            k0Var.setId(-1);
        }
    }

    @Override // E4.a
    public ViewGroup a() {
        return (ViewGroup) this.f22094a.get();
    }

    public void c(ReactHostImpl reactHostImpl) {
        if (!androidx.camera.view.i.a(this.f22095b, null, reactHostImpl)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        }
    }

    public void d(k0 k0Var) {
        if (!androidx.camera.view.i.a(this.f22094a, null, k0Var)) {
            throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
        }
        this.f22097d = k0Var.getContext();
    }

    public void e() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.runtime.i0
            @Override // java.lang.Runnable
            public final void run() {
                j0.this.r();
            }
        });
    }

    public Context h() {
        return this.f22097d;
    }

    EventDispatcher i() {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f22095b.get();
        if (reactHostImpl == null) {
            return null;
        }
        return reactHostImpl.q0();
    }

    public String j() {
        return this.f22096c.getModuleName();
    }

    ReactHostImpl l() {
        return (ReactHostImpl) this.f22095b.get();
    }

    E4.b m() {
        return this.f22096c;
    }

    public int n() {
        return this.f22096c.getSurfaceId();
    }

    boolean o() {
        return this.f22095b.get() != null;
    }

    public boolean q() {
        return this.f22096c.isRunning();
    }

    synchronized void s(int i10, int i11, int i12, int i13) {
        this.f22096c.setLayoutConstraints(i10, i11, i12, i13, g(this.f22097d), p(this.f22097d), k(this.f22097d));
    }

    @Override // E4.a
    public D4.a start() {
        if (this.f22094a.get() == null) {
            return W4.d.l(new IllegalStateException("Trying to call ReactSurface.start(), but view is not created."));
        }
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f22095b.get();
        return reactHostImpl == null ? W4.d.l(new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached.")) : reactHostImpl.M1(this);
    }

    @Override // E4.a
    public D4.a stop() {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f22095b.get();
        return reactHostImpl == null ? W4.d.l(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached.")) : reactHostImpl.O1(this);
    }

    j0(E4.b bVar, Context context) {
        this.f22094a = new AtomicReference(null);
        this.f22095b = new AtomicReference(null);
        this.f22096c = bVar;
        this.f22097d = context;
    }
}
