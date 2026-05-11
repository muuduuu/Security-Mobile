package expo.modules.imagepicker;

import Ab.b;
import Ab.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/imagepicker/ImagePickerResponse;", "LAb/c;", BuildConfig.FLAVOR, "canceled", BuildConfig.FLAVOR, "Lexpo/modules/imagepicker/ImagePickerAsset;", "assets", "<init>", "(ZLjava/util/List;)V", "Z", "getCanceled", "()Z", "getCanceled$annotations", "()V", "Ljava/util/List;", "getAssets", "()Ljava/util/List;", "getAssets$annotations", "expo-image-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImagePickerResponse implements c {
    private final List<ImagePickerAsset> assets;
    private final boolean canceled;

    /* JADX WARN: Multi-variable type inference failed */
    public ImagePickerResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @b
    public static /* synthetic */ void getAssets$annotations() {
    }

    @b
    public static /* synthetic */ void getCanceled$annotations() {
    }

    public final List<ImagePickerAsset> getAssets() {
        return this.assets;
    }

    public final boolean getCanceled() {
        return this.canceled;
    }

    public ImagePickerResponse(boolean z10, List<ImagePickerAsset> list) {
        this.canceled = z10;
        this.assets = list;
    }

    public /* synthetic */ ImagePickerResponse(boolean z10, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : list);
    }
}
