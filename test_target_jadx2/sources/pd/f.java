package pd;

import Kc.InterfaceC0933e;
import Mc.C;
import Vc.g;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38602a = a.f38603a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f38603a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final C3871a f38604b = new C3871a(CollectionsKt.j());

        private a() {
        }

        public final C3871a a() {
            return f38604b;
        }
    }

    void a(g gVar, InterfaceC0933e interfaceC0933e, id.f fVar, Collection collection);

    List b(g gVar, InterfaceC0933e interfaceC0933e);

    List c(g gVar, InterfaceC0933e interfaceC0933e);

    C d(g gVar, InterfaceC0933e interfaceC0933e, C c10);

    void e(g gVar, InterfaceC0933e interfaceC0933e, id.f fVar, List list);

    List f(g gVar, InterfaceC0933e interfaceC0933e);

    void g(g gVar, InterfaceC0933e interfaceC0933e, List list);

    void h(g gVar, InterfaceC0933e interfaceC0933e, id.f fVar, Collection collection);
}
