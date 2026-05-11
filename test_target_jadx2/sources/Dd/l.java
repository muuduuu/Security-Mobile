package Dd;

import Kc.InterfaceC0941m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface l {

    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1521a = new a();

        private a() {
        }

        @Override // Dd.l
        public boolean a(InterfaceC0941m what, InterfaceC0941m from) {
            Intrinsics.checkNotNullParameter(what, "what");
            Intrinsics.checkNotNullParameter(from, "from");
            return true;
        }
    }

    boolean a(InterfaceC0941m interfaceC0941m, InterfaceC0941m interfaceC0941m2);
}
