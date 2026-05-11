package z0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5229B {

    /* renamed from: a, reason: collision with root package name */
    private final Object f45652a;

    /* renamed from: z0.B$a */
    static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        final C5229B f45653a;

        a(C5229B c5229b) {
            this.f45653a = c5229b;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            C5228A b10 = this.f45653a.b(i10);
            if (b10 == null) {
                return null;
            }
            return b10.X0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i10) {
            List c10 = this.f45653a.c(str, i10);
            if (c10 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c10.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(((C5228A) c10.get(i11)).X0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i10) {
            C5228A d10 = this.f45653a.d(i10);
            if (d10 == null) {
                return null;
            }
            return d10.X0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f45653a.f(i10, i11, bundle);
        }
    }

    /* renamed from: z0.B$b */
    static class b extends a {
        b(C5229B c5229b) {
            super(c5229b);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f45653a.a(i10, C5228A.Y0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C5229B() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f45652a = new b(this);
        } else {
            this.f45652a = new a(this);
        }
    }

    public C5228A b(int i10) {
        return null;
    }

    public List c(String str, int i10) {
        return null;
    }

    public C5228A d(int i10) {
        return null;
    }

    public Object e() {
        return this.f45652a;
    }

    public boolean f(int i10, int i11, Bundle bundle) {
        return false;
    }

    public C5229B(Object obj) {
        this.f45652a = obj;
    }

    public void a(int i10, C5228A c5228a, String str, Bundle bundle) {
    }
}
