package co.hyperverge.hypersnapsdk.utils;

import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.G0;
import Jd.N;
import android.media.MediaMetadataRetriever;
import co.hyperverge.hypersnapsdk.objects.HVError;
import co.hyperverge.hypersnapsdk.utils.StaticVideoAnalyzer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lc.o;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;

@kotlin.coroutines.jvm.internal.f(c = "co.hyperverge.hypersnapsdk.utils.StaticVideoAnalyzer$analyze$1", f = "StaticVideoAnalyzer.kt", l = {HVError.GPS_ACCESS_DENIED}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class StaticVideoAnalyzer$analyze$1 extends kotlin.coroutines.jvm.internal.l implements Function2<N, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ MediaMetadataRetriever $retriever;
    final /* synthetic */ StaticVideoAnalyzer.VideoAnalysisCallback $videoAnalysisCallback;
    final /* synthetic */ String $videoPath;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StaticVideoAnalyzer this$0;

    @kotlin.coroutines.jvm.internal.f(c = "co.hyperverge.hypersnapsdk.utils.StaticVideoAnalyzer$analyze$1$3", f = "StaticVideoAnalyzer.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LJd/N;", BuildConfig.FLAVOR, "<anonymous>", "(LJd/N;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: co.hyperverge.hypersnapsdk.utils.StaticVideoAnalyzer$analyze$1$3, reason: invalid class name */
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.l implements Function2<N, kotlin.coroutines.d<? super Unit>, Object> {
        final /* synthetic */ StaticVideoAnalyzer.VideoAnalysisCallback $videoAnalysisCallback;
        int label;
        final /* synthetic */ StaticVideoAnalyzer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(StaticVideoAnalyzer staticVideoAnalyzer, StaticVideoAnalyzer.VideoAnalysisCallback videoAnalysisCallback, kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.this$0 = staticVideoAnalyzer;
            this.$videoAnalysisCallback = videoAnalysisCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass3(this.this$0, this.$videoAnalysisCallback, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            boolean z11;
            AbstractC3868b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("analyze completed with isVideoStatic: ");
            z10 = this.this$0.isVideoStatic;
            sb2.append(z10);
            HVLogUtils.d("StaticVideoAnalyzer", sb2.toString());
            StaticVideoAnalyzer.VideoAnalysisCallback videoAnalysisCallback = this.$videoAnalysisCallback;
            z11 = this.this$0.isVideoStatic;
            videoAnalysisCallback.onAnalysisComplete(z11);
            return Unit.f36324a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StaticVideoAnalyzer$analyze$1(MediaMetadataRetriever mediaMetadataRetriever, String str, StaticVideoAnalyzer staticVideoAnalyzer, StaticVideoAnalyzer.VideoAnalysisCallback videoAnalysisCallback, kotlin.coroutines.d<? super StaticVideoAnalyzer$analyze$1> dVar) {
        super(2, dVar);
        this.$retriever = mediaMetadataRetriever;
        this.$videoPath = str;
        this.this$0 = staticVideoAnalyzer;
        this.$videoAnalysisCallback = videoAnalysisCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        StaticVideoAnalyzer$analyze$1 staticVideoAnalyzer$analyze$1 = new StaticVideoAnalyzer$analyze$1(this.$retriever, this.$videoPath, this.this$0, this.$videoAnalysisCallback, dVar);
        staticVideoAnalyzer$analyze$1.L$0 = obj;
        return staticVideoAnalyzer$analyze$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(N n10, kotlin.coroutines.d<? super Unit> dVar) {
        return ((StaticVideoAnalyzer$analyze$1) create(n10, dVar)).invokeSuspend(Unit.f36324a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b10;
        boolean extractAndCompareFrames;
        Object e10 = AbstractC3868b.e();
        int i10 = this.label;
        if (i10 == 0) {
            lc.p.b(obj);
            MediaMetadataRetriever mediaMetadataRetriever = this.$retriever;
            String str = this.$videoPath;
            StaticVideoAnalyzer staticVideoAnalyzer = this.this$0;
            try {
                o.a aVar = lc.o.f37128b;
                mediaMetadataRetriever.setDataSource(str);
                extractAndCompareFrames = staticVideoAnalyzer.extractAndCompareFrames(mediaMetadataRetriever);
                staticVideoAnalyzer.isVideoStatic = extractAndCompareFrames;
                b10 = lc.o.b(Unit.f36324a);
            } catch (Throwable th) {
                o.a aVar2 = lc.o.f37128b;
                b10 = lc.o.b(lc.p.a(th));
            }
            Throwable d10 = lc.o.d(b10);
            if (d10 != null) {
                HVLogUtils.e("StaticVideoAnalyzer", "Error analyzing video: " + d10.getMessage());
            }
            G0 c10 = C0874b0.c();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$videoAnalysisCallback, null);
            this.label = 1;
            if (AbstractC0887i.g(c10, anonymousClass3, this) == e10) {
                return e10;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
        }
        return Unit.f36324a;
    }
}
