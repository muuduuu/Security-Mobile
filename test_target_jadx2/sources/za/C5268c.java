package za;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Jd.N;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import expo.modules.clipboard.GetImageOptions;
import expo.modules.clipboard.GetStringOptions;
import expo.modules.clipboard.SetStringOptions;
import expo.modules.clipboard.StringFormat;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lc.o;
import lc.t;
import org.conscrypt.BuildConfig;
import pc.AbstractC3868b;
import q1.AbstractC3901a;
import u5.C4870a;
import vb.C5006a;
import vb.EnumC5010e;
import wc.InterfaceC5068n;
import xb.AbstractC5139a;
import xc.C5142C;
import za.C5268c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00060\u0012R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u0004\u0018\u00010\u001e*\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lza/c;", "Lxb/a;", "<init>", "()V", BuildConfig.FLAVOR, "mimeType", BuildConfig.FLAVOR, "p", "(Ljava/lang/String;)Z", "Lxb/c;", "b", "()Lxb/c;", "Ljava/io/File;", "d", "Lkotlin/Lazy;", "q", "()Ljava/io/File;", "clipboardCacheDir", "Lza/c$a;", "e", "Lza/c$a;", "clipboardEventEmitter", "Landroid/content/Context;", "s", "()Landroid/content/Context;", "context", "Landroid/content/ClipboardManager;", "r", "()Landroid/content/ClipboardManager;", "clipboardManager", "Landroid/content/ClipData$Item;", "t", "(Landroid/content/ClipboardManager;)Landroid/content/ClipData$Item;", "firstItem", C4870a.f43493a, "expo-clipboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: za.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5268c extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy clipboardCacheDir = lc.i.a(new C0684c());

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a clipboardEventEmitter;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: za.c$a */
    final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f45825a = true;

        /* renamed from: b, reason: collision with root package name */
        private long f45826b = -1;

        /* renamed from: c, reason: collision with root package name */
        private final ClipboardManager.OnPrimaryClipChangedListener f45827c;

        /* renamed from: d, reason: collision with root package name */
        private final ClipboardManager f45828d;

        public a() {
            Object b10;
            this.f45827c = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: za.b
                @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
                public final void onPrimaryClipChanged() {
                    C5268c.a.d(C5268c.this, this);
                }
            };
            try {
                o.a aVar = lc.o.f37128b;
                b10 = lc.o.b(C5268c.this.r());
            } catch (Throwable th) {
                o.a aVar2 = lc.o.f37128b;
                b10 = lc.o.b(lc.p.a(th));
            }
            this.f45828d = (ClipboardManager) (lc.o.f(b10) ? null : b10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(C5268c this$0, a this$1) {
            ClipDescription primaryClipDescription;
            boolean f10;
            long timestamp;
            long timestamp2;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (this$0.a().o()) {
                ClipboardManager clipboardManager = this$1.f45828d;
                if (!this$1.f45825a) {
                    clipboardManager = null;
                }
                if (clipboardManager == null || (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) == null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    long j10 = this$1.f45826b;
                    timestamp = primaryClipDescription.getTimestamp();
                    if (j10 == timestamp) {
                        return;
                    }
                    timestamp2 = primaryClipDescription.getTimestamp();
                    this$1.f45826b = timestamp2;
                }
                za.f fVar = za.f.PLAIN_TEXT;
                f10 = AbstractC5269d.f(primaryClipDescription);
                if (!f10) {
                    fVar = null;
                }
                za.f fVar2 = za.f.HTML;
                if (!primaryClipDescription.hasMimeType("text/html")) {
                    fVar2 = null;
                }
                List o10 = CollectionsKt.o(fVar, fVar2, primaryClipDescription.hasMimeType("image/*") ? za.f.IMAGE : null);
                ArrayList arrayList = new ArrayList(CollectionsKt.u(o10, 10));
                Iterator it = o10.iterator();
                while (it.hasNext()) {
                    arrayList.add(((za.f) it.next()).getJsName());
                }
                this$0.f("onClipboardChanged", androidx.core.os.c.b(t.a("contentTypes", arrayList)));
            }
        }

        public final Object b() {
            Unit unit;
            String str;
            ClipboardManager clipboardManager = this.f45828d;
            if (clipboardManager != null) {
                clipboardManager.addPrimaryClipChangedListener(this.f45827c);
                unit = Unit.f36324a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return unit;
            }
            str = AbstractC5269d.f45852a;
            return Integer.valueOf(Log.e(str, "'CLIPBOARD_SERVICE' unavailable. Events won't be received"));
        }

        public final Unit c() {
            ClipboardManager clipboardManager = this.f45828d;
            if (clipboardManager == null) {
                return null;
            }
            clipboardManager.removePrimaryClipChangedListener(this.f45827c);
            return Unit.f36324a;
        }

        public final void e() {
            this.f45825a = false;
        }

        public final void f() {
            this.f45825a = true;
        }
    }

    /* renamed from: za.c$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45830a;

        static {
            int[] iArr = new int[StringFormat.values().length];
            try {
                iArr[StringFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StringFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45830a = iArr;
        }
    }

    /* renamed from: za.c$c, reason: collision with other inner class name */
    static final class C0684c extends xc.m implements Function0 {
        C0684c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = new File(C5268c.this.s().getCacheDir(), ".clipboard");
            file.mkdirs();
            return file;
        }
    }

    /* renamed from: za.c$d */
    public static final class d extends xc.m implements Function2 {
        public d() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, pb.m promise) {
            Intrinsics.checkNotNullParameter(objArr, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            C5268c c5268c = C5268c.this;
            ClipData.Item t10 = c5268c.t(c5268c.r());
            int i10 = b.f45830a[((GetStringOptions) promise).getPreferredFormat().ordinal()];
            if (i10 == 1) {
                if (t10 != null) {
                    AbstractC5269d.e(t10, C5268c.this.s());
                }
            } else {
                if (i10 != 2) {
                    throw new lc.m();
                }
                if (t10 != null) {
                    t10.coerceToHtmlText(C5268c.this.s());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (pb.m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: za.c$e */
    public static final class e extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final e f45833a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(GetStringOptions.class);
        }
    }

    /* renamed from: za.c$f */
    public static final class f extends xc.m implements Function1 {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            GetStringOptions getStringOptions = (GetStringOptions) objArr[0];
            C5268c c5268c = C5268c.this;
            ClipData.Item t10 = c5268c.t(c5268c.r());
            int i10 = b.f45830a[getStringOptions.getPreferredFormat().ordinal()];
            String str = null;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new lc.m();
                }
                if (t10 != null) {
                    str = t10.coerceToHtmlText(C5268c.this.s());
                }
            } else if (t10 != null) {
                str = AbstractC5269d.e(t10, C5268c.this.s());
            }
            return str == null ? BuildConfig.FLAVOR : str;
        }
    }

    /* renamed from: za.c$g */
    public static final class g extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f45835a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: za.c$h */
    public static final class h extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f45836a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(SetStringOptions.class);
        }
    }

    /* renamed from: za.c$i */
    public static final class i extends xc.m implements Function1 {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            ClipData newPlainText;
            String g10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            String str = (String) objArr[0];
            int i10 = b.f45830a[((SetStringOptions) objArr[1]).getInputFormat().ordinal()];
            if (i10 == 1) {
                newPlainText = ClipData.newPlainText(null, str);
            } else {
                if (i10 != 2) {
                    throw new lc.m();
                }
                g10 = AbstractC5269d.g(str);
                newPlainText = ClipData.newHtmlText(null, g10, str);
            }
            C5268c.this.r().setPrimaryClip(newPlainText);
            return Boolean.TRUE;
        }
    }

    /* renamed from: za.c$j */
    public static final class j extends xc.m implements Function1 {
        public j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ClipDescription primaryClipDescription = C5268c.this.r().getPrimaryClipDescription();
            return Boolean.valueOf(primaryClipDescription != null ? AbstractC5269d.f(primaryClipDescription) : false);
        }
    }

    /* renamed from: za.c$k */
    public static final class k extends xc.m implements Function1 {
        public k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            ClipDescription primaryClipDescription = C5268c.this.r().getPrimaryClipDescription();
            boolean z10 = false;
            if (primaryClipDescription != null && primaryClipDescription.hasMimeType("image/*")) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: za.c$l */
    public static final class l extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final l f45840a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(GetImageOptions.class);
        }
    }

    /* renamed from: za.c$m */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f45841a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f45842b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5268c f45843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(kotlin.coroutines.d dVar, C5268c c5268c) {
            super(3, dVar);
            this.f45843c = c5268c;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            m mVar = new m(dVar, this.f45843c);
            mVar.f45842b = objArr;
            return mVar.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ClipData.Item t10;
            Object e10 = AbstractC3868b.e();
            int i10 = this.f45841a;
            try {
                if (i10 == 0) {
                    lc.p.b(obj);
                    GetImageOptions getImageOptions = (GetImageOptions) ((Object[]) this.f45842b)[0];
                    ClipboardManager r10 = this.f45843c.r();
                    if (!this.f45843c.p("image/*")) {
                        r10 = null;
                    }
                    Uri uri = (r10 == null || (t10 = this.f45843c.t(r10)) == null) ? null : t10.getUri();
                    if (uri == null) {
                        return null;
                    }
                    Context s10 = this.f45843c.s();
                    this.f45841a = 1;
                    obj = expo.modules.clipboard.a.f(s10, uri, getImageOptions, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                }
                return ((za.h) obj).a();
            } catch (Throwable th) {
                th.printStackTrace();
                if (th instanceof CodedException) {
                    throw th;
                }
                throw (th instanceof SecurityException ? new za.j(th) : new za.k(th, "image"));
            }
        }
    }

    /* renamed from: za.c$n */
    public static final class n extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final n f45844a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: za.c$o */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC5068n {

        /* renamed from: a, reason: collision with root package name */
        int f45845a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f45846b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C5268c f45847c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(kotlin.coroutines.d dVar, C5268c c5268c) {
            super(3, dVar);
            this.f45847c = c5268c;
        }

        @Override // wc.InterfaceC5068n
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object n(N n10, Object[] objArr, kotlin.coroutines.d dVar) {
            o oVar = new o(dVar, this.f45847c);
            oVar.f45846b = objArr;
            return oVar.invokeSuspend(Unit.f36324a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e10 = AbstractC3868b.e();
            int i10 = this.f45845a;
            try {
                if (i10 == 0) {
                    lc.p.b(obj);
                    String str = (String) ((Object[]) this.f45846b)[0];
                    Context s10 = this.f45847c.s();
                    File q10 = this.f45847c.q();
                    this.f45845a = 1;
                    obj = expo.modules.clipboard.a.c(s10, str, q10, this);
                    if (obj == e10) {
                        return e10;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    lc.p.b(obj);
                }
                this.f45847c.r().setPrimaryClip((ClipData) obj);
                return Unit.f36324a;
            } finally {
            }
        }
    }

    /* renamed from: za.c$p */
    public static final class p extends xc.m implements Function0 {
        public p() {
            super(0);
        }

        public final void a() {
            a aVar = C5268c.this.clipboardEventEmitter;
            if (aVar == null) {
                Intrinsics.v("clipboardEventEmitter");
                aVar = null;
            }
            aVar.e();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: za.c$q */
    public static final class q extends xc.m implements Function0 {
        public q() {
            super(0);
        }

        public final void a() {
            a aVar = C5268c.this.clipboardEventEmitter;
            if (aVar == null) {
                Intrinsics.v("clipboardEventEmitter");
                aVar = null;
            }
            aVar.f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: za.c$r */
    public static final class r extends xc.m implements Function0 {
        public r() {
            super(0);
        }

        public final void a() {
            C5268c c5268c = C5268c.this;
            c5268c.clipboardEventEmitter = c5268c.new a();
            a aVar = C5268c.this.clipboardEventEmitter;
            if (aVar == null) {
                Intrinsics.v("clipboardEventEmitter");
                aVar = null;
            }
            aVar.b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* renamed from: za.c$s */
    public static final class s extends xc.m implements Function0 {
        public s() {
            super(0);
        }

        public final void a() {
            a aVar = C5268c.this.clipboardEventEmitter;
            if (aVar == null) {
                Intrinsics.v("clipboardEventEmitter");
                aVar = null;
            }
            aVar.c();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(String mimeType) {
        ClipDescription primaryClipDescription = r().getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType(mimeType);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File q() {
        return (File) this.clipboardCacheDir.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipboardManager r() {
        Object systemService = s().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        throw new za.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context s() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClipData.Item t(ClipboardManager clipboardManager) {
        ClipData primaryClip = clipboardManager.getPrimaryClip();
        if (primaryClip == null) {
            return null;
        }
        if (primaryClip.getItemCount() <= 0) {
            primaryClip = null;
        }
        if (primaryClip != null) {
            return primaryClip.getItemAt(0);
        }
        return null;
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        wb.g kVar;
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoClipboard");
            if (Intrinsics.b(GetStringOptions.class, pb.m.class)) {
                kVar = new wb.f("getStringAsync", new C0792a[0], new d());
            } else {
                C0792a c0792a = (C0792a) C0794c.f1454a.a().get(new Pair(C5142C.b(GetStringOptions.class), Boolean.FALSE));
                if (c0792a == null) {
                    c0792a = new C0792a(new M(C5142C.b(GetStringOptions.class), false, e.f45833a));
                }
                C0792a[] c0792aArr = {c0792a};
                f fVar = new f();
                kVar = Intrinsics.b(String.class, Integer.TYPE) ? new wb.k("getStringAsync", c0792aArr, fVar) : Intrinsics.b(String.class, Boolean.TYPE) ? new wb.h("getStringAsync", c0792aArr, fVar) : Intrinsics.b(String.class, Double.TYPE) ? new wb.i("getStringAsync", c0792aArr, fVar) : Intrinsics.b(String.class, Float.TYPE) ? new wb.j("getStringAsync", c0792aArr, fVar) : Intrinsics.b(String.class, String.class) ? new wb.m("getStringAsync", c0792aArr, fVar) : new wb.e("getStringAsync", c0792aArr, fVar);
            }
            bVar.k().put("getStringAsync", kVar);
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(String.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(String.class), false, g.f45835a));
            }
            C0792a c0792a3 = (C0792a) c0794c.a().get(new Pair(C5142C.b(SetStringOptions.class), bool));
            if (c0792a3 == null) {
                c0792a3 = new C0792a(new M(C5142C.b(SetStringOptions.class), false, h.f45836a));
            }
            C0792a[] c0792aArr2 = {c0792a2, c0792a3};
            i iVar = new i();
            Class cls = Integer.TYPE;
            bVar.k().put("setStringAsync", Intrinsics.b(Boolean.class, cls) ? new wb.k("setStringAsync", c0792aArr2, iVar) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("setStringAsync", c0792aArr2, iVar) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("setStringAsync", c0792aArr2, iVar) : Intrinsics.b(Boolean.class, Float.TYPE) ? new wb.j("setStringAsync", c0792aArr2, iVar) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("setStringAsync", c0792aArr2, iVar) : new wb.e("setStringAsync", c0792aArr2, iVar));
            C0792a[] c0792aArr3 = new C0792a[0];
            j jVar = new j();
            bVar.k().put("hasStringAsync", Intrinsics.b(Boolean.class, cls) ? new wb.k("hasStringAsync", c0792aArr3, jVar) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("hasStringAsync", c0792aArr3, jVar) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("hasStringAsync", c0792aArr3, jVar) : Intrinsics.b(Boolean.class, Float.TYPE) ? new wb.j("hasStringAsync", c0792aArr3, jVar) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("hasStringAsync", c0792aArr3, jVar) : new wb.e("hasStringAsync", c0792aArr3, jVar));
            wb.d a10 = bVar.a("getImageAsync");
            String b11 = a10.b();
            C0792a c0792a4 = (C0792a) c0794c.a().get(new Pair(C5142C.b(GetImageOptions.class), bool));
            if (c0792a4 == null) {
                c0792a4 = new C0792a(new M(C5142C.b(GetImageOptions.class), false, l.f45840a));
            }
            a10.c(new wb.o(b11, new C0792a[]{c0792a4}, new m(null, this)));
            wb.d a11 = bVar.a("setImageAsync");
            String b12 = a11.b();
            C0792a c0792a5 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a5 == null) {
                c0792a5 = new C0792a(new M(C5142C.b(String.class), false, n.f45844a));
            }
            a11.c(new wb.o(b12, new C0792a[]{c0792a5}, new o(null, this)));
            C0792a[] c0792aArr4 = new C0792a[0];
            k kVar2 = new k();
            bVar.k().put("hasImageAsync", Intrinsics.b(Boolean.class, cls) ? new wb.k("hasImageAsync", c0792aArr4, kVar2) : Intrinsics.b(Boolean.class, Boolean.TYPE) ? new wb.h("hasImageAsync", c0792aArr4, kVar2) : Intrinsics.b(Boolean.class, Double.TYPE) ? new wb.i("hasImageAsync", c0792aArr4, kVar2) : Intrinsics.b(Boolean.class, Float.TYPE) ? new wb.j("hasImageAsync", c0792aArr4, kVar2) : Intrinsics.b(Boolean.class, String.class) ? new wb.m("hasImageAsync", c0792aArr4, kVar2) : new wb.e("hasImageAsync", c0792aArr4, kVar2));
            bVar.d("onClipboardChanged");
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.MODULE_CREATE;
            s10.put(enumC5010e, new C5006a(enumC5010e, new r()));
            Map s11 = bVar.s();
            EnumC5010e enumC5010e2 = EnumC5010e.MODULE_DESTROY;
            s11.put(enumC5010e2, new C5006a(enumC5010e2, new s()));
            Map s12 = bVar.s();
            EnumC5010e enumC5010e3 = EnumC5010e.ACTIVITY_ENTERS_BACKGROUND;
            s12.put(enumC5010e3, new C5006a(enumC5010e3, new p()));
            Map s13 = bVar.s();
            EnumC5010e enumC5010e4 = EnumC5010e.ACTIVITY_ENTERS_FOREGROUND;
            s13.put(enumC5010e4, new C5006a(enumC5010e4, new q()));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
