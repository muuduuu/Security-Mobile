package Ec;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;

/* renamed from: Ec.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0834m implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final Function2 f2061a;

    public C0834m(Function2 function2) {
        this.f2061a = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int H10;
        H10 = n.H(this.f2061a, obj, obj2);
        return H10;
    }
}
