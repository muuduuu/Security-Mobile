package Ta;

import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.J;
import Jd.N;
import android.content.Context;
import android.graphics.drawable.Drawable;
import expo.modules.image.Image;
import expo.modules.image.records.ImageLoadOptions;
import expo.modules.image.records.SourceMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pb.C3862a;
import pc.AbstractC3868b;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final C3862a f9632a;

    /* renamed from: b, reason: collision with root package name */
    private final SourceMap f9633b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageLoadOptions f9634c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f9635a;

        /* renamed from: c, reason: collision with root package name */
        int f9637c;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f9635a = obj;
            this.f9637c |= Integer.MIN_VALUE;
            return r.this.b(this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f9638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f9639b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f9640c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ r f9641d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, Object obj, r rVar, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f9639b = context;
            this.f9640c = obj;
            this.f9641d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new b(this.f9639b, this.f9640c, this.f9641d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f9638a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            return ((com.bumptech.glide.k) com.bumptech.glide.c.v(this.f9639b).g().B0(this.f9640c).d()).G0(this.f9641d.f9634c.getMaxWidth(), this.f9641d.f9634c.getMaxHeight()).get();
        }
    }

    public r(C3862a appContext, SourceMap source, ImageLoadOptions options) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f9632a = appContext;
        this.f9633b = source;
        this.f9634c = options;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kotlin.coroutines.d dVar) {
        a aVar;
        int i10;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.f9637c;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.f9637c = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.f9635a;
                    Object e10 = AbstractC3868b.e();
                    i10 = aVar.f9637c;
                    if (i10 != 0) {
                        lc.p.b(obj);
                        Context w10 = this.f9632a.w();
                        if (w10 == null) {
                            throw new expo.modules.kotlin.exception.l();
                        }
                        m createGlideModelProvider = this.f9633b.createGlideModelProvider(w10);
                        Object a10 = createGlideModelProvider != null ? createGlideModelProvider.a() : null;
                        J b10 = C0874b0.b();
                        b bVar = new b(w10, a10, this, null);
                        aVar.f9637c = 1;
                        obj = AbstractC0887i.g(b10, bVar, aVar);
                        if (obj == e10) {
                            return e10;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lc.p.b(obj);
                    }
                    Drawable drawable = (Drawable) obj;
                    Intrinsics.d(drawable);
                    return new Image(drawable);
                }
            }
            if (i10 != 0) {
            }
            Drawable drawable2 = (Drawable) obj;
            Intrinsics.d(drawable2);
            return new Image(drawable2);
        } catch (Exception e11) {
            throw new q(e11);
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f9635a;
        Object e102 = AbstractC3868b.e();
        i10 = aVar.f9637c;
    }
}
