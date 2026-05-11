package androidx.fragment.app;

import androidx.lifecycle.V;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1573o f16862a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ComponentCallbacksC1573o componentCallbacksC1573o) {
            super(0);
            this.f16862a = componentCallbacksC1573o;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a defaultViewModelCreationExtras = this.f16862a.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentCallbacksC1573o f16863a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ComponentCallbacksC1573o componentCallbacksC1573o) {
            super(0);
            this.f16863a = componentCallbacksC1573o;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V.c invoke() {
            V.c defaultViewModelProviderFactory = this.f16863a.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    public static final /* synthetic */ Lazy a(ComponentCallbacksC1573o componentCallbacksC1573o, kotlin.reflect.d viewModelClass, Function0 storeProducer, Function0 function0) {
        Intrinsics.checkNotNullParameter(componentCallbacksC1573o, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        return b(componentCallbacksC1573o, viewModelClass, storeProducer, new a(componentCallbacksC1573o), function0);
    }

    public static final Lazy b(ComponentCallbacksC1573o componentCallbacksC1573o, kotlin.reflect.d viewModelClass, Function0 storeProducer, Function0 extrasProducer, Function0 function0) {
        Intrinsics.checkNotNullParameter(componentCallbacksC1573o, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        if (function0 == null) {
            function0 = new b(componentCallbacksC1573o);
        }
        return new androidx.lifecycle.U(viewModelClass, storeProducer, function0, extrasProducer);
    }
}
