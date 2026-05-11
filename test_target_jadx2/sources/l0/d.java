package L0;

import I0.C0838d;
import androidx.datastore.preferences.protobuf.C1558z;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5633a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(InputStream input) {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                f S10 = f.S(input);
                Intrinsics.checkNotNullExpressionValue(S10, "{\n                Prefer…From(input)\n            }");
                return S10;
            } catch (C1558z e10) {
                throw new C0838d("Unable to parse preferences proto.", e10);
            }
        }

        private a() {
        }
    }
}
