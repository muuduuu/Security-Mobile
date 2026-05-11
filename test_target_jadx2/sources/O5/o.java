package o5;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class o extends ReplacementSpan implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37954a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Spannable spannable, TextView textView) {
            Intrinsics.checkNotNullParameter(spannable, "spannable");
            Object[] spans = spannable.getSpans(0, spannable.length(), o.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            for (Object obj : spans) {
                o oVar = (o) obj;
                oVar.c();
                oVar.h(textView);
            }
        }

        private a() {
        }
    }

    public static final void g(Spannable spannable, TextView textView) {
        f37954a.a(spannable, textView);
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void h(TextView textView);
}
