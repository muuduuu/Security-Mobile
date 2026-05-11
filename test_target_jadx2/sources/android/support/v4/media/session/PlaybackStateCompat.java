package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f12930a;

    /* renamed from: b, reason: collision with root package name */
    final long f12931b;

    /* renamed from: c, reason: collision with root package name */
    final long f12932c;

    /* renamed from: d, reason: collision with root package name */
    final float f12933d;

    /* renamed from: e, reason: collision with root package name */
    final long f12934e;

    /* renamed from: f, reason: collision with root package name */
    final int f12935f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f12936g;

    /* renamed from: h, reason: collision with root package name */
    final long f12937h;

    /* renamed from: i, reason: collision with root package name */
    List f12938i;

    /* renamed from: j, reason: collision with root package name */
    final long f12939j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f12940k;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f12941a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f12942b;

        /* renamed from: c, reason: collision with root package name */
        private final int f12943c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f12944d;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f12941a = parcel.readString();
            this.f12942b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f12943c = parcel.readInt();
            this.f12944d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f12942b) + ", mIcon=" + this.f12943c + ", mExtras=" + this.f12944d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f12941a);
            TextUtils.writeToParcel(this.f12942b, parcel, i10);
            parcel.writeInt(this.f12943c);
            parcel.writeBundle(this.f12944d);
        }
    }

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f12930a = parcel.readInt();
        this.f12931b = parcel.readLong();
        this.f12933d = parcel.readFloat();
        this.f12937h = parcel.readLong();
        this.f12932c = parcel.readLong();
        this.f12934e = parcel.readLong();
        this.f12936g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f12938i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f12939j = parcel.readLong();
        this.f12940k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f12935f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f12930a + ", position=" + this.f12931b + ", buffered position=" + this.f12932c + ", speed=" + this.f12933d + ", updated=" + this.f12937h + ", actions=" + this.f12934e + ", error code=" + this.f12935f + ", error message=" + this.f12936g + ", custom actions=" + this.f12938i + ", active item id=" + this.f12939j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12930a);
        parcel.writeLong(this.f12931b);
        parcel.writeFloat(this.f12933d);
        parcel.writeLong(this.f12937h);
        parcel.writeLong(this.f12932c);
        parcel.writeLong(this.f12934e);
        TextUtils.writeToParcel(this.f12936g, parcel, i10);
        parcel.writeTypedList(this.f12938i);
        parcel.writeLong(this.f12939j);
        parcel.writeBundle(this.f12940k);
        parcel.writeInt(this.f12935f);
    }
}
