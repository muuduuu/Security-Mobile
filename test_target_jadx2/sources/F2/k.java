package F2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import android.provider.MediaStore;
import e.AbstractC3061c;
import e.C3059a;
import e.InterfaceC3060b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final a f2290g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final androidx.activity.f f2291a;

    /* renamed from: b, reason: collision with root package name */
    private final b f2292b;

    /* renamed from: c, reason: collision with root package name */
    private String f2293c;

    /* renamed from: d, reason: collision with root package name */
    private List f2294d;

    /* renamed from: e, reason: collision with root package name */
    private Uri f2295e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3061c f2296f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void a(Uri uri);

        void b();
    }

    public k(androidx.activity.f activity, b callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f2291a = activity;
        this.f2292b = callback;
        String string = activity.getString(t.f2397c);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…pick_image_chooser_title)");
        this.f2293c = string;
        this.f2294d = CollectionsKt.m("com.google.android.apps.photos", "com.google.android.apps.photosgo", "com.sec.android.gallery3d", "com.oneplus.gallery", "com.miui.gallery");
        AbstractC3061c registerForActivityResult = activity.registerForActivityResult(new f.j(), new InterfaceC3060b() { // from class: F2.j
            @Override // e.InterfaceC3060b
            public final void a(Object obj) {
                k.e(k.this, (C3059a) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activity.registerForActi…)\n            }\n        }");
        this.f2296f = registerForActivityResult;
    }

    private final List b(Context context, PackageManager packageManager) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryInte…ivities(captureIntent, 0)");
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (context instanceof Activity) {
                context.grantUriPermission(resolveInfo.activityInfo.packageName, this.f2295e, 3);
            }
            intent2.putExtra("output", this.f2295e);
            arrayList.add(intent2);
        }
        return arrayList;
    }

    private final List c(PackageManager packageManager, String str) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Intent intent = Intrinsics.b(str, "android.intent.action.GET_CONTENT") ? new Intent(str) : new Intent(str, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryInte…ivities(galleryIntent, 0)");
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            arrayList.add(intent2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : this.f2294d) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.b(((Intent) obj).getPackage(), str2)) {
                    break;
                }
            }
            Intent intent3 = (Intent) obj;
            if (intent3 != null) {
                arrayList.remove(intent3);
                arrayList2.add(intent3);
            }
        }
        arrayList.addAll(0, arrayList2);
        return arrayList;
    }

    private final boolean d(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr == null) {
                return false;
            }
            for (String str : strArr) {
                if (str != null && StringsKt.r(str, "android.permission.CAMERA", true)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k this$0, C3059a c3059a) {
        Uri uri;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (c3059a.b() != -1) {
            this$0.f2292b.b();
            return;
        }
        Intent a10 = c3059a.a();
        if (a10 == null || (uri = a10.getData()) == null) {
            uri = this$0.f2295e;
        }
        this$0.f2292b.a(uri);
    }

    private final boolean f(Context context) {
        return d(context) && context.checkSelfPermission("android.permission.CAMERA") != 0;
    }

    public final k g(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f2293c = title;
        return this;
    }

    public final k h(List appsList) {
        Intrinsics.checkNotNullParameter(appsList, "appsList");
        this.f2294d = appsList;
        return this;
    }

    public final void i(boolean z10, boolean z11, Uri uri) {
        Intent intent;
        this.f2295e = uri;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.f2291a.getPackageManager();
        if (!f(this.f2291a) && z10) {
            androidx.activity.f fVar = this.f2291a;
            Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
            arrayList.addAll(b(fVar, packageManager));
        }
        if (z11) {
            Intrinsics.checkNotNullExpressionValue(packageManager, "packageManager");
            List c10 = c(packageManager, "android.intent.action.GET_CONTENT");
            if (c10.isEmpty()) {
                c10 = c(packageManager, "android.intent.action.PICK");
            }
            arrayList.addAll(c10);
        }
        if (arrayList.isEmpty()) {
            intent = new Intent();
        } else {
            Intent intent2 = new Intent("android.intent.action.CHOOSER", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            if (z11) {
                intent2.setAction("android.intent.action.PICK");
                intent2.setType("image/*");
            }
            intent = intent2;
        }
        Intent createChooser = Intent.createChooser(intent, this.f2293c);
        Object[] array = arrayList.toArray(new Parcelable[0]);
        Intrinsics.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) array);
        this.f2296f.a(createChooser);
    }
}
