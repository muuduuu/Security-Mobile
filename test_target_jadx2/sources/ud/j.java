package ud;

import Kc.InterfaceC0952y;
import dd.C3032i;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f43677a = a.f43678a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f43678a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final j f43679b = new C0628a();

        /* renamed from: ud.j$a$a, reason: collision with other inner class name */
        public static final class C0628a implements j {
            C0628a() {
            }

            @Override // ud.j
            public Pair a(C3032i proto, InterfaceC0952y ownerFunction, fd.g typeTable, E typeDeserializer) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                Intrinsics.checkNotNullParameter(ownerFunction, "ownerFunction");
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
                return null;
            }
        }

        private a() {
        }

        public final j a() {
            return f43679b;
        }
    }

    Pair a(C3032i c3032i, InterfaceC0952y interfaceC0952y, fd.g gVar, E e10);
}
