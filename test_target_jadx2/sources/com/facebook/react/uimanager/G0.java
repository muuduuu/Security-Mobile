package com.facebook.react.uimanager;

import a5.C1351a;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import c3.AbstractC1721a;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f22156a = new float[2];

    /* renamed from: b, reason: collision with root package name */
    private static final PointF f22157b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f22158c = new float[2];

    /* renamed from: d, reason: collision with root package name */
    private static final Matrix f22159d = new Matrix();

    private enum a {
        SELF,
        CHILD
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f22160a;

        /* renamed from: b, reason: collision with root package name */
        private final View f22161b;

        public View a() {
            return this.f22161b;
        }

        public int b() {
            return this.f22160a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).b() == this.f22160a;
        }

        public int hashCode() {
            return Integer.valueOf(this.f22160a).hashCode();
        }

        private b(int i10, View view) {
            this.f22160a = i10;
            this.f22161b = view;
        }
    }

    private static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List b(float f10, float f11, ViewGroup viewGroup, float[] fArr) {
        UiThreadUtil.assertOnUiThread();
        fArr[0] = f10;
        fArr[1] = f11;
        List arrayList = new ArrayList();
        View f12 = f(fArr, viewGroup, arrayList);
        if (f12 != null) {
            int i10 = 0;
            while (f12 != null && f12.getId() <= 0) {
                f12 = (View) f12.getParent();
                i10++;
            }
            if (i10 > 0 && i10 <= arrayList.size()) {
                arrayList = arrayList.subList(i10, arrayList.size());
            }
            int h10 = h(f12, fArr[0], fArr[1]);
            if (h10 != f12.getId()) {
                arrayList.add(0, new b(h10, null));
            }
        }
        return arrayList;
    }

    public static int c(float f10, float f11, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View a10;
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        fArr[0] = f10;
        fArr[1] = f11;
        View f12 = f(fArr, viewGroup, null);
        if (f12 == null || (a10 = a(f12)) == null) {
            return id2;
        }
        if (iArr != null) {
            iArr[0] = a10.getId();
        }
        return h(a10, fArr[0], fArr[1]);
    }

    public static int d(float f10, float f11, ViewGroup viewGroup) {
        return c(f10, f11, viewGroup, f22156a, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View e(float[] fArr, View view, EnumSet enumSet, List list) {
        if (enumSet.contains(a.CHILD) && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!i(fArr[0], fArr[1], view)) {
                if (view instanceof InterfaceC1962p0) {
                    if (C1351a.a(view.getId()) == 2 && !j(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((InterfaceC1962p0) view).getOverflow();
                    if ("hidden".equals(overflow) || "scroll".equals(overflow)) {
                        return null;
                    }
                }
                if (viewGroup.getClipChildren()) {
                    return null;
                }
            }
            int childCount = viewGroup.getChildCount();
            InterfaceC1979y0 interfaceC1979y0 = viewGroup instanceof InterfaceC1979y0 ? (InterfaceC1979y0) viewGroup : null;
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = viewGroup.getChildAt(interfaceC1979y0 != null ? interfaceC1979y0.getZIndexMappedChildIndex(i10) : i10);
                PointF pointF = f22157b;
                g(fArr[0], fArr[1], viewGroup, childAt, pointF);
                float f10 = fArr[0];
                float f11 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View f12 = f(fArr, childAt, list);
                if (f12 != null) {
                    return f12;
                }
                fArr[0] = f10;
                fArr[1] = f11;
            }
        }
        if (enumSet.contains(a.SELF) && i(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View f(float[] fArr, View view, List list) {
        EnumC1946h0 pointerEvents = view instanceof InterfaceC1964q0 ? ((InterfaceC1964q0) view).getPointerEvents() : EnumC1946h0.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == EnumC1946h0.AUTO) {
                pointerEvents = EnumC1946h0.BOX_NONE;
            } else if (pointerEvents == EnumC1946h0.BOX_ONLY) {
                pointerEvents = EnumC1946h0.NONE;
            }
        }
        if (pointerEvents == EnumC1946h0.NONE) {
            return null;
        }
        if (pointerEvents == EnumC1946h0.BOX_ONLY) {
            View e10 = e(fArr, view, EnumSet.of(a.SELF), list);
            if (e10 != null && list != null) {
                list.add(new b(view.getId(), view));
            }
            return e10;
        }
        if (pointerEvents == EnumC1946h0.BOX_NONE) {
            View e11 = e(fArr, view, EnumSet.of(a.CHILD), list);
            if (e11 != null) {
                if (list != null) {
                    list.add(new b(view.getId(), view));
                }
                return e11;
            }
            if (!(view instanceof InterfaceC1956m0) || !i(fArr[0], fArr[1], view) || ((InterfaceC1956m0) view).reactTagForTouch(fArr[0], fArr[1]) == view.getId()) {
                return null;
            }
            if (list != null) {
                list.add(new b(view.getId(), view));
            }
            return view;
        }
        if (pointerEvents != EnumC1946h0.AUTO) {
            AbstractC1721a.J("ReactNative", "Unknown pointer event type: " + pointerEvents.toString());
        }
        if ((view instanceof InterfaceC1958n0) && i(fArr[0], fArr[1], view) && ((InterfaceC1958n0) view).interceptsTouchEvent(fArr[0], fArr[1])) {
            if (list != null) {
                list.add(new b(view.getId(), view));
            }
            return view;
        }
        View e12 = e(fArr, view, EnumSet.of(a.SELF, a.CHILD), list);
        if (e12 != null && list != null) {
            list.add(new b(view.getId(), view));
        }
        return e12;
    }

    private static void g(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f22158c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f22159d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f12 = fArr[0];
            scrollY = fArr[1];
            scrollX = f12;
        }
        pointF.set(scrollX, scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int h(View view, float f10, float f11) {
        return view instanceof InterfaceC1956m0 ? ((InterfaceC1956m0) view).reactTagForTouch(f10, f11) : view.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean i(float f10, float f11, View view) {
        if (view instanceof Y4.c) {
            Y4.c cVar = (Y4.c) view;
            if (cVar.getHitSlopRect() != null) {
                Rect hitSlopRect = cVar.getHitSlopRect();
                return f10 >= ((float) (-hitSlopRect.left)) && f10 < ((float) (view.getWidth() + hitSlopRect.right)) && f11 >= ((float) (-hitSlopRect.top)) && f11 < ((float) (view.getHeight() + hitSlopRect.bottom));
            }
        }
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean j(float f10, float f11, View view) {
        if (!(view instanceof InterfaceC1962p0)) {
            return false;
        }
        Rect overflowInset = ((InterfaceC1962p0) view).getOverflowInset();
        return f10 >= ((float) overflowInset.left) && f10 < ((float) (view.getWidth() - overflowInset.right)) && f11 >= ((float) overflowInset.top) && f11 < ((float) (view.getHeight() - overflowInset.bottom));
    }
}
