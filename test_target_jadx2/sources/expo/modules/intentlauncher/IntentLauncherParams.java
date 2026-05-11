package expo.modules.intentlauncher;

import Ab.b;
import Ab.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u001e\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010Jp\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u0010R.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u0013R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\"\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u0010R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b/\u0010%\u001a\u0004\b.\u0010\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u0012\u0004\b1\u0010%\u001a\u0004\b0\u0010\u0010R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\"\u0012\u0004\b3\u0010%\u001a\u0004\b2\u0010\u0010¨\u00064"}, d2 = {"Lexpo/modules/intentlauncher/IntentLauncherParams;", "LAb/c;", BuildConfig.FLAVOR, "type", "category", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "extra", "data", BuildConfig.FLAVOR, "flags", "packageName", "className", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "component4", "component5", "()Ljava/lang/Integer;", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/intentlauncher/IntentLauncherParams;", "toString", "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "getCategory", "getCategory$annotations", "Ljava/util/Map;", "getExtra", "getExtra$annotations", "getData", "getData$annotations", "Ljava/lang/Integer;", "getFlags", "getFlags$annotations", "getPackageName", "getPackageName$annotations", "getClassName", "getClassName$annotations", "expo-intent-launcher_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IntentLauncherParams implements c {
    private final String category;
    private final String className;
    private final String data;
    private final Map<String, Object> extra;
    private final Integer flags;
    private final String packageName;
    private final String type;

    public IntentLauncherParams(String str, String str2, Map<String, ? extends Object> map, String str3, Integer num, String str4, String str5) {
        this.type = str;
        this.category = str2;
        this.extra = map;
        this.data = str3;
        this.flags = num;
        this.packageName = str4;
        this.className = str5;
    }

    public static /* synthetic */ IntentLauncherParams copy$default(IntentLauncherParams intentLauncherParams, String str, String str2, Map map, String str3, Integer num, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = intentLauncherParams.type;
        }
        if ((i10 & 2) != 0) {
            str2 = intentLauncherParams.category;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            map = intentLauncherParams.extra;
        }
        Map map2 = map;
        if ((i10 & 8) != 0) {
            str3 = intentLauncherParams.data;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            num = intentLauncherParams.flags;
        }
        Integer num2 = num;
        if ((i10 & 32) != 0) {
            str4 = intentLauncherParams.packageName;
        }
        String str8 = str4;
        if ((i10 & 64) != 0) {
            str5 = intentLauncherParams.className;
        }
        return intentLauncherParams.copy(str, str6, map2, str7, num2, str8, str5);
    }

    @b
    public static /* synthetic */ void getCategory$annotations() {
    }

    @b
    public static /* synthetic */ void getClassName$annotations() {
    }

    @b
    public static /* synthetic */ void getData$annotations() {
    }

    @b
    public static /* synthetic */ void getExtra$annotations() {
    }

    @b
    public static /* synthetic */ void getFlags$annotations() {
    }

    @b
    public static /* synthetic */ void getPackageName$annotations() {
    }

    @b
    public static /* synthetic */ void getType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final Map<String, Object> component3() {
        return this.extra;
    }

    /* renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getFlags() {
        return this.flags;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    public final IntentLauncherParams copy(String type, String category, Map<String, ? extends Object> extra, String data, Integer flags, String packageName, String className) {
        return new IntentLauncherParams(type, category, extra, data, flags, packageName, className);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntentLauncherParams)) {
            return false;
        }
        IntentLauncherParams intentLauncherParams = (IntentLauncherParams) other;
        return Intrinsics.b(this.type, intentLauncherParams.type) && Intrinsics.b(this.category, intentLauncherParams.category) && Intrinsics.b(this.extra, intentLauncherParams.extra) && Intrinsics.b(this.data, intentLauncherParams.data) && Intrinsics.b(this.flags, intentLauncherParams.flags) && Intrinsics.b(this.packageName, intentLauncherParams.packageName) && Intrinsics.b(this.className, intentLauncherParams.className);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getData() {
        return this.data;
    }

    public final Map<String, Object> getExtra() {
        return this.extra;
    }

    public final Integer getFlags() {
        return this.flags;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.category;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.extra;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.data;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.flags;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.packageName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.className;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "IntentLauncherParams(type=" + this.type + ", category=" + this.category + ", extra=" + this.extra + ", data=" + this.data + ", flags=" + this.flags + ", packageName=" + this.packageName + ", className=" + this.className + ")";
    }
}
