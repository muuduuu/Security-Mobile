package T9;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f9504a = new c();

    private c() {
    }

    private final EditText b(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        int indexOfChild = viewGroup.indexOfChild(view);
        int i11 = i10 > 0 ? indexOfChild + 1 : indexOfChild - 1;
        int childCount = i10 > 0 ? viewGroup.getChildCount() : -1;
        while (i11 != childCount) {
            View childAt = viewGroup.getChildAt(i11);
            Intrinsics.d(childAt);
            EditText d10 = d(childAt, i10);
            if (d10 != null) {
                return d10;
            }
            i11 += i10;
        }
        return b(viewGroup, i10);
    }

    private final EditText c(ViewGroup viewGroup, int i10) {
        int childCount = viewGroup.getChildCount();
        kotlin.ranges.a p10 = i10 > 0 ? d.p(0, childCount) : d.m(childCount - 1, 0);
        int c10 = p10.c();
        int e10 = p10.e();
        int h10 = p10.h();
        if ((h10 <= 0 || c10 > e10) && (h10 >= 0 || e10 > c10)) {
            return null;
        }
        while (true) {
            View childAt = viewGroup.getChildAt(c10);
            Intrinsics.d(childAt);
            EditText d10 = d(childAt, i10);
            if (d10 != null) {
                return d10;
            }
            if (c10 == e10) {
                return null;
            }
            c10 += h10;
        }
    }

    private final EditText d(View view, int i10) {
        if (i(view)) {
            Intrinsics.e(view, "null cannot be cast to non-null type android.widget.EditText");
            return (EditText) view;
        }
        if (view instanceof ViewGroup) {
            return c((ViewGroup) view, i10);
        }
        return null;
    }

    private final EditText e(View view) {
        return b(view, 1);
    }

    private final EditText f(View view) {
        return b(view, -1);
    }

    private static final void h(List list, View view) {
        if (f9504a.i(view)) {
            Intrinsics.e(view, "null cannot be cast to non-null type android.widget.EditText");
            list.add((EditText) view);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                h(list, viewGroup.getChildAt(i10));
            }
        }
    }

    private final boolean i(View view) {
        return (view instanceof EditText) && ((EditText) view).isEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(EditText editText) {
        L9.d.c(editText);
    }

    public final List g(View view) {
        ArrayList arrayList = new ArrayList();
        h(arrayList, view);
        return arrayList;
    }

    public final void j(String direction, View view) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(view, "view");
        final EditText e10 = Intrinsics.b(direction, "next") ? e(view) : f(view);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: T9.b
            @Override // java.lang.Runnable
            public final void run() {
                c.k(e10);
            }
        });
    }
}
