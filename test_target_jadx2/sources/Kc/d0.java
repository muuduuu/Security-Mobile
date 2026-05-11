package Kc;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface d0 {

    public static final class a implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5565a = new a();

        private a() {
        }

        @Override // Kc.d0
        public Collection a(yd.e0 currentTypeConstructor, Collection superTypes, Function1 neighbors, Function1 reportLoop) {
            Intrinsics.checkNotNullParameter(currentTypeConstructor, "currentTypeConstructor");
            Intrinsics.checkNotNullParameter(superTypes, "superTypes");
            Intrinsics.checkNotNullParameter(neighbors, "neighbors");
            Intrinsics.checkNotNullParameter(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    Collection a(yd.e0 e0Var, Collection collection, Function1 function1, Function1 function12);
}
