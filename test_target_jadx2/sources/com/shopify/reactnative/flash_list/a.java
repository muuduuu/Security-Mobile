package com.shopify.reactnative.flash_list;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f29445a;

    /* renamed from: b, reason: collision with root package name */
    private int f29446b;

    /* renamed from: c, reason: collision with root package name */
    private int f29447c;

    /* renamed from: d, reason: collision with root package name */
    private int f29448d;

    /* renamed from: e, reason: collision with root package name */
    private int f29449e;

    /* renamed from: f, reason: collision with root package name */
    private int f29450f;

    /* renamed from: g, reason: collision with root package name */
    private int f29451g;

    /* renamed from: h, reason: collision with root package name */
    private int f29452h;

    /* renamed from: i, reason: collision with root package name */
    private int f29453i;

    /* renamed from: j, reason: collision with root package name */
    private int f29454j;

    private final boolean g(d dVar) {
        int i10 = this.f29446b - this.f29447c;
        if (this.f29445a) {
            if ((dVar.getLeft() >= i10 - this.f29449e || dVar.getRight() >= i10 - this.f29449e) && (dVar.getLeft() <= this.f29448d + i10 || dVar.getRight() <= i10 + this.f29448d)) {
                return true;
            }
        } else if ((dVar.getTop() >= i10 - this.f29449e || dVar.getBottom() >= i10 - this.f29449e) && (dVar.getTop() <= this.f29448d + i10 || dVar.getBottom() <= i10 + this.f29448d)) {
            return true;
        }
        return false;
    }

    public final void a(d[] sortedItems) {
        int max;
        Intrinsics.checkNotNullParameter(sortedItems, "sortedItems");
        this.f29452h = 0;
        int length = sortedItems.length - 1;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            d dVar = sortedItems[i11];
            i11++;
            d dVar2 = sortedItems[i11];
            boolean z10 = dVar2.getIndex() == dVar.getIndex() + 1;
            if (g(dVar) || g(dVar2)) {
                if (this.f29445a) {
                    i12 = Math.max(i13, dVar.getRight());
                    i10 = Math.min(i10, dVar.getLeft());
                    if (z10) {
                        if (dVar.getTop() < dVar2.getTop()) {
                            if (dVar.getBottom() != dVar2.getTop()) {
                                dVar2.setBottom(dVar.getBottom() + dVar2.getHeight());
                                dVar2.setTop(dVar.getBottom());
                            }
                            if (dVar.getLeft() != dVar2.getLeft()) {
                                dVar2.setRight(dVar.getLeft() + dVar2.getWidth());
                                dVar2.setLeft(dVar.getLeft());
                            }
                        } else {
                            dVar2.setRight(dVar2.getWidth() + i12);
                            dVar2.setLeft(i12);
                        }
                    }
                    if (g(dVar2)) {
                        max = Math.max(i12, dVar2.getRight());
                        int i14 = max;
                        i13 = i12;
                        i12 = i14;
                    }
                    i13 = i12;
                } else {
                    i12 = Math.max(i13, dVar.getBottom());
                    i10 = Math.min(i10, dVar.getTop());
                    if (z10) {
                        if (dVar.getLeft() < dVar2.getLeft()) {
                            if (dVar.getRight() != dVar2.getLeft()) {
                                dVar2.setRight(dVar.getRight() + dVar2.getWidth());
                                dVar2.setLeft(dVar.getRight());
                            }
                            if (dVar.getTop() != dVar2.getTop()) {
                                dVar2.setBottom(dVar.getTop() + dVar2.getHeight());
                                dVar2.setTop(dVar.getTop());
                            }
                        } else {
                            dVar2.setBottom(dVar2.getHeight() + i12);
                            dVar2.setTop(i12);
                        }
                    }
                    if (g(dVar2)) {
                        max = Math.max(i12, dVar2.getBottom());
                        int i142 = max;
                        i13 = i12;
                        i12 = i142;
                    }
                    i13 = i12;
                }
            }
            int max2 = Math.max(this.f29452h, this.f29445a ? dVar.getRight() : dVar.getBottom());
            this.f29452h = max2;
            this.f29452h = Math.max(max2, this.f29445a ? dVar2.getRight() : dVar2.getBottom());
        }
        this.f29453i = i12;
        this.f29454j = i10;
    }

    public final int b(int i10, int i11, int i12) {
        int i13 = i10 - this.f29447c;
        int i14 = (this.f29454j - i13) - i11;
        this.f29450f = i14;
        int i15 = (((i13 + this.f29448d) - this.f29449e) - this.f29453i) - i12;
        this.f29451g = i15;
        return Math.max(i14, i15);
    }

    public final int c() {
        return this.f29451g;
    }

    public final int d() {
        return this.f29450f;
    }

    public final boolean e() {
        return this.f29445a;
    }

    public final int f() {
        return this.f29452h;
    }

    public final void h(boolean z10) {
        this.f29445a = z10;
    }

    public final void i(int i10) {
        this.f29452h = i10;
    }

    public final void j(int i10) {
        this.f29447c = i10;
    }

    public final void k(int i10) {
        this.f29449e = i10;
    }

    public final void l(int i10) {
        this.f29446b = i10;
    }

    public final void m(int i10) {
        this.f29448d = i10;
    }
}
