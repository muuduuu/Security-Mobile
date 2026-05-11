package eb;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import db.AbstractC3017l;
import eb.h;
import expo.modules.imagepicker.CameraType;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import rb.InterfaceC4295c;
import zb.InterfaceC5270a;

/* renamed from: eb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3118a implements InterfaceC4295c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5270a f32533a;

    public C3118a(InterfaceC5270a appContextProvider) {
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.f32533a = appContextProvider;
    }

    private final ContentResolver d() {
        Context w10 = this.f32533a.a().w();
        if (w10 == null) {
            throw new IllegalArgumentException("React Application Context is null");
        }
        ContentResolver contentResolver = w10.getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    @Override // rb.InterfaceC4295c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Intent b(Context context, b input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent(input.a().getNativeMediaTypes().toCameraIntentAction()).putExtra("output", Uri.parse(input.b()));
        Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
        if (Intrinsics.b(input.a().getNativeMediaTypes().toCameraIntentAction(), "android.media.action.VIDEO_CAPTURE")) {
            putExtra.putExtra("android.intent.extra.durationLimit", input.a().getVideoMaxDuration());
        }
        if (input.a().getCameraType() == CameraType.FRONT) {
            putExtra.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
            putExtra.putExtra("android.intent.extras.CAMERA_FACING", 1);
            putExtra.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        } else {
            putExtra.putExtra("android.intent.extras.LENS_FACING_BACK", 1);
            putExtra.putExtra("android.intent.extras.CAMERA_FACING", 0);
            putExtra.putExtra("android.intent.extra.USE_FRONT_CAMERA", false);
        }
        return putExtra;
    }

    @Override // rb.InterfaceC4295c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public h a(b input, int i10, Intent intent) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (i10 == 0) {
            return h.a.f32546a;
        }
        Uri parse = Uri.parse(input.b());
        Intrinsics.d(parse);
        return new h.c(CollectionsKt.e(t.a(AbstractC3017l.r(parse, d()), parse)));
    }
}
