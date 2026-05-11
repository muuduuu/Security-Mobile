package ud;

import dd.C3040q;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.M;

/* loaded from: classes3.dex */
public interface s {

    public static final class a implements s {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43723a = new a();

        private a() {
        }

        @Override // ud.s
        public AbstractC5197E a(C3040q proto, String flexibleId, M lowerBound, M upperBound) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    AbstractC5197E a(C3040q c3040q, String str, M m10, M m11);
}
