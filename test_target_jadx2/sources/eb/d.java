package eb;

import Jd.AbstractC0889j;
import Jd.N;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.canhub.cropper.CropImageActivity;
import db.AbstractC3017l;
import eb.h;
import expo.modules.imagepicker.MediaType;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.p;
import lc.t;
import pc.AbstractC3868b;
import rb.InterfaceC4295c;
import zb.InterfaceC5270a;

/* loaded from: classes2.dex */
public final class d implements InterfaceC4295c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5270a f32536a;

    static final class a extends l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f32537a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f32538b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f32539c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ContentResolver f32540d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, Uri uri, ContentResolver contentResolver, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f32538b = eVar;
            this.f32539c = uri;
            this.f32540d = contentResolver;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new a(this.f32538b, this.f32539c, this.f32540d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((a) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f32537a;
            if (i10 == 0) {
                p.b(obj);
                Uri parse = Uri.parse(this.f32538b.b());
                File a10 = v0.b.a(this.f32539c);
                ContentResolver contentResolver = this.f32540d;
                Intrinsics.checkNotNullExpressionValue(contentResolver, "$contentResolver");
                this.f32537a = 1;
                if (AbstractC3017l.a(parse, a10, contentResolver, this) == e10) {
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

    public d(InterfaceC5270a appContextProvider) {
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.f32536a = appContextProvider;
    }

    @Override // rb.InterfaceC4295c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Intent b(Context context, e input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent intent = new Intent(context, (Class<?>) CropImageActivity.class);
        ContentResolver contentResolver = context.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        Bitmap.CompressFormat n10 = AbstractC3017l.n(AbstractC3017l.h(contentResolver, Uri.parse(input.b())));
        Uri fromFile = Uri.fromFile(AbstractC3017l.c(this.f32536a.a().j(), AbstractC3017l.p(n10)));
        Pair a10 = t.a("CROP_IMAGE_EXTRA_SOURCE", Uri.parse(input.b()));
        F2.l lVar = new F2.l();
        lVar.f2324h0 = n10;
        lVar.f2326i0 = (int) (input.a().getQuality() * 100);
        lVar.f2315Z = fromFile;
        Pair<Integer, Integer> aspect = input.a().getAspect();
        if (aspect != null) {
            int intValue = ((Number) aspect.getFirst()).intValue();
            int intValue2 = ((Number) aspect.getSecond()).intValue();
            lVar.f2347t = intValue;
            lVar.f2349u = intValue2;
            lVar.f2345s = true;
            lVar.f2343r = 0.0f;
        }
        Unit unit = Unit.f36324a;
        intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", androidx.core.os.c.b(a10, t.a("CROP_IMAGE_EXTRA_OPTIONS", lVar)));
        return intent;
    }

    @Override // rb.InterfaceC4295c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public h a(e input, int i10, Intent intent) {
        F2.e eVar;
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(input, "input");
        if (Build.VERSION.SDK_INT >= 33) {
            if (intent != null) {
                parcelableExtra = intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT", F2.e.class);
                eVar = (F2.e) parcelableExtra;
            }
            eVar = null;
        } else {
            if (intent != null) {
                eVar = (F2.e) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
            }
            eVar = null;
        }
        if (i10 == 0 || eVar == null) {
            return h.a.f32546a;
        }
        Uri g10 = eVar.g();
        if (g10 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Context w10 = this.f32536a.a().w();
        if (w10 == null) {
            throw new IllegalArgumentException("React Application Context is null");
        }
        AbstractC0889j.b(null, new a(input, g10, w10.getContentResolver(), null), 1, null);
        return new h.c(CollectionsKt.e(t.a(MediaType.IMAGE, g10)));
    }
}
