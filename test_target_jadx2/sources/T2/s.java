package T2;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class s {

    public static final class a extends s {

        /* renamed from: a, reason: collision with root package name */
        private SpannableStringBuilder f9224a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SpannableStringBuilder line) {
            super(null);
            Intrinsics.checkNotNullParameter(line, "line");
            this.f9224a = line;
        }

        public final SpannableStringBuilder a() {
            return this.f9224a;
        }

        public final void b(SpannableStringBuilder spannableStringBuilder) {
            Intrinsics.checkNotNullParameter(spannableStringBuilder, "<set-?>");
            this.f9224a = spannableStringBuilder;
        }
    }

    public static final class b extends s {

        /* renamed from: a, reason: collision with root package name */
        private final Spanned f9225a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Spanned headers) {
            super(null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f9225a = headers;
        }

        public final Spanned a() {
            return this.f9225a;
        }
    }

    public static final class c extends s {

        /* renamed from: a, reason: collision with root package name */
        private final Bitmap f9226a;

        /* renamed from: b, reason: collision with root package name */
        private final Double f9227b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Bitmap image, Double d10) {
            super(null);
            Intrinsics.checkNotNullParameter(image, "image");
            this.f9226a = image;
            this.f9227b = d10;
        }

        public final Bitmap a() {
            return this.f9226a;
        }

        public final Double b() {
            return this.f9227b;
        }
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private s() {
    }
}
