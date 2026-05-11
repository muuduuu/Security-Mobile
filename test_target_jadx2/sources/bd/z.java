package bd;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface z {

    public static final class a implements z {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19050a = new a();

        private a() {
        }

        @Override // bd.z
        public List a(String packageFqName) {
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            return CollectionsKt.j();
        }
    }

    List a(String str);
}
