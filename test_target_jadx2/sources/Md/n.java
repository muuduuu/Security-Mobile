package Md;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
abstract /* synthetic */ class n {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1 f6406a = new Function1() { // from class: Md.l
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Object d10;
            d10 = n.d(obj);
            return d10;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Function2 f6407b = new Function2() { // from class: Md.m
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            boolean c10;
            c10 = n.c(obj, obj2);
            return Boolean.valueOf(c10);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.b(obj, obj2);
    }

    public static final e e(e eVar) {
        return eVar instanceof w ? eVar : f(eVar, f6406a, f6407b);
    }

    private static final e f(e eVar, Function1 function1, Function2 function2) {
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            if (dVar.f6392b == function1 && dVar.f6393c == function2) {
                return eVar;
            }
        }
        return new d(eVar, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }
}
