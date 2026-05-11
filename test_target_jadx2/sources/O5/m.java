package o5;

import android.text.SpannableStringBuilder;
import c3.AbstractC1721a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final a f37946d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f37947a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37948b;

    /* renamed from: c, reason: collision with root package name */
    public final i f37949c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m(int i10, int i11, i what) {
        Intrinsics.checkNotNullParameter(what, "what");
        this.f37947a = i10;
        this.f37948b = i11;
        this.f37949c = what;
    }

    public final void a(SpannableStringBuilder builder, int i10) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (i10 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        int i11 = this.f37947a == 0 ? 18 : 34;
        int i12 = 255 - i10;
        if (i12 < 0) {
            AbstractC1721a.J("SetSpanOperation", "Text tree size exceeded the limit, styling may become unpredictable");
        }
        builder.setSpan(this.f37949c, this.f37947a, this.f37948b, ((Math.max(i12, 0) << 16) & 16711680) | (i11 & (-16711681)));
    }
}
