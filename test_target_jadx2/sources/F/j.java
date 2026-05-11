package f;

import android.content.Context;
import android.content.Intent;
import e.C3059a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends AbstractC3126a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32782a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // f.AbstractC3126a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, Intent input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // f.AbstractC3126a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C3059a c(int i10, Intent intent) {
        return new C3059a(i10, intent);
    }
}
