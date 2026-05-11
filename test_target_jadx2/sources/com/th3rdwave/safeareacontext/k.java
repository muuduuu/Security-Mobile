package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.E0;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xc.y;

/* loaded from: classes2.dex */
public final class k extends com.facebook.react.views.view.j implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    private o f30103a;

    /* renamed from: b, reason: collision with root package name */
    private a f30104b;

    /* renamed from: c, reason: collision with root package name */
    private m f30105c;

    /* renamed from: d, reason: collision with root package name */
    private View f30106d;

    /* renamed from: e, reason: collision with root package name */
    private E0 f30107e;

    public k(Context context) {
        super(context);
        this.f30103a = o.PADDING;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View t() {
        for (ViewParent viewParent = getParent(); viewParent != 0; viewParent = viewParent.getParent()) {
            if (viewParent instanceof f) {
                return (View) viewParent;
            }
        }
        return this;
    }

    private final boolean u() {
        a e10;
        View view = this.f30106d;
        if (view == null || (e10 = h.e(view)) == null || Intrinsics.b(this.f30104b, e10)) {
            return false;
        }
        this.f30104b = e10;
        v();
        return true;
    }

    private final void v() {
        a aVar = this.f30104b;
        if (aVar != null) {
            m mVar = this.f30105c;
            if (mVar == null) {
                l lVar = l.ADDITIVE;
                mVar = new m(lVar, lVar, lVar, lVar);
            }
            E0 stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putMap("insets", q.b(aVar));
                stateWrapper.updateState(createMap);
                return;
            }
            n nVar = new n(aVar, this.f30103a, mVar);
            ReactContext a10 = r.a(this);
            final UIManagerModule uIManagerModule = (UIManagerModule) a10.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), nVar);
                a10.runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.w(UIManagerModule.this);
                    }
                });
                x();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().m(-1);
    }

    private final void x() {
        final y yVar = new y();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition newCondition = reentrantLock.newCondition();
        long nanoTime = System.nanoTime();
        r.a(this).runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.j
            @Override // java.lang.Runnable
            public final void run() {
                k.y(reentrantLock, yVar, newCondition);
            }
        });
        reentrantLock.lock();
        long j10 = 0;
        while (!yVar.f44999a && j10 < 500000000) {
            try {
                try {
                    newCondition.awaitNanos(500000000L);
                } catch (InterruptedException unused) {
                    yVar.f44999a = true;
                }
                j10 += System.nanoTime() - nanoTime;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        Unit unit = Unit.f36324a;
        reentrantLock.unlock();
        if (j10 >= 500000000) {
            Log.w("SafeAreaView", "Timed out waiting for layout.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(ReentrantLock lock, y done, Condition condition) {
        Intrinsics.checkNotNullParameter(lock, "$lock");
        Intrinsics.checkNotNullParameter(done, "$done");
        lock.lock();
        try {
            if (!done.f44999a) {
                done.f44999a = true;
                condition.signal();
            }
            Unit unit = Unit.f36324a;
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final E0 getStateWrapper() {
        return this.f30107e;
    }

    @Override // com.facebook.react.views.view.j, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View t10 = t();
        this.f30106d = t10;
        if (t10 != null && (viewTreeObserver = t10.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f30106d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f30106d = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean u10 = u();
        if (u10) {
            requestLayout();
        }
        return !u10;
    }

    public final void setEdges(m edges) {
        Intrinsics.checkNotNullParameter(edges, "edges");
        this.f30105c = edges;
        v();
    }

    public final void setMode(o mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f30103a = mode;
        v();
    }

    public final void setStateWrapper(E0 e02) {
        this.f30107e = e02;
    }
}
