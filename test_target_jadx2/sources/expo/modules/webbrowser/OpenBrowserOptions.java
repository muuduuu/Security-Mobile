package expo.modules.webbrowser;

import Ab.b;
import Ab.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b#\b\u0080\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015Jf\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010#\u0012\u0004\b'\u0010(\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010&R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010#\u0012\u0004\b+\u0010(\u001a\u0004\b)\u0010\u0010\"\u0004\b*\u0010&R*\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010,\u0012\u0004\b0\u0010(\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010/R(\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00101\u0012\u0004\b5\u0010(\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u00104R(\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u00101\u0012\u0004\b8\u0010(\u001a\u0004\b6\u0010\u0015\"\u0004\b7\u00104R(\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u00101\u0012\u0004\b;\u0010(\u001a\u0004\b9\u0010\u0015\"\u0004\b:\u00104R(\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u00101\u0012\u0004\b>\u0010(\u001a\u0004\b<\u0010\u0015\"\u0004\b=\u00104R(\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u00101\u0012\u0004\bA\u0010(\u001a\u0004\b?\u0010\u0015\"\u0004\b@\u00104¨\u0006B"}, d2 = {"Lexpo/modules/webbrowser/OpenBrowserOptions;", "LAb/c;", BuildConfig.FLAVOR, "toolbarColor", "secondaryToolbarColor", BuildConfig.FLAVOR, "browserPackage", BuildConfig.FLAVOR, "showTitle", "enableDefaultShareMenuItem", "enableBarCollapsing", "showInRecents", "shouldCreateTask", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZZZZ)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZZZZZ)Lexpo/modules/webbrowser/OpenBrowserOptions;", "toString", "hashCode", "()I", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getToolbarColor", "setToolbarColor", "(Ljava/lang/Integer;)V", "getToolbarColor$annotations", "()V", "getSecondaryToolbarColor", "setSecondaryToolbarColor", "getSecondaryToolbarColor$annotations", "Ljava/lang/String;", "getBrowserPackage", "setBrowserPackage", "(Ljava/lang/String;)V", "getBrowserPackage$annotations", "Z", "getShowTitle", "setShowTitle", "(Z)V", "getShowTitle$annotations", "getEnableDefaultShareMenuItem", "setEnableDefaultShareMenuItem", "getEnableDefaultShareMenuItem$annotations", "getEnableBarCollapsing", "setEnableBarCollapsing", "getEnableBarCollapsing$annotations", "getShowInRecents", "setShowInRecents", "getShowInRecents$annotations", "getShouldCreateTask", "setShouldCreateTask", "getShouldCreateTask$annotations", "expo-web-browser_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpenBrowserOptions implements c {
    private String browserPackage;
    private boolean enableBarCollapsing;
    private boolean enableDefaultShareMenuItem;
    private Integer secondaryToolbarColor;
    private boolean shouldCreateTask;
    private boolean showInRecents;
    private boolean showTitle;
    private Integer toolbarColor;

    public OpenBrowserOptions() {
        this(null, null, null, false, false, false, false, false, 255, null);
    }

    @b
    public static /* synthetic */ void getBrowserPackage$annotations() {
    }

    @b
    public static /* synthetic */ void getEnableBarCollapsing$annotations() {
    }

    @b
    public static /* synthetic */ void getEnableDefaultShareMenuItem$annotations() {
    }

    @b
    public static /* synthetic */ void getSecondaryToolbarColor$annotations() {
    }

    @b(key = "createTask")
    public static /* synthetic */ void getShouldCreateTask$annotations() {
    }

    @b
    public static /* synthetic */ void getShowInRecents$annotations() {
    }

    @b
    public static /* synthetic */ void getShowTitle$annotations() {
    }

    @b
    public static /* synthetic */ void getToolbarColor$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getToolbarColor() {
        return this.toolbarColor;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getSecondaryToolbarColor() {
        return this.secondaryToolbarColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowTitle() {
        return this.showTitle;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnableDefaultShareMenuItem() {
        return this.enableDefaultShareMenuItem;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getEnableBarCollapsing() {
        return this.enableBarCollapsing;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShowInRecents() {
        return this.showInRecents;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldCreateTask() {
        return this.shouldCreateTask;
    }

    public final OpenBrowserOptions copy(Integer toolbarColor, Integer secondaryToolbarColor, String browserPackage, boolean showTitle, boolean enableDefaultShareMenuItem, boolean enableBarCollapsing, boolean showInRecents, boolean shouldCreateTask) {
        return new OpenBrowserOptions(toolbarColor, secondaryToolbarColor, browserPackage, showTitle, enableDefaultShareMenuItem, enableBarCollapsing, showInRecents, shouldCreateTask);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenBrowserOptions)) {
            return false;
        }
        OpenBrowserOptions openBrowserOptions = (OpenBrowserOptions) other;
        return Intrinsics.b(this.toolbarColor, openBrowserOptions.toolbarColor) && Intrinsics.b(this.secondaryToolbarColor, openBrowserOptions.secondaryToolbarColor) && Intrinsics.b(this.browserPackage, openBrowserOptions.browserPackage) && this.showTitle == openBrowserOptions.showTitle && this.enableDefaultShareMenuItem == openBrowserOptions.enableDefaultShareMenuItem && this.enableBarCollapsing == openBrowserOptions.enableBarCollapsing && this.showInRecents == openBrowserOptions.showInRecents && this.shouldCreateTask == openBrowserOptions.shouldCreateTask;
    }

    public final String getBrowserPackage() {
        return this.browserPackage;
    }

    public final boolean getEnableBarCollapsing() {
        return this.enableBarCollapsing;
    }

    public final boolean getEnableDefaultShareMenuItem() {
        return this.enableDefaultShareMenuItem;
    }

    public final Integer getSecondaryToolbarColor() {
        return this.secondaryToolbarColor;
    }

    public final boolean getShouldCreateTask() {
        return this.shouldCreateTask;
    }

    public final boolean getShowInRecents() {
        return this.showInRecents;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public final Integer getToolbarColor() {
        return this.toolbarColor;
    }

    public int hashCode() {
        Integer num = this.toolbarColor;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.secondaryToolbarColor;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.browserPackage;
        return ((((((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.showTitle)) * 31) + Boolean.hashCode(this.enableDefaultShareMenuItem)) * 31) + Boolean.hashCode(this.enableBarCollapsing)) * 31) + Boolean.hashCode(this.showInRecents)) * 31) + Boolean.hashCode(this.shouldCreateTask);
    }

    public final void setBrowserPackage(String str) {
        this.browserPackage = str;
    }

    public final void setEnableBarCollapsing(boolean z10) {
        this.enableBarCollapsing = z10;
    }

    public final void setEnableDefaultShareMenuItem(boolean z10) {
        this.enableDefaultShareMenuItem = z10;
    }

    public final void setSecondaryToolbarColor(Integer num) {
        this.secondaryToolbarColor = num;
    }

    public final void setShouldCreateTask(boolean z10) {
        this.shouldCreateTask = z10;
    }

    public final void setShowInRecents(boolean z10) {
        this.showInRecents = z10;
    }

    public final void setShowTitle(boolean z10) {
        this.showTitle = z10;
    }

    public final void setToolbarColor(Integer num) {
        this.toolbarColor = num;
    }

    public String toString() {
        return "OpenBrowserOptions(toolbarColor=" + this.toolbarColor + ", secondaryToolbarColor=" + this.secondaryToolbarColor + ", browserPackage=" + this.browserPackage + ", showTitle=" + this.showTitle + ", enableDefaultShareMenuItem=" + this.enableDefaultShareMenuItem + ", enableBarCollapsing=" + this.enableBarCollapsing + ", showInRecents=" + this.showInRecents + ", shouldCreateTask=" + this.shouldCreateTask + ")";
    }

    public OpenBrowserOptions(Integer num, Integer num2, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.toolbarColor = num;
        this.secondaryToolbarColor = num2;
        this.browserPackage = str;
        this.showTitle = z10;
        this.enableDefaultShareMenuItem = z11;
        this.enableBarCollapsing = z12;
        this.showInRecents = z13;
        this.shouldCreateTask = z14;
    }

    public /* synthetic */ OpenBrowserOptions(Integer num, Integer num2, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) == 0 ? str : null, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? false : z12, (i10 & 64) == 0 ? z13 : false, (i10 & 128) != 0 ? true : z14);
    }
}
