package com.groww.ems.EventRequestV2;

import com.google.protobuf.AbstractC2891w;
import com.google.protobuf.O;
import com.google.protobuf.W;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class EventRequestV2OuterClass$DeviceContext extends AbstractC2891w implements O {
    private static final EventRequestV2OuterClass$DeviceContext DEFAULT_INSTANCE;
    private static volatile W PARSER;
    private long appVersionCode_;
    private int bitField0_;
    private long launchTs_;
    private String deviceId_ = BuildConfig.FLAVOR;
    private String osName_ = BuildConfig.FLAVOR;
    private String osVersion_ = BuildConfig.FLAVOR;
    private String manufacturer_ = BuildConfig.FLAVOR;
    private String model_ = BuildConfig.FLAVOR;
    private String carrier_ = BuildConfig.FLAVOR;
    private String networkType_ = BuildConfig.FLAVOR;
    private String sdkVersion_ = BuildConfig.FLAVOR;
    private String appVersionName_ = BuildConfig.FLAVOR;
    private String ip_ = BuildConfig.FLAVOR;
    private String deviceIdV1_ = BuildConfig.FLAVOR;
    private String appPackageName_ = BuildConfig.FLAVOR;
    private String carrierType_ = BuildConfig.FLAVOR;

    public static final class a extends AbstractC2891w.a implements O {
        /* synthetic */ a(com.groww.ems.EventRequestV2.a aVar) {
            this();
        }

        public a A(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setModel(str);
            return this;
        }

        public a B(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setNetworkType(str);
            return this;
        }

        public a C(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setOsName(str);
            return this;
        }

        public a D(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setOsVersion(str);
            return this;
        }

        public a E(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setSdkVersion(str);
            return this;
        }

        public a o(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setAppPackageName(str);
            return this;
        }

        public a p(long j10) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setAppVersionCode(j10);
            return this;
        }

        public a q(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setAppVersionName(str);
            return this;
        }

        public a s(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setCarrier(str);
            return this;
        }

        public a v(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setCarrierType(str);
            return this;
        }

        public a w(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setDeviceId(str);
            return this;
        }

        public a x(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setDeviceIdV1(str);
            return this;
        }

        public a y(long j10) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setLaunchTs(j10);
            return this;
        }

        public a z(String str) {
            i();
            ((EventRequestV2OuterClass$DeviceContext) this.f28816b).setManufacturer(str);
            return this;
        }

        private a() {
            super(EventRequestV2OuterClass$DeviceContext.DEFAULT_INSTANCE);
        }
    }

    static {
        EventRequestV2OuterClass$DeviceContext eventRequestV2OuterClass$DeviceContext = new EventRequestV2OuterClass$DeviceContext();
        DEFAULT_INSTANCE = eventRequestV2OuterClass$DeviceContext;
        AbstractC2891w.registerDefaultInstance(EventRequestV2OuterClass$DeviceContext.class, eventRequestV2OuterClass$DeviceContext);
    }

    private EventRequestV2OuterClass$DeviceContext() {
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.appPackageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionCode(long j10) {
        this.appVersionCode_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionName(String str) {
        str.getClass();
        this.appVersionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarrier(String str) {
        str.getClass();
        this.carrier_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCarrierType(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.carrierType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        str.getClass();
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdV1(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.deviceIdV1_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchTs(long j10) {
        this.bitField0_ |= 4;
        this.launchTs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManufacturer(String str) {
        str.getClass();
        this.manufacturer_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkType(String str) {
        str.getClass();
        this.networkType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsName(String str) {
        str.getClass();
        this.osName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        str.getClass();
        this.sdkVersion_ = str;
    }

    @Override // com.google.protobuf.AbstractC2891w
    protected final Object dynamicMethod(AbstractC2891w.d dVar, Object obj, Object obj2) {
        com.groww.ems.EventRequestV2.a aVar = null;
        switch (com.groww.ems.EventRequestV2.a.f28826a[dVar.ordinal()]) {
            case 1:
                return new EventRequestV2OuterClass$DeviceContext();
            case 2:
                return new a(aVar);
            case 3:
                return AbstractC2891w.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\n\u0002\u000bለ\u0000\fለ\u0001\u000eဂ\u0002\u000fለ\u0003\u0010ለ\u0004", new Object[]{"bitField0_", "deviceId_", "osName_", "osVersion_", "manufacturer_", "model_", "carrier_", "networkType_", "sdkVersion_", "appVersionName_", "appVersionCode_", "ip_", "deviceIdV1_", "launchTs_", "appPackageName_", "carrierType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                W w10 = PARSER;
                if (w10 == null) {
                    synchronized (EventRequestV2OuterClass$DeviceContext.class) {
                        try {
                            w10 = PARSER;
                            if (w10 == null) {
                                w10 = new AbstractC2891w.b(DEFAULT_INSTANCE);
                                PARSER = w10;
                            }
                        } finally {
                        }
                    }
                }
                return w10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
