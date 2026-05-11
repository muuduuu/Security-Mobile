package expo.modules.imagepicker;

import Ab.b;
import Ab.c;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import eb.g;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u000f\u0012\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0004\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u0004\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010)\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010\u000f\u0012\u0004\b,\u0010\u0004\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R(\u0010-\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010\u000f\u0012\u0004\b0\u0010\u0004\u001a\u0004\b.\u0010\u0011\"\u0004\b/\u0010\u0013R.\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u0010\u0004\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010#\u001a\u0004\b;\u0010%\"\u0004\b<\u0010'R6\u0010>\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b>\u0010?\u0012\u0004\bD\u0010\u0004\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010F\u001a\u00020E8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bL\u0010\u0004\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR \u0010M\u001a\u00020\r8\u0006X\u0087D¢\u0006\u0012\n\u0004\bM\u0010\u000f\u0012\u0004\bO\u0010\u0004\u001a\u0004\bN\u0010\u0011R\u0011\u0010S\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerOptions;", "LAb/c;", "Ljava/io/Serializable;", "<init>", "()V", BuildConfig.FLAVOR, "uri", "Leb/b;", "toCameraContractOptions", "(Ljava/lang/String;)Leb/b;", "Leb/g;", "toImageLibraryContractOptions", "()Leb/g;", BuildConfig.FLAVOR, "allowsEditing", "Z", "getAllowsEditing", "()Z", "setAllowsEditing", "(Z)V", "getAllowsEditing$annotations", "allowsMultipleSelection", "getAllowsMultipleSelection", "setAllowsMultipleSelection", "getAllowsMultipleSelection$annotations", BuildConfig.FLAVOR, "quality", "D", "getQuality", "()D", "setQuality", "(D)V", "getQuality$annotations", BuildConfig.FLAVOR, "selectionLimit", "I", "getSelectionLimit", "()I", "setSelectionLimit", "(I)V", "getSelectionLimit$annotations", "base64", "getBase64", "setBase64", "getBase64$annotations", "exif", "getExif", "setExif", "getExif$annotations", BuildConfig.FLAVOR, "Lexpo/modules/imagepicker/JSMediaTypes;", "mediaTypes", "[Lexpo/modules/imagepicker/JSMediaTypes;", "getMediaTypes", "()[Lexpo/modules/imagepicker/JSMediaTypes;", "setMediaTypes", "([Lexpo/modules/imagepicker/JSMediaTypes;)V", "getMediaTypes$annotations", "videoMaxDuration", "getVideoMaxDuration", "setVideoMaxDuration", "Lkotlin/Pair;", "aspect", "Lkotlin/Pair;", "getAspect", "()Lkotlin/Pair;", "setAspect", "(Lkotlin/Pair;)V", "getAspect$annotations", "Lexpo/modules/imagepicker/CameraType;", Keys.CAMERA_TYPE, "Lexpo/modules/imagepicker/CameraType;", "getCameraType", "()Lexpo/modules/imagepicker/CameraType;", "setCameraType", "(Lexpo/modules/imagepicker/CameraType;)V", "getCameraType$annotations", "legacy", "getLegacy", "getLegacy$annotations", "Lexpo/modules/imagepicker/MediaTypes;", "getNativeMediaTypes", "()Lexpo/modules/imagepicker/MediaTypes;", "nativeMediaTypes", "expo-image-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImagePickerOptions implements c, Serializable {
    private boolean allowsEditing;
    private boolean allowsMultipleSelection;
    private Pair<Integer, Integer> aspect;
    private boolean base64;
    private boolean exif;
    private final boolean legacy;
    private int selectionLimit;
    private int videoMaxDuration;
    private double quality = 1.0d;
    private JSMediaTypes[] mediaTypes = {JSMediaTypes.IMAGES};
    private CameraType cameraType = CameraType.BACK;

    @b
    public static /* synthetic */ void getAllowsEditing$annotations() {
    }

    @b
    public static /* synthetic */ void getAllowsMultipleSelection$annotations() {
    }

    @b
    public static /* synthetic */ void getAspect$annotations() {
    }

    @b
    public static /* synthetic */ void getBase64$annotations() {
    }

    @b
    public static /* synthetic */ void getCameraType$annotations() {
    }

    @b
    public static /* synthetic */ void getExif$annotations() {
    }

    @b
    public static /* synthetic */ void getLegacy$annotations() {
    }

    @b
    public static /* synthetic */ void getMediaTypes$annotations() {
    }

    @b
    public static /* synthetic */ void getQuality$annotations() {
    }

    @b
    public static /* synthetic */ void getSelectionLimit$annotations() {
    }

    public final boolean getAllowsEditing() {
        return this.allowsEditing;
    }

    public final boolean getAllowsMultipleSelection() {
        return this.allowsMultipleSelection;
    }

    public final Pair<Integer, Integer> getAspect() {
        return this.aspect;
    }

    public final boolean getBase64() {
        return this.base64;
    }

    public final CameraType getCameraType() {
        return this.cameraType;
    }

    public final boolean getExif() {
        return this.exif;
    }

    public final boolean getLegacy() {
        return this.legacy;
    }

    public final JSMediaTypes[] getMediaTypes() {
        return this.mediaTypes;
    }

    public final MediaTypes getNativeMediaTypes() {
        return MediaTypes.INSTANCE.a(this.mediaTypes);
    }

    public final double getQuality() {
        return this.quality;
    }

    public final int getSelectionLimit() {
        return this.selectionLimit;
    }

    public final int getVideoMaxDuration() {
        return this.videoMaxDuration;
    }

    public final void setAllowsEditing(boolean z10) {
        this.allowsEditing = z10;
    }

    public final void setAllowsMultipleSelection(boolean z10) {
        this.allowsMultipleSelection = z10;
    }

    public final void setAspect(Pair<Integer, Integer> pair) {
        this.aspect = pair;
    }

    public final void setBase64(boolean z10) {
        this.base64 = z10;
    }

    public final void setCameraType(CameraType cameraType) {
        Intrinsics.checkNotNullParameter(cameraType, "<set-?>");
        this.cameraType = cameraType;
    }

    public final void setExif(boolean z10) {
        this.exif = z10;
    }

    public final void setMediaTypes(JSMediaTypes[] jSMediaTypesArr) {
        Intrinsics.checkNotNullParameter(jSMediaTypesArr, "<set-?>");
        this.mediaTypes = jSMediaTypesArr;
    }

    public final void setQuality(double d10) {
        this.quality = d10;
    }

    public final void setSelectionLimit(int i10) {
        this.selectionLimit = i10;
    }

    public final void setVideoMaxDuration(int i10) {
        this.videoMaxDuration = i10;
    }

    public final eb.b toCameraContractOptions(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new eb.b(uri, this);
    }

    public final g toImageLibraryContractOptions() {
        return new g(this);
    }
}
