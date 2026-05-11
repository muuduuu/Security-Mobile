package co.hyperverge.encoder;

import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.J;
import Jd.N;
import co.hyperverge.encoder.HyperVideoEncoder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import lc.p;
import pc.AbstractC3868b;

@f(c = "co.hyperverge.encoder.HyperVideoEncoder$startEncoding$10", f = "HyperVideoEncoder.kt", l = {116}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", org.conscrypt.BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class HyperVideoEncoder$startEncoding$10 extends l implements Function2<N, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HyperVideoEncoder this$0;

    @f(c = "co.hyperverge.encoder.HyperVideoEncoder$startEncoding$10$1", f = "HyperVideoEncoder.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", org.conscrypt.BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: co.hyperverge.encoder.HyperVideoEncoder$startEncoding$10$1, reason: invalid class name */
    static final class AnonymousClass1 extends l implements Function2<N, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ HyperVideoEncoder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HyperVideoEncoder hyperVideoEncoder, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = hyperVideoEncoder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            HyperVideoEncoder.HyperVideoEncoderCallback hyperVideoEncoderCallback;
            AbstractC3868b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            try {
                this.this$0.encode();
            } catch (IllegalStateException unused) {
                hyperVideoEncoderCallback = this.this$0.mCallback;
                hyperVideoEncoderCallback.onLowStorage();
            }
            return Unit.f36324a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HyperVideoEncoder$startEncoding$10(HyperVideoEncoder hyperVideoEncoder, d<? super HyperVideoEncoder$startEncoding$10> dVar) {
        super(2, dVar);
        this.this$0 = hyperVideoEncoder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HyperVideoEncoder$startEncoding$10(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, d<? super Unit> dVar) {
        return ((HyperVideoEncoder$startEncoding$10) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            J b10 = C0874b0.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (AbstractC0887i.g(b10, anonymousClass1, this) == e10) {
                return e10;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
        }
        return Unit.f36324a;
    }
}
