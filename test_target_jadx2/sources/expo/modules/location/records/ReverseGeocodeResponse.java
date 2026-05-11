package expo.modules.location.records;

import Ab.b;
import Ab.c;
import android.location.Address;
import com.appsflyer.AdRevenueScheme;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;
import u5.C4870a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b-\b\u0000\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001>B}\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R*\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R*\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0015\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R*\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\u0015\u0012\u0004\b$\u0010\u001b\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R*\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u0010\u0015\u0012\u0004\b'\u0010\u001b\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R*\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u0015\u0012\u0004\b*\u0010\u001b\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R*\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u0015\u0012\u0004\b-\u0010\u001b\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R*\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b0\u0010\u001b\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R*\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010\u0015\u0012\u0004\b3\u0010\u001b\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019R(\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u0015\u0012\u0004\b6\u0010\u001b\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019R*\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000e\u0010\u0015\u0012\u0004\b9\u0010\u001b\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u0019R*\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0015\u0012\u0004\b<\u0010\u001b\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u0019¨\u0006?"}, d2 = {"Lexpo/modules/location/records/ReverseGeocodeResponse;", "LAb/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "city", "district", "streetNumber", "street", "region", "subregion", AdRevenueScheme.COUNTRY, "postalCode", "name", "isoCountryCode", "timezone", "formattedAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/location/Address;", "address", "(Landroid/location/Address;)V", "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "getCity$annotations", "()V", "getDistrict", "setDistrict", "getDistrict$annotations", "getStreetNumber", "setStreetNumber", "getStreetNumber$annotations", "getStreet", "setStreet", "getStreet$annotations", "getRegion", "setRegion", "getRegion$annotations", "getSubregion", "setSubregion", "getSubregion$annotations", "getCountry", "setCountry", "getCountry$annotations", "getPostalCode", "setPostalCode", "getPostalCode$annotations", "getName", "setName", "getName$annotations", "getIsoCountryCode", "setIsoCountryCode", "getIsoCountryCode$annotations", "getTimezone", "setTimezone", "getTimezone$annotations", "getFormattedAddress", "setFormattedAddress", "getFormattedAddress$annotations", "Companion", C4870a.f43493a, "expo-location_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReverseGeocodeResponse implements c, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String city;
    private String country;
    private String district;
    private String formattedAddress;
    private String isoCountryCode;
    private String name;
    private String postalCode;
    private String region;
    private String street;
    private String streetNumber;
    private String subregion;
    private String timezone;

    /* renamed from: expo.modules.location.records.ReverseGeocodeResponse$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Address address) {
            Intrinsics.checkNotNullParameter(address, "address");
            if (address.getMaxAddressLineIndex() == -1) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            int maxAddressLineIndex = address.getMaxAddressLineIndex();
            if (maxAddressLineIndex >= 0) {
                int i10 = 0;
                while (true) {
                    sb2.append(address.getAddressLine(i10));
                    if (i10 < address.getMaxAddressLineIndex()) {
                        sb2.append(", ");
                    }
                    if (i10 == maxAddressLineIndex) {
                        break;
                    }
                    i10++;
                }
            }
            return sb2.toString();
        }

        private Companion() {
        }
    }

    public ReverseGeocodeResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String isoCountryCode, String str10, String str11) {
        Intrinsics.checkNotNullParameter(isoCountryCode, "isoCountryCode");
        this.city = str;
        this.district = str2;
        this.streetNumber = str3;
        this.street = str4;
        this.region = str5;
        this.subregion = str6;
        this.country = str7;
        this.postalCode = str8;
        this.name = str9;
        this.isoCountryCode = isoCountryCode;
        this.timezone = str10;
        this.formattedAddress = str11;
    }

    @b
    public static /* synthetic */ void getCity$annotations() {
    }

    @b
    public static /* synthetic */ void getCountry$annotations() {
    }

    @b
    public static /* synthetic */ void getDistrict$annotations() {
    }

    @b
    public static /* synthetic */ void getFormattedAddress$annotations() {
    }

    @b
    public static /* synthetic */ void getIsoCountryCode$annotations() {
    }

    @b
    public static /* synthetic */ void getName$annotations() {
    }

    @b
    public static /* synthetic */ void getPostalCode$annotations() {
    }

    @b
    public static /* synthetic */ void getRegion$annotations() {
    }

    @b
    public static /* synthetic */ void getStreet$annotations() {
    }

    @b
    public static /* synthetic */ void getStreetNumber$annotations() {
    }

    @b
    public static /* synthetic */ void getSubregion$annotations() {
    }

    @b
    public static /* synthetic */ void getTimezone$annotations() {
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    public final String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getStreetNumber() {
        return this.streetNumber;
    }

    public final String getSubregion() {
        return this.subregion;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final void setDistrict(String str) {
        this.district = str;
    }

    public final void setFormattedAddress(String str) {
        this.formattedAddress = str;
    }

    public final void setIsoCountryCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isoCountryCode = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final void setStreet(String str) {
        this.street = str;
    }

    public final void setStreetNumber(String str) {
        this.streetNumber = str;
    }

    public final void setSubregion(String str) {
        this.subregion = str;
    }

    public final void setTimezone(String str) {
        this.timezone = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReverseGeocodeResponse(Address address) {
        this(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, null, INSTANCE.a(address));
        Intrinsics.checkNotNullParameter(address, "address");
        String locality = address.getLocality();
        String subLocality = address.getSubLocality();
        String subThoroughfare = address.getSubThoroughfare();
        String thoroughfare = address.getThoroughfare();
        String adminArea = address.getAdminArea();
        String subAdminArea = address.getSubAdminArea();
        String countryName = address.getCountryName();
        String postalCode = address.getPostalCode();
        String featureName = address.getFeatureName();
        String countryCode = address.getCountryCode();
        Intrinsics.checkNotNullExpressionValue(countryCode, "getCountryCode(...)");
    }
}
