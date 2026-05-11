package gb;

import Db.C0792a;
import Db.C0794c;
import Db.M;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import expo.modules.intentlauncher.IntentLauncherParams;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.exception.l;
import hb.C3303a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import pb.m;
import q1.AbstractC3901a;
import vb.C5009d;
import vb.EnumC5010e;
import vb.j;
import wb.f;
import xb.AbstractC5139a;
import xc.C5142C;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lgb/a;", "Lxb/a;", "<init>", "()V", "Lxb/c;", "b", "()Lxb/c;", "Lpb/m;", "d", "Lpb/m;", "pendingPromise", "Landroid/content/Context;", "l", "()Landroid/content/Context;", "context", "expo-intent-launcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3215a extends AbstractC5139a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private m pendingPromise;

    /* renamed from: gb.a$a, reason: collision with other inner class name */
    public static final class C0488a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0488a f33642a = new C0488a();

        public C0488a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(String.class);
        }
    }

    /* renamed from: gb.a$b */
    public static final class b extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33643a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return C5142C.o(IntentLauncherParams.class);
        }
    }

    /* renamed from: gb.a$c */
    public static final class c extends xc.m implements Function2 {
        public c() {
            super(2);
        }

        public final void a(Object[] objArr, m promise) {
            CodedException unexpectedException;
            CodedException codedException;
            Bundle b10;
            Intrinsics.checkNotNullParameter(objArr, "<name for destructuring parameter 0>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            Object obj = objArr[0];
            IntentLauncherParams intentLauncherParams = (IntentLauncherParams) objArr[1];
            String str = (String) obj;
            if (C3215a.this.pendingPromise != null) {
                throw new C3303a();
            }
            Intent intent = new Intent(str);
            if (intentLauncherParams.getClassName() != null) {
                intent.setComponent(intentLauncherParams.getPackageName() != null ? new ComponentName(intentLauncherParams.getPackageName(), intentLauncherParams.getClassName()) : new ComponentName(C3215a.this.l(), intentLauncherParams.getClassName()));
            }
            if (intentLauncherParams.getData() != null && intentLauncherParams.getType() != null) {
                intent.setDataAndType(Uri.parse(intentLauncherParams.getData()), intentLauncherParams.getType());
            } else if (intentLauncherParams.getData() != null) {
                intent.setData(Uri.parse(intentLauncherParams.getData()));
            } else if (intentLauncherParams.getType() != null) {
                intent.setType(intentLauncherParams.getType());
            }
            Map<String, Object> extra = intentLauncherParams.getExtra();
            if (extra != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(G.d(extra.size()));
                Iterator<T> it = extra.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Double) {
                        value = Integer.valueOf((int) ((Number) value).doubleValue());
                    }
                    linkedHashMap.put(key, value);
                }
                b10 = AbstractC3216b.b(linkedHashMap);
                intent.putExtras(b10);
            }
            Integer flags = intentLauncherParams.getFlags();
            if (flags != null) {
                intent.addFlags(flags.intValue());
            }
            String category = intentLauncherParams.getCategory();
            if (category != null) {
                intent.addCategory(category);
            }
            try {
                C3215a.this.a().x().startActivityForResult(intent, 12);
                C3215a.this.pendingPromise = promise;
            } catch (Throwable th) {
                if (th instanceof CodedException) {
                    codedException = (CodedException) th;
                } else {
                    if (th instanceof Da.a) {
                        String a10 = ((Da.a) th).a();
                        Intrinsics.checkNotNullExpressionValue(a10, "getCode(...)");
                        unexpectedException = new CodedException(a10, th.getMessage(), th.getCause());
                    } else {
                        unexpectedException = new UnexpectedException(th);
                    }
                    codedException = unexpectedException;
                }
                promise.h(codedException);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (m) obj2);
            return Unit.f36324a;
        }
    }

    /* renamed from: gb.a$d */
    public static final class d extends xc.m implements Function2 {
        public d() {
            super(2);
        }

        public final void a(Activity sender, j payload) {
            Bundle extras;
            Intrinsics.checkNotNullParameter(sender, "sender");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.e() != 12) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("resultCode", payload.f());
            if (payload.d() != null) {
                Intent d10 = payload.d();
                if (d10 != null) {
                    bundle.putString("data", d10.toString());
                }
                Intent d11 = payload.d();
                if (d11 != null && (extras = d11.getExtras()) != null) {
                    bundle.putBundle("extra", extras);
                }
            }
            m mVar = C3215a.this.pendingPromise;
            if (mVar != null) {
                mVar.resolve(bundle);
            }
            C3215a.this.pendingPromise = null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Activity) obj, (j) obj2);
            return Unit.f36324a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context l() {
        Context w10 = a().w();
        if (w10 != null) {
            return w10;
        }
        throw new l();
    }

    @Override // xb.AbstractC5139a
    public xb.c b() {
        AbstractC3901a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            xb.b bVar = new xb.b(this);
            bVar.o("ExpoIntentLauncher");
            C0794c c0794c = C0794c.f1454a;
            kotlin.reflect.d b10 = C5142C.b(String.class);
            Boolean bool = Boolean.FALSE;
            C0792a c0792a = (C0792a) c0794c.a().get(new Pair(b10, bool));
            if (c0792a == null) {
                c0792a = new C0792a(new M(C5142C.b(String.class), false, C0488a.f33642a));
            }
            C0792a c0792a2 = (C0792a) c0794c.a().get(new Pair(C5142C.b(IntentLauncherParams.class), bool));
            if (c0792a2 == null) {
                c0792a2 = new C0792a(new M(C5142C.b(IntentLauncherParams.class), false, b.f33643a));
            }
            bVar.k().put("startActivity", new f("startActivity", new C0792a[]{c0792a, c0792a2}, new c()));
            Map s10 = bVar.s();
            EnumC5010e enumC5010e = EnumC5010e.ON_ACTIVITY_RESULT;
            s10.put(enumC5010e, new C5009d(enumC5010e, new d()));
            xb.c q10 = bVar.q();
            AbstractC3901a.f();
            return q10;
        } catch (Throwable th) {
            AbstractC3901a.f();
            throw th;
        }
    }
}
