package I0;

import kotlin.Unit;
import pc.AbstractC3868b;
import wc.InterfaceC5068n;

/* loaded from: classes.dex */
public abstract class G {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f4018a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f4019b;

        a(kotlin.coroutines.d dVar) {
            super(3, dVar);
        }

        public final Object g(y yVar, boolean z10, kotlin.coroutines.d dVar) {
            a aVar = new a(dVar);
            aVar.f4019b = yVar;
            return aVar.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f4018a;
            if (i10 == 0) {
                lc.p.b(obj);
                y yVar = (y) this.f4019b;
                this.f4018a = 1;
                obj = yVar.e(this);
                if (obj == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lc.p.b(obj);
            }
            return obj;
        }

        @Override // wc.InterfaceC5068n
        public /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3) {
            return g((y) obj, ((Boolean) obj2).booleanValue(), (kotlin.coroutines.d) obj3);
        }
    }

    public static final Object a(F f10, kotlin.coroutines.d dVar) {
        return f10.b(new a(null), dVar);
    }
}
