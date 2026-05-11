package X8;

import D7.AbstractC0789m;
import D7.InterfaceC0782f;
import V6.AbstractC1287s;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import com.google.android.gms.common.C2012d;
import com.google.android.gms.common.C2018j;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import q7.AbstractC3939m;
import q7.AbstractC3942p;
import q7.C3941o;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final C2012d[] f11798a = new C2012d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final C2012d f11799b;

    /* renamed from: c, reason: collision with root package name */
    public static final C2012d f11800c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2012d f11801d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2012d f11802e;

    /* renamed from: f, reason: collision with root package name */
    public static final C2012d f11803f;

    /* renamed from: g, reason: collision with root package name */
    public static final C2012d f11804g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2012d f11805h;

    /* renamed from: i, reason: collision with root package name */
    public static final C2012d f11806i;

    /* renamed from: j, reason: collision with root package name */
    public static final C2012d f11807j;

    /* renamed from: k, reason: collision with root package name */
    public static final C2012d f11808k;

    /* renamed from: l, reason: collision with root package name */
    public static final C2012d f11809l;

    /* renamed from: m, reason: collision with root package name */
    public static final C2012d f11810m;

    /* renamed from: n, reason: collision with root package name */
    public static final C2012d f11811n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2012d f11812o;

    /* renamed from: p, reason: collision with root package name */
    public static final C2012d f11813p;

    /* renamed from: q, reason: collision with root package name */
    public static final C2012d f11814q;

    /* renamed from: r, reason: collision with root package name */
    public static final C2012d f11815r;

    /* renamed from: s, reason: collision with root package name */
    public static final C2012d f11816s;

    /* renamed from: t, reason: collision with root package name */
    public static final C2012d f11817t;

    /* renamed from: u, reason: collision with root package name */
    public static final C2012d f11818u;

    /* renamed from: v, reason: collision with root package name */
    public static final C2012d f11819v;

    /* renamed from: w, reason: collision with root package name */
    private static final AbstractC3942p f11820w;

    /* renamed from: x, reason: collision with root package name */
    private static final AbstractC3942p f11821x;

    static {
        C2012d c2012d = new C2012d("vision.barcode", 1L);
        f11799b = c2012d;
        C2012d c2012d2 = new C2012d("vision.custom.ica", 1L);
        f11800c = c2012d2;
        C2012d c2012d3 = new C2012d("vision.face", 1L);
        f11801d = c2012d3;
        C2012d c2012d4 = new C2012d("vision.ica", 1L);
        f11802e = c2012d4;
        C2012d c2012d5 = new C2012d("vision.ocr", 1L);
        f11803f = c2012d5;
        f11804g = new C2012d("mlkit.ocr.chinese", 1L);
        f11805h = new C2012d("mlkit.ocr.common", 1L);
        f11806i = new C2012d("mlkit.ocr.devanagari", 1L);
        f11807j = new C2012d("mlkit.ocr.japanese", 1L);
        f11808k = new C2012d("mlkit.ocr.korean", 1L);
        C2012d c2012d6 = new C2012d("mlkit.langid", 1L);
        f11809l = c2012d6;
        C2012d c2012d7 = new C2012d("mlkit.nlclassifier", 1L);
        f11810m = c2012d7;
        C2012d c2012d8 = new C2012d("tflite_dynamite", 1L);
        f11811n = c2012d8;
        C2012d c2012d9 = new C2012d("mlkit.barcode.ui", 1L);
        f11812o = c2012d9;
        C2012d c2012d10 = new C2012d("mlkit.smartreply", 1L);
        f11813p = c2012d10;
        f11814q = new C2012d("mlkit.image.caption", 1L);
        f11815r = new C2012d("mlkit.docscan.detect", 1L);
        f11816s = new C2012d("mlkit.docscan.crop", 1L);
        f11817t = new C2012d("mlkit.docscan.enhance", 1L);
        f11818u = new C2012d("mlkit.quality.aesthetic", 1L);
        f11819v = new C2012d("mlkit.quality.technical", 1L);
        C3941o c3941o = new C3941o();
        c3941o.a("barcode", c2012d);
        c3941o.a("custom_ica", c2012d2);
        c3941o.a(HVRetakeActivity.FACE_TAG, c2012d3);
        c3941o.a("ica", c2012d4);
        c3941o.a("ocr", c2012d5);
        c3941o.a("langid", c2012d6);
        c3941o.a("nlclassifier", c2012d7);
        c3941o.a("tflite_dynamite", c2012d8);
        c3941o.a("barcode_ui", c2012d9);
        c3941o.a("smart_reply", c2012d10);
        f11820w = c3941o.b();
        C3941o c3941o2 = new C3941o();
        c3941o2.a("com.google.android.gms.vision.barcode", c2012d);
        c3941o2.a("com.google.android.gms.vision.custom.ica", c2012d2);
        c3941o2.a("com.google.android.gms.vision.face", c2012d3);
        c3941o2.a("com.google.android.gms.vision.ica", c2012d4);
        c3941o2.a("com.google.android.gms.vision.ocr", c2012d5);
        c3941o2.a("com.google.android.gms.mlkit.langid", c2012d6);
        c3941o2.a("com.google.android.gms.mlkit.nlclassifier", c2012d7);
        c3941o2.a("com.google.android.gms.tflite_dynamite", c2012d8);
        c3941o2.a("com.google.android.gms.mlkit_smartreply", c2012d10);
        f11821x = c3941o2.b();
    }

    public static boolean a(Context context, List list) {
        if (C2018j.h().b(context) >= 221500000) {
            return b(context, f(f11821x, list));
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.d(context, DynamiteModule.f23553b, (String) it.next());
            }
            return true;
        } catch (DynamiteModule.a unused) {
            return false;
        }
    }

    public static boolean b(Context context, final C2012d[] c2012dArr) {
        try {
            return ((Z6.b) AbstractC0789m.a(Z6.c.a(context).i(new S6.i() { // from class: X8.A
                @Override // S6.i
                public final C2012d[] a() {
                    C2012d[] c2012dArr2 = c2012dArr;
                    C2012d[] c2012dArr3 = l.f11798a;
                    return c2012dArr2;
                }
            }).d(new InterfaceC0782f() { // from class: X8.B
                @Override // D7.InterfaceC0782f
                public final void b(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).j();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void c(Context context, String str) {
        d(context, AbstractC3939m.r(str));
    }

    public static void d(Context context, List list) {
        if (C2018j.h().b(context) >= 221500000) {
            e(context, f(f11820w, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void e(Context context, final C2012d[] c2012dArr) {
        Z6.c.a(context).o(Z6.f.d().a(new S6.i() { // from class: X8.C
            @Override // S6.i
            public final C2012d[] a() {
                C2012d[] c2012dArr2 = c2012dArr;
                C2012d[] c2012dArr3 = l.f11798a;
                return c2012dArr2;
            }
        }).b()).d(new InterfaceC0782f() { // from class: X8.D
            @Override // D7.InterfaceC0782f
            public final void b(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static C2012d[] f(Map map, List list) {
        C2012d[] c2012dArr = new C2012d[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            c2012dArr[i10] = (C2012d) AbstractC1287s.m((C2012d) map.get(list.get(i10)));
        }
        return c2012dArr;
    }
}
