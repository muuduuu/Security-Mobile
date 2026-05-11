package Aa;

import Ea.d;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jb.InterfaceC3521a;
import kotlin.collections.CollectionsKt;
import kotlin.collections.G;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.t;
import qc.AbstractC3958a;

/* loaded from: classes2.dex */
public class b implements d, InterfaceC3521a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f398d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f399a;

    /* renamed from: b, reason: collision with root package name */
    private int f400b;

    /* renamed from: c, reason: collision with root package name */
    private final String f401c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(float f10, Context context) {
            return (int) (f10 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Aa.b$b, reason: collision with other inner class name */
    public static final class EnumC0007b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC0007b[] $VALUES;
        public static final EnumC0007b BARE = new EnumC0007b("BARE", 0, "bare");
        public static final EnumC0007b STANDALONE = new EnumC0007b("STANDALONE", 1, "standalone");
        public static final EnumC0007b STORE_CLIENT = new EnumC0007b("STORE_CLIENT", 2, "storeClient");
        private final String string;

        private static final /* synthetic */ EnumC0007b[] $values() {
            return new EnumC0007b[]{BARE, STANDALONE, STORE_CLIENT};
        }

        static {
            EnumC0007b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC3958a.a($values);
        }

        private EnumC0007b(String str, int i10, String str2) {
            this.string = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static EnumC0007b valueOf(String str) {
            return (EnumC0007b) Enum.valueOf(EnumC0007b.class, str);
        }

        public static EnumC0007b[] values() {
            return (EnumC0007b[]) $VALUES.clone();
        }

        public final String getString() {
            return this.string;
        }
    }

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f399a = context;
        Integer valueOf = Integer.valueOf(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        this.f400b = (valueOf.intValue() <= 0 ? null : valueOf) != null ? f398d.b(context.getResources().getDimensionPixelSize(r0.intValue()), context) : 0;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f401c = uuid;
    }

    private final String a() {
        String str;
        try {
            InputStream open = this.f399a.getAssets().open("app.config");
            try {
                String j10 = ue.d.j(open, StandardCharsets.UTF_8);
                kotlin.io.c.a(open, null);
                return j10;
            } finally {
            }
        } catch (FileNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            str = c.f402a;
            Log.e(str, "Error reading embedded app config", e10);
            return null;
        }
    }

    public String b() {
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        return MODEL;
    }

    public List d() {
        return CollectionsKt.m("normal", "notoserif", "sans-serif", "sans-serif-light", "sans-serif-thin", "sans-serif-condensed", "sans-serif-medium", "serif", "Roboto", "monospace");
    }

    @Override // Ea.d
    public List e() {
        return CollectionsKt.e(InterfaceC3521a.class);
    }

    public String f() {
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return RELEASE;
    }

    @Override // jb.InterfaceC3521a
    public Map getConstants() {
        return G.l(t.a("sessionId", this.f401c), t.a("executionEnvironment", EnumC0007b.BARE.getString()), t.a("statusBarHeight", Integer.valueOf(this.f400b)), t.a("deviceName", b()), t.a("systemFonts", d()), t.a("systemVersion", f()), t.a("manifest", a()), t.a("platform", G.e(t.a("android", G.h()))));
    }
}
