package co.hyperverge.hypersnapsdk.objects;

import O8.c;
import co.hyperverge.hypersnapsdk.objects.ConsentConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003:;<BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u000fHÆ\u0003Je\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006="}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/Consent;", BuildConfig.FLAVOR, "timestamp", BuildConfig.FLAVOR, "deviceDetails", "Lco/hyperverge/hypersnapsdk/objects/Consent$DeviceDetails;", "scope", BuildConfig.FLAVOR, "purpose", "tenure", "Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;", "sdkVersion", "Lco/hyperverge/hypersnapsdk/objects/Consent$SDKVersion;", "privacyPolicy", "userAction", "Lco/hyperverge/hypersnapsdk/objects/Consent$UserAction;", "(Ljava/lang/String;Lco/hyperverge/hypersnapsdk/objects/Consent$DeviceDetails;Ljava/util/List;Ljava/util/List;Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;Lco/hyperverge/hypersnapsdk/objects/Consent$SDKVersion;Ljava/lang/String;Lco/hyperverge/hypersnapsdk/objects/Consent$UserAction;)V", "getDeviceDetails", "()Lco/hyperverge/hypersnapsdk/objects/Consent$DeviceDetails;", "setDeviceDetails", "(Lco/hyperverge/hypersnapsdk/objects/Consent$DeviceDetails;)V", "getPrivacyPolicy", "()Ljava/lang/String;", "setPrivacyPolicy", "(Ljava/lang/String;)V", "getPurpose", "()Ljava/util/List;", "setPurpose", "(Ljava/util/List;)V", "getScope", "setScope", "getSdkVersion", "()Lco/hyperverge/hypersnapsdk/objects/Consent$SDKVersion;", "setSdkVersion", "(Lco/hyperverge/hypersnapsdk/objects/Consent$SDKVersion;)V", "getTenure", "()Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;", "setTenure", "(Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;)V", "getTimestamp", "setTimestamp", "getUserAction", "()Lco/hyperverge/hypersnapsdk/objects/Consent$UserAction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "DeviceDetails", "SDKVersion", "UserAction", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Consent {
    private DeviceDetails deviceDetails;
    private String privacyPolicy;
    private List<String> purpose;
    private List<String> scope;
    private SDKVersion sdkVersion;
    private ConsentConfig.Tenure tenure;
    private String timestamp;
    private final UserAction userAction;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/Consent$DeviceDetails;", BuildConfig.FLAVOR, "os", BuildConfig.FLAVOR, "osVersion", "deviceType", "device", "deviceMake", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDevice", "()Ljava/lang/String;", "setDevice", "(Ljava/lang/String;)V", "getDeviceMake", "setDeviceMake", "getDeviceType", "setDeviceType", "getOs", "setOs", "getOsVersion", "setOsVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DeviceDetails {
        private String device;

        @c("device-make")
        private String deviceMake;
        private String deviceType;
        private String os;

        @c("os-version")
        private String osVersion;

        public DeviceDetails(String os, String osVersion, String deviceType, String device, String deviceMake) {
            Intrinsics.checkNotNullParameter(os, "os");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(deviceMake, "deviceMake");
            this.os = os;
            this.osVersion = osVersion;
            this.deviceType = deviceType;
            this.device = device;
            this.deviceMake = deviceMake;
        }

        public static /* synthetic */ DeviceDetails copy$default(DeviceDetails deviceDetails, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = deviceDetails.os;
            }
            if ((i10 & 2) != 0) {
                str2 = deviceDetails.osVersion;
            }
            String str6 = str2;
            if ((i10 & 4) != 0) {
                str3 = deviceDetails.deviceType;
            }
            String str7 = str3;
            if ((i10 & 8) != 0) {
                str4 = deviceDetails.device;
            }
            String str8 = str4;
            if ((i10 & 16) != 0) {
                str5 = deviceDetails.deviceMake;
            }
            return deviceDetails.copy(str, str6, str7, str8, str5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getOs() {
            return this.os;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOsVersion() {
            return this.osVersion;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeviceType() {
            return this.deviceType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getDevice() {
            return this.device;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDeviceMake() {
            return this.deviceMake;
        }

        public final DeviceDetails copy(String os, String osVersion, String deviceType, String device, String deviceMake) {
            Intrinsics.checkNotNullParameter(os, "os");
            Intrinsics.checkNotNullParameter(osVersion, "osVersion");
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(deviceMake, "deviceMake");
            return new DeviceDetails(os, osVersion, deviceType, device, deviceMake);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceDetails)) {
                return false;
            }
            DeviceDetails deviceDetails = (DeviceDetails) other;
            return Intrinsics.b(this.os, deviceDetails.os) && Intrinsics.b(this.osVersion, deviceDetails.osVersion) && Intrinsics.b(this.deviceType, deviceDetails.deviceType) && Intrinsics.b(this.device, deviceDetails.device) && Intrinsics.b(this.deviceMake, deviceDetails.deviceMake);
        }

        public final String getDevice() {
            return this.device;
        }

        public final String getDeviceMake() {
            return this.deviceMake;
        }

        public final String getDeviceType() {
            return this.deviceType;
        }

        public final String getOs() {
            return this.os;
        }

        public final String getOsVersion() {
            return this.osVersion;
        }

        public int hashCode() {
            return (((((((this.os.hashCode() * 31) + this.osVersion.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.device.hashCode()) * 31) + this.deviceMake.hashCode();
        }

        public final void setDevice(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.device = str;
        }

        public final void setDeviceMake(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceMake = str;
        }

        public final void setDeviceType(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceType = str;
        }

        public final void setOs(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.os = str;
        }

        public final void setOsVersion(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.osVersion = str;
        }

        public String toString() {
            return "DeviceDetails(os=" + this.os + ", osVersion=" + this.osVersion + ", deviceType=" + this.deviceType + ", device=" + this.device + ", deviceMake=" + this.deviceMake + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/Consent$SDKVersion;", BuildConfig.FLAVOR, "version", BuildConfig.FLAVOR, "(Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "setVersion", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SDKVersion {
        private String version;

        public SDKVersion(String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.version = version;
        }

        public static /* synthetic */ SDKVersion copy$default(SDKVersion sDKVersion, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = sDKVersion.version;
            }
            return sDKVersion.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        public final SDKVersion copy(String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new SDKVersion(version);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SDKVersion) && Intrinsics.b(this.version, ((SDKVersion) other).version);
        }

        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode();
        }

        public final void setVersion(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.version = str;
        }

        public String toString() {
            return "SDKVersion(version=" + this.version + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/Consent$UserAction;", BuildConfig.FLAVOR, "actionType", BuildConfig.FLAVOR, "actionTimestamp", "actionMethods", BuildConfig.FLAVOR, "Lco/hyperverge/hypersnapsdk/objects/Consent$UserAction$ActionMethod;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActionMethods", "()Ljava/util/List;", "getActionTimestamp", "()Ljava/lang/String;", "getActionType", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "ActionMethod", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UserAction {
        private final List<ActionMethod> actionMethods;
        private final String actionTimestamp;
        private final String actionType;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/Consent$UserAction$ActionMethod;", BuildConfig.FLAVOR, "methodType", BuildConfig.FLAVOR, "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getMethodType", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ActionMethod {
            private final String description;
            private final String methodType;

            public ActionMethod(String methodType, String description) {
                Intrinsics.checkNotNullParameter(methodType, "methodType");
                Intrinsics.checkNotNullParameter(description, "description");
                this.methodType = methodType;
                this.description = description;
            }

            public static /* synthetic */ ActionMethod copy$default(ActionMethod actionMethod, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = actionMethod.methodType;
                }
                if ((i10 & 2) != 0) {
                    str2 = actionMethod.description;
                }
                return actionMethod.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMethodType() {
                return this.methodType;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            public final ActionMethod copy(String methodType, String description) {
                Intrinsics.checkNotNullParameter(methodType, "methodType");
                Intrinsics.checkNotNullParameter(description, "description");
                return new ActionMethod(methodType, description);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionMethod)) {
                    return false;
                }
                ActionMethod actionMethod = (ActionMethod) other;
                return Intrinsics.b(this.methodType, actionMethod.methodType) && Intrinsics.b(this.description, actionMethod.description);
            }

            public final String getDescription() {
                return this.description;
            }

            public final String getMethodType() {
                return this.methodType;
            }

            public int hashCode() {
                return (this.methodType.hashCode() * 31) + this.description.hashCode();
            }

            public String toString() {
                return "ActionMethod(methodType=" + this.methodType + ", description=" + this.description + ')';
            }
        }

        public UserAction(String actionType, String actionTimestamp, List<ActionMethod> actionMethods) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(actionTimestamp, "actionTimestamp");
            Intrinsics.checkNotNullParameter(actionMethods, "actionMethods");
            this.actionType = actionType;
            this.actionTimestamp = actionTimestamp;
            this.actionMethods = actionMethods;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserAction copy$default(UserAction userAction, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = userAction.actionType;
            }
            if ((i10 & 2) != 0) {
                str2 = userAction.actionTimestamp;
            }
            if ((i10 & 4) != 0) {
                list = userAction.actionMethods;
            }
            return userAction.copy(str, str2, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getActionType() {
            return this.actionType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getActionTimestamp() {
            return this.actionTimestamp;
        }

        public final List<ActionMethod> component3() {
            return this.actionMethods;
        }

        public final UserAction copy(String actionType, String actionTimestamp, List<ActionMethod> actionMethods) {
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            Intrinsics.checkNotNullParameter(actionTimestamp, "actionTimestamp");
            Intrinsics.checkNotNullParameter(actionMethods, "actionMethods");
            return new UserAction(actionType, actionTimestamp, actionMethods);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserAction)) {
                return false;
            }
            UserAction userAction = (UserAction) other;
            return Intrinsics.b(this.actionType, userAction.actionType) && Intrinsics.b(this.actionTimestamp, userAction.actionTimestamp) && Intrinsics.b(this.actionMethods, userAction.actionMethods);
        }

        public final List<ActionMethod> getActionMethods() {
            return this.actionMethods;
        }

        public final String getActionTimestamp() {
            return this.actionTimestamp;
        }

        public final String getActionType() {
            return this.actionType;
        }

        public int hashCode() {
            return (((this.actionType.hashCode() * 31) + this.actionTimestamp.hashCode()) * 31) + this.actionMethods.hashCode();
        }

        public String toString() {
            return "UserAction(actionType=" + this.actionType + ", actionTimestamp=" + this.actionTimestamp + ", actionMethods=" + this.actionMethods + ')';
        }
    }

    public Consent(String timestamp, DeviceDetails deviceDetails, List<String> scope, List<String> purpose, ConsentConfig.Tenure tenure, SDKVersion sdkVersion, String privacyPolicy, UserAction userAction) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(deviceDetails, "deviceDetails");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(tenure, "tenure");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(privacyPolicy, "privacyPolicy");
        Intrinsics.checkNotNullParameter(userAction, "userAction");
        this.timestamp = timestamp;
        this.deviceDetails = deviceDetails;
        this.scope = scope;
        this.purpose = purpose;
        this.tenure = tenure;
        this.sdkVersion = sdkVersion;
        this.privacyPolicy = privacyPolicy;
        this.userAction = userAction;
    }

    /* renamed from: component1, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    public final List<String> component3() {
        return this.scope;
    }

    public final List<String> component4() {
        return this.purpose;
    }

    /* renamed from: component5, reason: from getter */
    public final ConsentConfig.Tenure getTenure() {
        return this.tenure;
    }

    /* renamed from: component6, reason: from getter */
    public final SDKVersion getSdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPrivacyPolicy() {
        return this.privacyPolicy;
    }

    /* renamed from: component8, reason: from getter */
    public final UserAction getUserAction() {
        return this.userAction;
    }

    public final Consent copy(String timestamp, DeviceDetails deviceDetails, List<String> scope, List<String> purpose, ConsentConfig.Tenure tenure, SDKVersion sdkVersion, String privacyPolicy, UserAction userAction) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(deviceDetails, "deviceDetails");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(tenure, "tenure");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(privacyPolicy, "privacyPolicy");
        Intrinsics.checkNotNullParameter(userAction, "userAction");
        return new Consent(timestamp, deviceDetails, scope, purpose, tenure, sdkVersion, privacyPolicy, userAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Consent)) {
            return false;
        }
        Consent consent = (Consent) other;
        return Intrinsics.b(this.timestamp, consent.timestamp) && Intrinsics.b(this.deviceDetails, consent.deviceDetails) && Intrinsics.b(this.scope, consent.scope) && Intrinsics.b(this.purpose, consent.purpose) && Intrinsics.b(this.tenure, consent.tenure) && Intrinsics.b(this.sdkVersion, consent.sdkVersion) && Intrinsics.b(this.privacyPolicy, consent.privacyPolicy) && Intrinsics.b(this.userAction, consent.userAction);
    }

    public final DeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    public final String getPrivacyPolicy() {
        return this.privacyPolicy;
    }

    public final List<String> getPurpose() {
        return this.purpose;
    }

    public final List<String> getScope() {
        return this.scope;
    }

    public final SDKVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public final ConsentConfig.Tenure getTenure() {
        return this.tenure;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final UserAction getUserAction() {
        return this.userAction;
    }

    public int hashCode() {
        return (((((((((((((this.timestamp.hashCode() * 31) + this.deviceDetails.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.purpose.hashCode()) * 31) + this.tenure.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + this.privacyPolicy.hashCode()) * 31) + this.userAction.hashCode();
    }

    public final void setDeviceDetails(DeviceDetails deviceDetails) {
        Intrinsics.checkNotNullParameter(deviceDetails, "<set-?>");
        this.deviceDetails = deviceDetails;
    }

    public final void setPrivacyPolicy(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.privacyPolicy = str;
    }

    public final void setPurpose(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.purpose = list;
    }

    public final void setScope(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.scope = list;
    }

    public final void setSdkVersion(SDKVersion sDKVersion) {
        Intrinsics.checkNotNullParameter(sDKVersion, "<set-?>");
        this.sdkVersion = sDKVersion;
    }

    public final void setTenure(ConsentConfig.Tenure tenure) {
        Intrinsics.checkNotNullParameter(tenure, "<set-?>");
        this.tenure = tenure;
    }

    public final void setTimestamp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timestamp = str;
    }

    public String toString() {
        return "Consent(timestamp=" + this.timestamp + ", deviceDetails=" + this.deviceDetails + ", scope=" + this.scope + ", purpose=" + this.purpose + ", tenure=" + this.tenure + ", sdkVersion=" + this.sdkVersion + ", privacyPolicy=" + this.privacyPolicy + ", userAction=" + this.userAction + ')';
    }
}
