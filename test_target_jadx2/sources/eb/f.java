package eb;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import db.AbstractC3017l;
import e.C3065g;
import eb.h;
import expo.modules.imagepicker.ImagePickerOptions;
import expo.modules.imagepicker.MediaTypes;
import expo.modules.kotlin.exception.l;
import f.C3131f;
import f.C3133h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import rb.InterfaceC4295c;
import zb.InterfaceC5270a;

/* loaded from: classes2.dex */
public final class f implements InterfaceC4295c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5270a f32543a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32544a;

        static {
            int[] iArr = new int[MediaTypes.values().length];
            try {
                iArr[MediaTypes.VIDEOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaTypes.IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32544a = iArr;
        }
    }

    public f(InterfaceC5270a appContextProvider) {
        Intrinsics.checkNotNullParameter(appContextProvider, "appContextProvider");
        this.f32543a = appContextProvider;
    }

    private final Intent d(ImagePickerOptions imagePickerOptions) {
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType("*/*");
        int i10 = a.f32544a[imagePickerOptions.getNativeMediaTypes().ordinal()];
        Intent putExtra = type.putExtra("android.intent.extra.MIME_TYPES", i10 != 1 ? i10 != 2 ? new String[]{"image/*", "video/*"} : new String[]{"image/*"} : new String[]{"video/*"});
        if (imagePickerOptions.getAllowsMultipleSelection()) {
            putExtra.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        Intrinsics.checkNotNullExpressionValue(putExtra, "apply(...)");
        return putExtra;
    }

    private final ContentResolver e() {
        Context w10 = this.f32543a.a().w();
        ContentResolver contentResolver = w10 != null ? w10.getContentResolver() : null;
        if (contentResolver != null) {
            return contentResolver;
        }
        throw new l();
    }

    @Override // rb.InterfaceC4295c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Intent b(Context context, g input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.a().getLegacy()) {
            return d(input.a());
        }
        C3065g.a aVar = new C3065g.a();
        int i10 = a.f32544a[input.a().getNativeMediaTypes().ordinal()];
        C3065g a10 = aVar.b(i10 != 1 ? i10 != 2 ? C3133h.b.f32778a : C3133h.c.f32779a : C3133h.d.f32780a).a();
        if (input.a().getAllowsMultipleSelection()) {
            int selectionLimit = input.a().getSelectionLimit();
            if (selectionLimit == 1) {
                return new C3133h().a(context, a10);
            }
            if (selectionLimit > 1) {
                return new C3131f(selectionLimit).a(context, a10);
            }
            if (selectionLimit == 0) {
                return new C3131f(0, 1, null).a(context, a10);
            }
        }
        return new C3133h().a(context, a10);
    }

    @Override // rb.InterfaceC4295c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public h a(g input, int i10, Intent intent) {
        List e10;
        h cVar;
        Intrinsics.checkNotNullParameter(input, "input");
        if (i10 == 0) {
            return h.a.f32546a;
        }
        if (intent != null) {
            h.c cVar2 = null;
            Intent intent2 = i10 == -1 ? intent : null;
            if (intent2 != null && (e10 = AbstractC3017l.e(intent2)) != null) {
                if (input.a().getAllowsMultipleSelection()) {
                    List<Uri> list = e10;
                    List arrayList = new ArrayList(CollectionsKt.u(list, 10));
                    for (Uri uri : list) {
                        arrayList.add(t.a(AbstractC3017l.r(uri, e()), uri));
                    }
                    if (input.a().getSelectionLimit() > 0) {
                        arrayList = CollectionsKt.G0(arrayList, input.a().getSelectionLimit());
                    }
                    cVar = new h.c(arrayList);
                } else if (intent.getData() != null) {
                    Uri data = intent.getData();
                    if (data != null) {
                        Intrinsics.d(data);
                        cVar2 = new h.c(CollectionsKt.e(t.a(AbstractC3017l.r(data, e()), data)));
                    }
                    cVar = cVar2;
                } else {
                    Uri uri2 = (Uri) CollectionsKt.firstOrNull(e10);
                    cVar = uri2 != null ? new h.c(CollectionsKt.e(t.a(AbstractC3017l.r(uri2, e()), uri2))) : h.b.f32547a;
                }
                if (cVar != null) {
                    return cVar;
                }
            }
        }
        return h.b.f32547a;
    }
}
