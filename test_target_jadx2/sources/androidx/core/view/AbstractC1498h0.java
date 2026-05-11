package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import pc.AbstractC3868b;

/* renamed from: androidx.core.view.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1498h0 {

    /* renamed from: androidx.core.view.h0$a */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* renamed from: b, reason: collision with root package name */
        int f16132b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f16133c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f16134d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f16134d = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            a aVar = new a(this.f16134d, dVar);
            aVar.f16133c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlin.sequences.i iVar, kotlin.coroutines.d dVar) {
            return ((a) create(iVar, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.sequences.i iVar;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f16132b;
            if (i10 == 0) {
                lc.p.b(obj);
                iVar = (kotlin.sequences.i) this.f16133c;
                View view = this.f16134d;
                this.f16133c = iVar;
                this.f16132b = 1;
                if (iVar.a(view, this) == e10) {
                    return e10;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                    return Unit.f36324a;
                }
                iVar = (kotlin.sequences.i) this.f16133c;
                lc.p.b(obj);
            }
            View view2 = this.f16134d;
            if (view2 instanceof ViewGroup) {
                Sequence b10 = AbstractC1496g0.b((ViewGroup) view2);
                this.f16133c = null;
                this.f16132b = 2;
                if (iVar.f(b10, this) == e10) {
                    return e10;
                }
            }
            return Unit.f36324a;
        }
    }

    public static final Sequence a(View view) {
        return kotlin.sequences.j.b(new a(view, null));
    }
}
