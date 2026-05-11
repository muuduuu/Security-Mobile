package co.hyperverge.hypersnapsdk.objects;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001*BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003JV\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0002\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/ConsentConfig;", BuildConfig.FLAVOR, "isEnabled", BuildConfig.FLAVOR, "scope", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "purpose", "tenure", "Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;", "privacyPolicy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPrivacyPolicy", "()Ljava/lang/String;", "setPrivacyPolicy", "(Ljava/lang/String;)V", "getPurpose", "()Ljava/util/List;", "setPurpose", "(Ljava/util/List;)V", "getScope", "setScope", "getTenure", "()Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;", "setTenure", "(Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;Ljava/lang/String;)Lco/hyperverge/hypersnapsdk/objects/ConsentConfig;", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", "Tenure", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ConsentConfig {
    private Boolean isEnabled;
    private String privacyPolicy;
    private List<String> purpose;
    private List<String> scope;
    private Tenure tenure;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure;", BuildConfig.FLAVOR, "expiresAt", "Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure$ExpiresAt;", "(Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure$ExpiresAt;)V", "getExpiresAt", "()Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure$ExpiresAt;", "setExpiresAt", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "ExpiresAt", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Tenure {
        private ExpiresAt expiresAt;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure$ExpiresAt;", BuildConfig.FLAVOR, "humanReadable", BuildConfig.FLAVOR, "machineTimestamp", BuildConfig.FLAVOR, "(Ljava/lang/String;Ljava/lang/Long;)V", "getHumanReadable", "()Ljava/lang/String;", "setHumanReadable", "(Ljava/lang/String;)V", "getMachineTimestamp", "()Ljava/lang/Long;", "setMachineTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lco/hyperverge/hypersnapsdk/objects/ConsentConfig$Tenure$ExpiresAt;", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "hypersnapsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final /* data */ class ExpiresAt {
            private String humanReadable;
            private Long machineTimestamp;

            /* JADX WARN: Multi-variable type inference failed */
            public ExpiresAt() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ ExpiresAt copy$default(ExpiresAt expiresAt, String str, Long l10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = expiresAt.humanReadable;
                }
                if ((i10 & 2) != 0) {
                    l10 = expiresAt.machineTimestamp;
                }
                return expiresAt.copy(str, l10);
            }

            /* renamed from: component1, reason: from getter */
            public final String getHumanReadable() {
                return this.humanReadable;
            }

            /* renamed from: component2, reason: from getter */
            public final Long getMachineTimestamp() {
                return this.machineTimestamp;
            }

            public final ExpiresAt copy(String humanReadable, Long machineTimestamp) {
                return new ExpiresAt(humanReadable, machineTimestamp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ExpiresAt)) {
                    return false;
                }
                ExpiresAt expiresAt = (ExpiresAt) other;
                return Intrinsics.b(this.humanReadable, expiresAt.humanReadable) && Intrinsics.b(this.machineTimestamp, expiresAt.machineTimestamp);
            }

            public final String getHumanReadable() {
                return this.humanReadable;
            }

            public final Long getMachineTimestamp() {
                return this.machineTimestamp;
            }

            public int hashCode() {
                String str = this.humanReadable;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Long l10 = this.machineTimestamp;
                return hashCode + (l10 != null ? l10.hashCode() : 0);
            }

            public final void setHumanReadable(String str) {
                this.humanReadable = str;
            }

            public final void setMachineTimestamp(Long l10) {
                this.machineTimestamp = l10;
            }

            public String toString() {
                return "ExpiresAt(humanReadable=" + this.humanReadable + ", machineTimestamp=" + this.machineTimestamp + ')';
            }

            public ExpiresAt(String str, Long l10) {
                this.humanReadable = str;
                this.machineTimestamp = l10;
            }

            public /* synthetic */ ExpiresAt(String str, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : l10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Tenure() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Tenure copy$default(Tenure tenure, ExpiresAt expiresAt, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                expiresAt = tenure.expiresAt;
            }
            return tenure.copy(expiresAt);
        }

        /* renamed from: component1, reason: from getter */
        public final ExpiresAt getExpiresAt() {
            return this.expiresAt;
        }

        public final Tenure copy(ExpiresAt expiresAt) {
            return new Tenure(expiresAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Tenure) && Intrinsics.b(this.expiresAt, ((Tenure) other).expiresAt);
        }

        public final ExpiresAt getExpiresAt() {
            return this.expiresAt;
        }

        public int hashCode() {
            ExpiresAt expiresAt = this.expiresAt;
            if (expiresAt == null) {
                return 0;
            }
            return expiresAt.hashCode();
        }

        public final void setExpiresAt(ExpiresAt expiresAt) {
            this.expiresAt = expiresAt;
        }

        public String toString() {
            return "Tenure(expiresAt=" + this.expiresAt + ')';
        }

        public Tenure(ExpiresAt expiresAt) {
            this.expiresAt = expiresAt;
        }

        public /* synthetic */ Tenure(ExpiresAt expiresAt, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : expiresAt);
        }
    }

    public ConsentConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ConsentConfig copy$default(ConsentConfig consentConfig, Boolean bool, List list, List list2, Tenure tenure, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = consentConfig.isEnabled;
        }
        if ((i10 & 2) != 0) {
            list = consentConfig.scope;
        }
        List list3 = list;
        if ((i10 & 4) != 0) {
            list2 = consentConfig.purpose;
        }
        List list4 = list2;
        if ((i10 & 8) != 0) {
            tenure = consentConfig.tenure;
        }
        Tenure tenure2 = tenure;
        if ((i10 & 16) != 0) {
            str = consentConfig.privacyPolicy;
        }
        return consentConfig.copy(bool, list3, list4, tenure2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final List<String> component2() {
        return this.scope;
    }

    public final List<String> component3() {
        return this.purpose;
    }

    /* renamed from: component4, reason: from getter */
    public final Tenure getTenure() {
        return this.tenure;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPrivacyPolicy() {
        return this.privacyPolicy;
    }

    public final ConsentConfig copy(Boolean isEnabled, List<String> scope, List<String> purpose, Tenure tenure, String privacyPolicy) {
        return new ConsentConfig(isEnabled, scope, purpose, tenure, privacyPolicy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentConfig)) {
            return false;
        }
        ConsentConfig consentConfig = (ConsentConfig) other;
        return Intrinsics.b(this.isEnabled, consentConfig.isEnabled) && Intrinsics.b(this.scope, consentConfig.scope) && Intrinsics.b(this.purpose, consentConfig.purpose) && Intrinsics.b(this.tenure, consentConfig.tenure) && Intrinsics.b(this.privacyPolicy, consentConfig.privacyPolicy);
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

    public final Tenure getTenure() {
        return this.tenure;
    }

    public int hashCode() {
        Boolean bool = this.isEnabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<String> list = this.scope;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.purpose;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Tenure tenure = this.tenure;
        int hashCode4 = (hashCode3 + (tenure == null ? 0 : tenure.hashCode())) * 31;
        String str = this.privacyPolicy;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(Boolean bool) {
        this.isEnabled = bool;
    }

    public final void setPrivacyPolicy(String str) {
        this.privacyPolicy = str;
    }

    public final void setPurpose(List<String> list) {
        this.purpose = list;
    }

    public final void setScope(List<String> list) {
        this.scope = list;
    }

    public final void setTenure(Tenure tenure) {
        this.tenure = tenure;
    }

    public String toString() {
        return "ConsentConfig(isEnabled=" + this.isEnabled + ", scope=" + this.scope + ", purpose=" + this.purpose + ", tenure=" + this.tenure + ", privacyPolicy=" + this.privacyPolicy + ')';
    }

    public ConsentConfig(Boolean bool, List<String> list, List<String> list2, Tenure tenure, String str) {
        this.isEnabled = bool;
        this.scope = list;
        this.purpose = list2;
        this.tenure = tenure;
        this.privacyPolicy = str;
    }

    public /* synthetic */ ConsentConfig(Boolean bool, List list, List list2, Tenure tenure, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : list2, (i10 & 8) != 0 ? null : tenure, (i10 & 16) != 0 ? null : str);
    }
}
