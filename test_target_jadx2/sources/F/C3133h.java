package f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import e.C3065g;
import f.AbstractC3126a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.m;

/* renamed from: f.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3133h extends AbstractC3126a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32777a = new a(null);

    /* renamed from: f.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResolveInfo a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final ResolveInfo b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String c(e input) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (input instanceof c) {
                return "image/*";
            }
            if (input instanceof d) {
                return "video/*";
            }
            if (input instanceof b) {
                return null;
            }
            throw new m();
        }

        public final boolean d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return a(context) != null;
        }

        public final boolean e(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return b(context) != null;
        }

        public final boolean f() {
            int extensionVersion;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                return true;
            }
            if (i10 >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
                if (extensionVersion >= 2) {
                    return true;
                }
            }
            return false;
        }

        private a() {
        }
    }

    /* renamed from: f.h$b */
    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32778a = new b();

        private b() {
        }
    }

    /* renamed from: f.h$c */
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final c f32779a = new c();

        private c() {
        }
    }

    /* renamed from: f.h$d */
    public static final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public static final d f32780a = new d();

        private d() {
        }
    }

    /* renamed from: f.h$e */
    public interface e {
    }

    @Override // f.AbstractC3126a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, C3065g input) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        a aVar = f32777a;
        if (aVar.f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.c(input.a()));
            return intent2;
        }
        if (aVar.e(context)) {
            ResolveInfo b10 = aVar.b(context);
            if (b10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = b10.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent.setType(aVar.c(input.a()));
        } else {
            if (!aVar.d(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.c(input.a()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo a10 = aVar.a(context);
            if (a10 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo2 = a10.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent.setType(aVar.c(input.a()));
        }
        return intent;
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
    public final Uri c(int i10, Intent intent) {
        if (i10 != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) CollectionsKt.firstOrNull(AbstractC3129d.f32774a.a(intent));
        }
        return data;
    }
}
