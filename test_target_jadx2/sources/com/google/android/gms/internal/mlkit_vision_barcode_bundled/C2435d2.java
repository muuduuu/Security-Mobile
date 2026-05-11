package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2435d2 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f24856a = new ArrayDeque();

    /* synthetic */ C2435d2(AbstractC2430c2 abstractC2430c2) {
    }

    static /* bridge */ /* synthetic */ E0 a(C2435d2 c2435d2, E0 e02, E0 e03) {
        c2435d2.b(e02);
        c2435d2.b(e03);
        E0 e04 = (E0) c2435d2.f24856a.pop();
        while (!c2435d2.f24856a.isEmpty()) {
            e04 = new C2455h2((E0) c2435d2.f24856a.pop(), e04);
        }
        return e04;
    }

    private final void b(E0 e02) {
        AbstractC2450g2 abstractC2450g2;
        if (!e02.r()) {
            if (!(e02 instanceof C2455h2)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(e02.getClass())));
            }
            C2455h2 c2455h2 = (C2455h2) e02;
            b(c2455h2.f24871f);
            b(c2455h2.f24872g);
            return;
        }
        int c10 = c(e02.j());
        int S10 = C2455h2.S(c10 + 1);
        if (this.f24856a.isEmpty() || ((E0) this.f24856a.peek()).j() >= S10) {
            this.f24856a.push(e02);
            return;
        }
        int S11 = C2455h2.S(c10);
        E0 e03 = (E0) this.f24856a.pop();
        while (true) {
            abstractC2450g2 = null;
            if (this.f24856a.isEmpty() || ((E0) this.f24856a.peek()).j() >= S11) {
                break;
            } else {
                e03 = new C2455h2((E0) this.f24856a.pop(), e03);
            }
        }
        C2455h2 c2455h22 = new C2455h2(e03, e02);
        while (!this.f24856a.isEmpty()) {
            if (((E0) this.f24856a.peek()).j() >= C2455h2.S(c(c2455h22.j()) + 1)) {
                break;
            } else {
                c2455h22 = new C2455h2((E0) this.f24856a.pop(), c2455h22);
            }
        }
        this.f24856a.push(c2455h22);
    }

    private static final int c(int i10) {
        int binarySearch = Arrays.binarySearch(C2455h2.f24869j, i10);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
