package wa;

import D7.InterfaceC0781e;
import D7.InterfaceC0782f;
import D7.InterfaceC0783g;
import Jd.C0899o;
import Jd.InterfaceC0895m;
import com.google.android.gms.tasks.Task;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.p;
import pc.AbstractC3868b;
import xc.m;

/* loaded from: classes2.dex */
public abstract class h {

    static final class a extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f44397a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0895m interfaceC0895m) {
            super(1);
            this.f44397a = interfaceC0895m;
        }

        public final void a(Object obj) {
            this.f44397a.resumeWith(o.b(obj));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(obj);
            return Unit.f36324a;
        }
    }

    static final class b implements InterfaceC0782f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f44398a;

        b(InterfaceC0895m interfaceC0895m) {
            this.f44398a = interfaceC0895m;
        }

        @Override // D7.InterfaceC0782f
        public final void b(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            InterfaceC0895m interfaceC0895m = this.f44398a;
            o.a aVar = o.f37128b;
            interfaceC0895m.resumeWith(o.b(p.a(exception)));
        }
    }

    static final class c implements InterfaceC0781e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0895m f44399a;

        c(InterfaceC0895m interfaceC0895m) {
            this.f44399a = interfaceC0895m;
        }

        @Override // D7.InterfaceC0781e
        public final void a() {
            InterfaceC0895m.a.a(this.f44399a, null, 1, null);
        }
    }

    static final class d implements InterfaceC0783g {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f44400a;

        d(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f44400a = function;
        }

        @Override // D7.InterfaceC0783g
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f44400a.invoke(obj);
        }
    }

    public static final Object a(Task task, kotlin.coroutines.d dVar) {
        C0899o c0899o = new C0899o(AbstractC3868b.c(dVar), 1);
        c0899o.F();
        task.f(new d(new a(c0899o)));
        task.d(new b(c0899o));
        task.a(new c(c0899o));
        Object y10 = c0899o.y();
        if (y10 == AbstractC3868b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y10;
    }
}
