package d5;

import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2989k extends AbstractC2979a {

    /* renamed from: f, reason: collision with root package name */
    private static final a f31217f = new a(null);

    /* renamed from: d5.k$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // d5.AbstractC2979a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Animation b(View view, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z10 = true;
        boolean z11 = (((int) view.getX()) == i10 && ((int) view.getY()) == i11) ? false : true;
        if (view.getWidth() == i12 && view.getHeight() == i13) {
            z10 = false;
        }
        if (z11 || z10) {
            return new C2991m(view, i10, i11, i12, i13);
        }
        return null;
    }

    @Override // d5.AbstractC2979a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean e() {
        return this.f31208d > 0;
    }
}
