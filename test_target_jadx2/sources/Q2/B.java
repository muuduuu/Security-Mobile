package Q2;

import Jd.AbstractC0887i;
import Jd.C0874b0;
import Jd.J;
import Jd.N;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.app.B;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pc.AbstractC3868b;
import pe.InterfaceC3878f;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;

/* loaded from: classes.dex */
public abstract class B {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8050a;

        /* renamed from: b, reason: collision with root package name */
        Object f8051b;

        /* renamed from: c, reason: collision with root package name */
        Object f8052c;

        /* renamed from: d, reason: collision with root package name */
        Object f8053d;

        /* renamed from: e, reason: collision with root package name */
        Object f8054e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f8055f;

        /* renamed from: g, reason: collision with root package name */
        int f8056g;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8055f = obj;
            this.f8056g |= Integer.MIN_VALUE;
            return B.a(null, null, null, null, null, null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f8057a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f8058b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b0 f8059c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, b0 b0Var, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f8058b = file;
            this.f8059c = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new b(this.f8058b, this.f8059c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((b) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f8057a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            InterfaceC3878f b10 = M.b(M.e(this.f8058b));
            try {
                Long c10 = kotlin.coroutines.jvm.internal.b.c(b10.s0(this.f8059c));
                kotlin.io.c.a(b10, null);
                return c10;
            } finally {
            }
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f8060a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f8061b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f8062c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(A a10, Activity activity, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f8061b = a10;
            this.f8062c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new c(this.f8061b, this.f8062c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((c) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f8060a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            return this.f8061b.a(this.f8062c);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f8063a;

        /* renamed from: b, reason: collision with root package name */
        Object f8064b;

        /* renamed from: c, reason: collision with root package name */
        Object f8065c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f8066d;

        /* renamed from: e, reason: collision with root package name */
        int f8067e;

        d(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8066d = obj;
            this.f8067e |= Integer.MIN_VALUE;
            return B.b(null, null, null, null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* renamed from: a, reason: collision with root package name */
        int f8068a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ A f8069b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f8070c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(A a10, Activity activity, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f8069b = a10;
            this.f8070c = activity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
            return new e(this.f8069b, this.f8070c, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, kotlin.coroutines.d dVar) {
            return ((e) create(n10, dVar)).invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC3868b.e();
            if (this.f8068a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lc.p.b(obj);
            return B.c(this.f8069b, this.f8070c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(A a10, Activity activity, String str, String str2, String str3, String str4, kotlin.coroutines.d dVar) {
        a aVar;
        Object e10;
        int i10;
        File file;
        J b10;
        b bVar;
        String str5;
        Activity activity2;
        String str6;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.f8056g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f8056g = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f8055f;
                e10 = AbstractC3868b.e();
                i10 = aVar.f8056g;
                if (i10 != 0) {
                    lc.p.b(obj);
                    File cacheDir = activity.getCacheDir();
                    if (cacheDir == null) {
                        s.f8124a.b("Failed to obtain a valid cache directory for Chucker file export");
                        Toast.makeText(activity, K2.g.f5234m, 0).show();
                        return null;
                    }
                    File b11 = i.f8090a.b(cacheDir, str);
                    if (b11 == null) {
                        s.f8124a.b("Failed to create an export file for Chucker");
                        Toast.makeText(activity, K2.g.f5234m, 0).show();
                        return null;
                    }
                    J a11 = C0874b0.a();
                    c cVar = new c(a10, activity, null);
                    aVar.f8050a = activity;
                    aVar.f8051b = str2;
                    aVar.f8052c = str3;
                    aVar.f8053d = str4;
                    aVar.f8054e = b11;
                    aVar.f8056g = 1;
                    obj = AbstractC0887i.g(a11, cVar, aVar);
                    if (obj == e10) {
                        return e10;
                    }
                    file = b11;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        file = (File) aVar.f8054e;
                        str6 = (String) aVar.f8053d;
                        str5 = (String) aVar.f8052c;
                        str2 = (String) aVar.f8051b;
                        activity2 = (Activity) aVar.f8050a;
                        lc.p.b(obj);
                        Uri h10 = androidx.core.content.b.h(activity2, Intrinsics.m(activity2.getPackageName(), ".com.chuckerteam.chucker.provider"), file);
                        Intent e11 = B.a.d(activity2).j(activity2.getContentResolver().getType(h10)).f(str2).h(str5).g(h10).e();
                        Intrinsics.checkNotNullExpressionValue(e11, "from(activity)\n        .setType(activity.contentResolver.getType(uri))\n        .setChooserTitle(intentTitle)\n        .setSubject(intentSubject)\n        .setStream(uri)\n        .intent");
                        e11.setClipData(ClipData.newRawUri(str6, h10));
                        e11.addFlags(1);
                        return Intent.createChooser(e11, str2);
                    }
                    file = (File) aVar.f8054e;
                    str4 = (String) aVar.f8053d;
                    str3 = (String) aVar.f8052c;
                    str2 = (String) aVar.f8051b;
                    activity = (Activity) aVar.f8050a;
                    lc.p.b(obj);
                }
                b10 = C0874b0.b();
                bVar = new b(file, (b0) obj, null);
                aVar.f8050a = activity;
                aVar.f8051b = str2;
                aVar.f8052c = str3;
                aVar.f8053d = str4;
                aVar.f8054e = file;
                aVar.f8056g = 2;
                if (AbstractC0887i.g(b10, bVar, aVar) != e10) {
                    return e10;
                }
                str5 = str3;
                activity2 = activity;
                str6 = str4;
                Uri h102 = androidx.core.content.b.h(activity2, Intrinsics.m(activity2.getPackageName(), ".com.chuckerteam.chucker.provider"), file);
                Intent e112 = B.a.d(activity2).j(activity2.getContentResolver().getType(h102)).f(str2).h(str5).g(h102).e();
                Intrinsics.checkNotNullExpressionValue(e112, "from(activity)\n        .setType(activity.contentResolver.getType(uri))\n        .setChooserTitle(intentTitle)\n        .setSubject(intentSubject)\n        .setStream(uri)\n        .intent");
                e112.setClipData(ClipData.newRawUri(str6, h102));
                e112.addFlags(1);
                return Intent.createChooser(e112, str2);
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f8055f;
        e10 = AbstractC3868b.e();
        i10 = aVar.f8056g;
        if (i10 != 0) {
        }
        b10 = C0874b0.b();
        bVar = new b(file, (b0) obj2, null);
        aVar.f8050a = activity;
        aVar.f8051b = str2;
        aVar.f8052c = str3;
        aVar.f8053d = str4;
        aVar.f8054e = file;
        aVar.f8056g = 2;
        if (AbstractC0887i.g(b10, bVar, aVar) != e10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(A a10, Activity activity, String str, String str2, kotlin.coroutines.d dVar) {
        d dVar2;
        int i10;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.f8067e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f8067e = i11 - Integer.MIN_VALUE;
                Object obj = dVar2.f8066d;
                Object e10 = AbstractC3868b.e();
                i10 = dVar2.f8067e;
                if (i10 != 0) {
                    lc.p.b(obj);
                    J a11 = C0874b0.a();
                    e eVar = new e(a10, activity, null);
                    dVar2.f8063a = activity;
                    dVar2.f8064b = str;
                    dVar2.f8065c = str2;
                    dVar2.f8067e = 1;
                    obj = AbstractC0887i.g(a11, eVar, dVar2);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) dVar2.f8065c;
                    str = (String) dVar2.f8064b;
                    activity = (Activity) dVar2.f8063a;
                    lc.p.b(obj);
                }
                Intent c10 = B.a.d(activity).j("text/plain").f(str).h(str2).i((String) obj).c();
                Intrinsics.checkNotNullExpressionValue(c10, "from(activity)\n        .setType(\"text/plain\")\n        .setChooserTitle(intentTitle)\n        .setSubject(intentSubject)\n        .setText(content)\n        .createChooserIntent()");
                return c10;
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.f8066d;
        Object e102 = AbstractC3868b.e();
        i10 = dVar2.f8067e;
        if (i10 != 0) {
        }
        Intent c102 = B.a.d(activity).j("text/plain").f(str).h(str2).i((String) obj2).c();
        Intrinsics.checkNotNullExpressionValue(c102, "from(activity)\n        .setType(\"text/plain\")\n        .setChooserTitle(intentTitle)\n        .setSubject(intentSubject)\n        .setText(content)\n        .createChooserIntent()");
        return c102;
    }

    public static final String c(A a10, Context context) {
        Intrinsics.checkNotNullParameter(a10, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        InterfaceC3879g c10 = M.c(a10.a(context));
        try {
            String F12 = c10.F1();
            kotlin.io.c.a(c10, null);
            return F12;
        } finally {
        }
    }
}
