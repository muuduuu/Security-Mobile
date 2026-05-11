package F2;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.canhub.cropper.CropImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class e extends CropImageView.c implements Parcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final b f2277k = new b(null);
    public static final Parcelable.Creator<e> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new e(in);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i10, Rect rect2, int i11) {
        super(null, uri, null, uri2, exc, fArr, rect, rect2, i10, i11);
        Intrinsics.d(fArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(d(), i10);
        dest.writeParcelable(g(), i10);
        dest.writeSerializable(c());
        dest.writeFloatArray(a());
        dest.writeParcelable(b(), i10);
        dest.writeParcelable(h(), i10);
        dest.writeInt(e());
        dest.writeInt(f());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected e(Parcel in) {
        super(null, r4, null, r6, r7, r8, (Rect) in.readParcelable(Rect.class.getClassLoader()), (Rect) in.readParcelable(Rect.class.getClassLoader()), in.readInt(), in.readInt());
        Intrinsics.checkNotNullParameter(in, "in");
        Uri uri = (Uri) in.readParcelable(Uri.class.getClassLoader());
        Uri uri2 = (Uri) in.readParcelable(Uri.class.getClassLoader());
        Exception exc = (Exception) in.readSerializable();
        float[] createFloatArray = in.createFloatArray();
        Intrinsics.d(createFloatArray);
    }
}
