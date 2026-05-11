package Nd;

import kotlin.jvm.internal.Intrinsics;
import wc.InterfaceC5068n;

/* loaded from: classes3.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC5068n f6794a;

    /* synthetic */ class a extends xc.j implements InterfaceC5068n {

        /* renamed from: j, reason: collision with root package name */
        public static final a f6795j = new a();

        a() {
            super(3, Md.f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Object n(Md.f fVar, Object obj, kotlin.coroutines.d dVar) {
            return fVar.f(obj, dVar);
        }
    }

    static {
        a aVar = a.f6795j;
        Intrinsics.e(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f6794a = (InterfaceC5068n) kotlin.jvm.internal.a.f(aVar, 3);
    }
}
