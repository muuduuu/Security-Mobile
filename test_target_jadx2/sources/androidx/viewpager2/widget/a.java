package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f18017b;

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f18018a;

    /* renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    class C0309a implements Comparator {
        C0309a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f18017b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.f18018a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i10;
        int bottom;
        int i11;
        int J10 = this.f18018a.J();
        if (J10 == 0) {
            return true;
        }
        boolean z10 = this.f18018a.l2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, J10, 2);
        for (int i12 = 0; i12 < J10; i12++) {
            View I10 = this.f18018a.I(i12);
            if (I10 == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = I10.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f18017b;
            int[] iArr2 = iArr[i12];
            if (z10) {
                top = I10.getLeft();
                i10 = marginLayoutParams.leftMargin;
            } else {
                top = I10.getTop();
                i10 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i10;
            int[] iArr3 = iArr[i12];
            if (z10) {
                bottom = I10.getRight();
                i11 = marginLayoutParams.rightMargin;
            } else {
                bottom = I10.getBottom();
                i11 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i11;
        }
        Arrays.sort(iArr, new C0309a());
        for (int i13 = 1; i13 < J10; i13++) {
            if (iArr[i13 - 1][1] != iArr[i13][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i14 = iArr4[1];
        int i15 = iArr4[0];
        return i15 <= 0 && iArr[J10 - 1][1] >= i14 - i15;
    }

    private boolean b() {
        int J10 = this.f18018a.J();
        for (int i10 = 0; i10 < J10; i10++) {
            if (c(this.f18018a.I(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f18018a.J() <= 1) && b();
    }
}
