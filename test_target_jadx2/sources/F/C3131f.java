package f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.provider.MediaStore;
import e.C3065g;
import f.AbstractC3126a;
import f.C3133h;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3131f extends AbstractC3126a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f32775b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f32776a;

    /* renamed from: f.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            int pickImagesMaxLimit;
            if (!C3133h.f32777a.f()) {
                return Integer.MAX_VALUE;
            }
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            return pickImagesMaxLimit;
        }

        private a() {
        }
    }

    public /* synthetic */ C3131f(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? f32775b.a() : i10);
    }

    @Override // f.AbstractC3126a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, C3065g input) {
        int pickImagesMaxLimit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        C3133h.a aVar = C3133h.f32777a;
        if (aVar.f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.c(input.a()));
            int i10 = this.f32776a;
            pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
            if (i10 > pickImagesMaxLimit) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f32776a);
            return intent;
        }
        if (aVar.e(context)) {
            ResolveInfo b10 = aVar.b(context);
            if (b10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = b10.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(aVar.c(input.a()));
            intent2.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f32776a);
            return intent2;
        }
        if (aVar.d(context)) {
            ResolveInfo a10 = aVar.a(context);
            if (a10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = a10.activityInfo;
            Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f32776a);
            return intent3;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.setType(aVar.c(input.a()));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }

    @Override // f.AbstractC3126a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC3126a.C0476a b(Context context, C3065g input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // f.AbstractC3126a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List c(int i10, Intent intent) {
        List a10;
        if (i10 != -1) {
            intent = null;
        }
        return (intent == null || (a10 = AbstractC3129d.f32774a.a(intent)) == null) ? CollectionsKt.j() : a10;
    }

    public C3131f(int i10) {
        this.f32776a = i10;
        if (i10 <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }
}
