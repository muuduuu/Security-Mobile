package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import c3.AbstractC1721a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f22320a;

    /* renamed from: b, reason: collision with root package name */
    private int f22321b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int[] f22322c;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
            if (viewZIndex == null) {
                viewZIndex = r0;
            }
            Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view2);
            return viewZIndex.intValue() - (viewZIndex2 != null ? viewZIndex2 : 0).intValue();
        }
    }

    public b1(ViewGroup viewGroup) {
        this.f22320a = viewGroup;
    }

    public int a(int i10, int i11) {
        int[] iArr = this.f22322c;
        if (iArr != null && (i11 >= iArr.length || iArr[i11] >= i10)) {
            AbstractC1721a.L("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i10), Integer.valueOf(i11));
            e();
        }
        if (this.f22322c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(this.f22320a.getChildAt(i12));
            }
            Collections.sort(arrayList, new a());
            this.f22322c = new int[i10];
            for (int i13 = 0; i13 < i10; i13++) {
                this.f22322c[i13] = this.f22320a.indexOfChild((View) arrayList.get(i13));
            }
        }
        return this.f22322c[i11];
    }

    public void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f22321b++;
        }
        this.f22322c = null;
    }

    public void c(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.f22321b--;
        }
        this.f22322c = null;
    }

    public boolean d() {
        return this.f22321b > 0;
    }

    public void e() {
        this.f22321b = 0;
        for (int i10 = 0; i10 < this.f22320a.getChildCount(); i10++) {
            if (ViewGroupManager.getViewZIndex(this.f22320a.getChildAt(i10)) != null) {
                this.f22321b++;
            }
        }
        this.f22322c = null;
    }
}
