package com.facebook.react.views.scroll;

import a5.C1351a;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.L0;
import com.facebook.react.views.scroll.f;
import com.facebook.react.views.view.j;
import java.lang.ref.WeakReference;
import r4.AbstractC4012a;

/* loaded from: classes2.dex */
class a implements UIManagerListener {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f22604a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f22605b;

    /* renamed from: c, reason: collision with root package name */
    private b f22606c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference f22607d = null;

    /* renamed from: e, reason: collision with root package name */
    private Rect f22608e = null;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22609f = false;

    /* renamed from: com.facebook.react.views.scroll.a$a, reason: collision with other inner class name */
    class RunnableC0387a implements Runnable {
        RunnableC0387a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f22611a;

        /* renamed from: b, reason: collision with root package name */
        public final Integer f22612b;

        b(int i10, Integer num) {
            this.f22611a = i10;
            this.f22612b = num;
        }

        static b a(ReadableMap readableMap) {
            return new b(readableMap.getInt("minIndexForVisible"), readableMap.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold")) : null);
        }
    }

    public a(ViewGroup viewGroup, boolean z10) {
        this.f22604a = viewGroup;
        this.f22605b = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        j c10;
        float y10;
        int height;
        if (this.f22606c == null || (c10 = c()) == null) {
            return;
        }
        int scrollX = this.f22605b ? this.f22604a.getScrollX() : this.f22604a.getScrollY();
        for (int i10 = this.f22606c.f22611a; i10 < c10.getChildCount(); i10++) {
            View childAt = c10.getChildAt(i10);
            if (this.f22605b) {
                y10 = childAt.getX();
                height = childAt.getWidth();
            } else {
                y10 = childAt.getY();
                height = childAt.getHeight();
            }
            if (y10 + height > scrollX || i10 == c10.getChildCount() - 1) {
                this.f22607d = new WeakReference(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.f22608e = rect;
                return;
            }
        }
    }

    private j c() {
        return (j) this.f22604a.getChildAt(0);
    }

    private UIManager d() {
        return (UIManager) AbstractC4012a.c(L0.g((ReactContext) this.f22604a.getContext(), C1351a.a(this.f22604a.getId())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() {
        WeakReference weakReference;
        View view;
        if (this.f22606c == null || (weakReference = this.f22607d) == null || this.f22608e == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (this.f22605b) {
            int i10 = rect.left - this.f22608e.left;
            if (i10 != 0) {
                int scrollX = this.f22604a.getScrollX();
                ViewGroup viewGroup = this.f22604a;
                ((f.d) viewGroup).b(i10 + scrollX, viewGroup.getScrollY());
                this.f22608e = rect;
                Integer num = this.f22606c.f22612b;
                if (num == null || scrollX > num.intValue()) {
                    return;
                }
                ViewGroup viewGroup2 = this.f22604a;
                ((f.d) viewGroup2).c(0, viewGroup2.getScrollY());
                return;
            }
            return;
        }
        int i11 = rect.top - this.f22608e.top;
        if (i11 != 0) {
            int scrollY = this.f22604a.getScrollY();
            ViewGroup viewGroup3 = this.f22604a;
            ((f.d) viewGroup3).b(viewGroup3.getScrollX(), i11 + scrollY);
            this.f22608e = rect;
            Integer num2 = this.f22606c.f22612b;
            if (num2 == null || scrollY > num2.intValue()) {
                return;
            }
            ViewGroup viewGroup4 = this.f22604a;
            ((f.d) viewGroup4).c(viewGroup4.getScrollX(), 0);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
    }

    public void e(b bVar) {
        this.f22606c = bVar;
    }

    public void f() {
        if (this.f22609f) {
            return;
        }
        this.f22609f = true;
        d().addUIManagerEventListener(this);
    }

    public void g() {
        if (this.f22609f) {
            this.f22609f = false;
            d().removeUIManagerEventListener(this);
        }
    }

    public void h() {
        if (C1351a.a(this.f22604a.getId()) == 2) {
            return;
        }
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        UiThreadUtil.runOnUiThread(new RunnableC0387a());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
        b();
    }
}
