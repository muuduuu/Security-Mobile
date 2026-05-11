package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import s0.AbstractC4304c;
import z0.C5228A;
import z0.C5229B;

/* renamed from: androidx.core.view.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1483a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f16084c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f16085a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f16086b;

    /* renamed from: androidx.core.view.a$a, reason: collision with other inner class name */
    static final class C0272a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final C1483a f16087a;

        C0272a(C1483a c1483a) {
            this.f16087a = c1483a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f16087a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C5229B b10 = this.f16087a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f16087a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C5228A Y02 = C5228A.Y0(accessibilityNodeInfo);
            Y02.L0(AbstractC1484a0.X(view));
            Y02.A0(AbstractC1484a0.S(view));
            Y02.G0(AbstractC1484a0.o(view));
            Y02.R0(AbstractC1484a0.I(view));
            this.f16087a.g(view, Y02);
            Y02.f(accessibilityNodeInfo.getText(), view);
            List c10 = C1483a.c(view);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                Y02.b((C5228A.a) c10.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f16087a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f16087a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f16087a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f16087a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f16087a.m(view, accessibilityEvent);
        }
    }

    public C1483a() {
        this(f16084c);
    }

    static List c(View view) {
        List list = (List) view.getTag(AbstractC4304c.f40694H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] r10 = C5228A.r(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; r10 != null && i10 < r10.length; i10++) {
                if (clickableSpan.equals(r10[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC4304c.f40695I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f16085a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C5229B b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f16085a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C5229B(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f16086b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f16085a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, C5228A c5228a) {
        this.f16085a.onInitializeAccessibilityNodeInfo(view, c5228a.X0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f16085a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f16085a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List c10 = c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= c10.size()) {
                break;
            }
            C5228A.a aVar = (C5228A.a) c10.get(i11);
            if (aVar.b() == i10) {
                z10 = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10) {
            z10 = this.f16085a.performAccessibilityAction(view, i10, bundle);
        }
        return (z10 || i10 != AbstractC4304c.f40706a || bundle == null) ? z10 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f16085a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f16085a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1483a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f16085a = accessibilityDelegate;
        this.f16086b = new C0272a(this);
    }
}
