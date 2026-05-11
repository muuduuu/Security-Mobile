package Qa;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import Db.T;
import Db.U;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.net.Uri;
import expo.modules.kotlin.exception.l;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import q1.AbstractC3901a;
import w4.C5036a;
import wb.e;
import wb.h;
import wb.i;
import wb.j;
import wb.k;
import wb.q;
import xb.AbstractC5139a;
import xc.C5141B;
import xc.C5142C;
import xc.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LQa/b;", "Lxb/a;", "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "k", "()Ljava/util/List;", "Lxb/c;", "b", "()Lxb/c;", "Landroid/content/Context;", "j", "()Landroid/content/Context;", "context", "expo-font_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public class b extends AbstractC5139a {

    public static final class a extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8287a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: Qa.b$b, reason: collision with other inner class name */
    public static final class C0158b extends m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0158b f8288a = new C0158b();

        public C0158b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    public static final class c extends m implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C5141B f8290b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C5141B c5141b) {
            super(1);
            this.f8290b = c5141b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Typeface createFromFile;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Object obj = objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) obj;
            Context w10 = b.this.a().w();
            if (w10 == null) {
                throw new l();
            }
            if (StringsKt.F(str, "asset://", false, 2, null)) {
                AssetManager assets = w10.getAssets();
                String substring = str.substring(9);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                createFromFile = Typeface.createFromAsset(assets, substring);
                Intrinsics.d(createFromFile);
            } else {
                String path = Uri.parse(str).getPath();
                if (path == null) {
                    throw new Qa.a(str);
                }
                createFromFile = Typeface.createFromFile(new File(path));
                Intrinsics.d(createFromFile);
            }
            C5036a.f44315c.c().h(str2, 0, createFromFile);
            C5141B c5141b = this.f8290b;
            Set R02 = CollectionsKt.R0((Iterable) c5141b.f44962a);
            R02.add(str2);
            c5141b.f44962a = CollectionsKt.O0(R02);
            return Unit.f36324a;
        }
    }

    public static final class d extends m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5141B f8291a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C5141B c5141b) {
            super(1);
            this.f8291a = c5141b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f8291a.f44962a;
        }
    }

    private final Context j() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List k() {
        List b10;
        AssetManager assets = j().getAssets();
        Regex regex = new Regex("^(.+?)(_bold|_italic|_bold_italic)?\\.(ttf|otf)$");
        String[] list = assets.list("fonts/");
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                Intrinsics.d(str);
                MatchResult b11 = Regex.b(regex, str, 0, 2, null);
                String str2 = (b11 == null || (b10 = b11.b()) == null) ? null : (String) b10.get(1);
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (!StringsKt.Z((String) obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList == null ? CollectionsKt.j() : arrayList;
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            C5141B c5141b = new C5141B();
            c5141b.f44962a = k();
            bVar.o("ExpoFontLoader");
            C0792a[] c0792aArr = new C0792a[0];
            U u10 = U.f1425a;
            T t10 = (T) u10.a().get(C5142C.b(Object.class));
            if (t10 == null) {
                t10 = new T(C5142C.b(Object.class));
                u10.a().put(C5142C.b(Object.class), t10);
            }
            bVar.n().put("getLoadedFonts", new q("getLoadedFonts", c0792aArr, t10, new d(c5141b)));
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(String.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(String.class), false, a.f8287a));
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(String.class), bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(String.class), false, C0158b.f8288a));
            }
            C0792a[] c0792aArr2 = {c0792a, c0792a2};
            c cVar = new c(c5141b);
            bVar.k().put("loadAsync", Intrinsics.b(Unit.class, Integer.TYPE) ? new k("loadAsync", c0792aArr2, cVar) : Intrinsics.b(Unit.class, Boolean.TYPE) ? new h("loadAsync", c0792aArr2, cVar) : Intrinsics.b(Unit.class, Double.TYPE) ? new i("loadAsync", c0792aArr2, cVar) : Intrinsics.b(Unit.class, Float.TYPE) ? new j("loadAsync", c0792aArr2, cVar) : Intrinsics.b(Unit.class, String.class) ? new wb.m("loadAsync", c0792aArr2, cVar) : new e("loadAsync", c0792aArr2, cVar));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
