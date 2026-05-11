package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class Y {

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17112a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View currentView) {
            Intrinsics.checkNotNullParameter(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f17113a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1599p invoke(View viewParent) {
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            Object tag = viewParent.getTag(Y0.a.f11991a);
            if (tag instanceof InterfaceC1599p) {
                return (InterfaceC1599p) tag;
            }
            return null;
        }
    }

    public static final InterfaceC1599p a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (InterfaceC1599p) kotlin.sequences.j.q(kotlin.sequences.j.x(kotlin.sequences.j.h(view, a.f17112a), b.f17113a));
    }

    public static final void b(View view, InterfaceC1599p interfaceC1599p) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(Y0.a.f11991a, interfaceC1599p);
    }
}
