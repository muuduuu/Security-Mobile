package R2;

import K2.g;
import S2.d;
import T2.i;
import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.G;
import androidx.fragment.app.N;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a extends N {

    /* renamed from: k, reason: collision with root package name */
    public static final C0162a f8444k = new C0162a(null);

    /* renamed from: j, reason: collision with root package name */
    private final WeakReference f8445j;

    /* renamed from: R2.a$a, reason: collision with other inner class name */
    public static final class C0162a {
        public /* synthetic */ C0162a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0162a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, G fragmentManager) {
        super(fragmentManager, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f8445j = new WeakReference(context);
    }

    @Override // androidx.viewpager.widget.a
    public int c() {
        return 2;
    }

    @Override // androidx.viewpager.widget.a
    public CharSequence e(int i10) {
        Context context = (Context) this.f8445j.get();
        if (context == null) {
            return null;
        }
        return context.getString(i10 == 0 ? g.f5217S : g.f5216R);
    }

    @Override // androidx.fragment.app.N
    public ComponentCallbacksC1573o p(int i10) {
        return i10 == 0 ? i.INSTANCE.a() : d.INSTANCE.a();
    }
}
