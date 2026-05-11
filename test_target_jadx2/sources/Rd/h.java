package rd;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface h extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f40643a = a.f40644a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f40644a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Function1 f40645b = C0608a.f40646a;

        /* renamed from: rd.h$a$a, reason: collision with other inner class name */
        static final class C0608a extends xc.m implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0608a f40646a = new C0608a();

            C0608a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(id.f it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        }

        private a() {
        }

        public final Function1 a() {
            return f40645b;
        }
    }

    public static final class b extends i {

        /* renamed from: b, reason: collision with root package name */
        public static final b f40647b = new b();

        private b() {
        }

        @Override // rd.i, rd.h
        public Set b() {
            return O.d();
        }

        @Override // rd.i, rd.h
        public Set d() {
            return O.d();
        }

        @Override // rd.i, rd.h
        public Set e() {
            return O.d();
        }
    }

    Collection a(id.f fVar, Rc.b bVar);

    Set b();

    Collection c(id.f fVar, Rc.b bVar);

    Set d();

    Set e();
}
