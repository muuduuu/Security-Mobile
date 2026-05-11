package eb;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h {

    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32546a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32547a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        private final List f32548a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.f32548a = data;
        }

        public final List a() {
            return this.f32548a;
        }
    }

    public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private h() {
    }
}
